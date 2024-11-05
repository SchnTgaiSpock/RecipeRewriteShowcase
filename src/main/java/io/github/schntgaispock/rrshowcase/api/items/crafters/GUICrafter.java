package io.github.schntgaispock.rrshowcase.api.items.crafters;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinitylib.machines.MenuBlock;
import io.github.thebusybiscuit.slimefun4.api.recipes.Recipe;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeCrafter;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.AbstractRecipeOutput.Inserter;
import io.github.thebusybiscuit.slimefun4.api.recipes.matching.RecipeMatchResult;
import io.github.thebusybiscuit.slimefun4.api.recipes.matching.RecipeSearchResult;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;

public class GUICrafter extends MenuBlock implements RecipeCrafter {

    final List<RecipeType> types;

    public GUICrafter(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, RecipeType... types) {
        super(category, item, recipeType, recipe);
        this.types = List.of(types);

        Slimefun.getRecipeService().addRecipe(Recipe.fromItemStacks(item.getItemId(), recipe, new ItemStack[] { item }, recipeType));
    }

    private int[] inputBorder = {
        0,  1,  2,  3,  4,
        9,              13,
        18,             22,
        27,             31,
        36, 37, 38, 39, 40
    };
    private int[] inputSlots = {
        10, 11, 12,
        19, 20, 21,
        28, 29, 30
    };
    private int craftSlot = 44;
    private int[] outputBorder = {
        5,  6,  7,  8,
        14,         17,
        23, 24, 25, 26
    };
    private int[] outputSlots = {
        15, 16
    };
    private int[] background = {
        32, 33, 34, 35,
        41, 42, 43
    };

    @Override
    protected void setup(BlockMenuPreset preset) {
        preset.drawBackground(background);
        preset.drawBackground(INPUT_BORDER, inputBorder);
        preset.drawBackground(OUTPUT_BORDER, outputBorder);
        preset.drawBackground(new CustomItemStack(Material.LIME_STAINED_GLASS_PANE, "&aCraft"), new int[]{ craftSlot });
        preset.addMenuClickHandler(craftSlot, (p, slot, item, action) -> {
            System.out.println("======================================= Crafting");
            final Inventory inv = p.getOpenInventory().getTopInventory();
            final List<ItemStack> givenItems = Arrays
                .stream(inputSlots)
                .boxed()
                .map(i -> inv.getItem(i))
                .toList();
            final RecipeSearchResult result = searchRecipes(givenItems);

            System.out.println("STEEL_WIRE");
            System.out.println(Slimefun.getRecipeService().getRecipe("STEEL_WIRE"));
            System.out.println(Slimefun.getRecipeService().getRecipe("STEEL_WIRE").match(givenItems).itemsMatch());
            System.out.println("STEEL_AXE");
            System.out.println(Slimefun.getRecipeService().getRecipe("STEEL_AXE"));
            System.out.println(Slimefun.getRecipeService().getRecipe("STEEL_AXE").match(givenItems).itemsMatch());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(result.getRecipe());
            if (result.matchFound()) {
                final Recipe recipe = result.getRecipe().get();
                final RecipeMatchResult match = result.getResult().get();
                final Inserter inserter = recipe.getOutput().checkSpace(match, inv, outputSlots);
                if (inserter.getLeftovers().isEmpty()) {
                    inserter.insert();
                    match.getInputMatchResult().consumeItems(1);
                }
            }
            return false;
        });
    }

    @Override
    protected int[] getInputSlots() {
        return inputSlots;
    }

    @Override
    protected int[] getOutputSlots() {
        return outputSlots;
    }

    @Override
    public Collection<RecipeType> getCraftableRecipeTypes() {
        return types;
    }
    
}
