package io.github.schntgaispock.rrshowcase.core;

import java.util.List;
import java.util.Optional;

import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.inventory.ItemStack;

import io.github.schntgaispock.rrshowcase.RRShowcase;
import io.github.schntgaispock.rrshowcase.api.items.NewSlimefunItem;
import io.github.schntgaispock.rrshowcase.api.items.crafters.GUICrafter;
import io.github.schntgaispock.rrshowcase.core.slimefun.ItemGroups;
import io.github.schntgaispock.rrshowcase.core.slimefun.ItemStacks;
import io.github.schntgaispock.rrshowcase.core.slimefun.RecipeTypes;
import io.github.thebusybiscuit.slimefun4.api.recipes.Recipe;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeInput;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeOutput;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.recipes.items.RecipeInputItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.items.RecipeInputTag;
import io.github.thebusybiscuit.slimefun4.api.recipes.matching.MatchProcedure;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;

public final class ItemSetup {

    public static void setup() {
        final RRShowcase pl = RRShowcase.getInstance();

        ItemGroups.MAIN.register(pl);

        new GUICrafter(ItemGroups.BASIC_MACHINES, ItemStacks.BASIC_CRAFTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.CRAFTING_TABLE), new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS),
        }, RecipeTypes.CRAFTING).register(pl);

        new GUICrafter(ItemGroups.BASIC_MACHINES, ItemStacks.BASIC_SMELTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.BLAST_FURNACE), new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS),
        }, RecipeTypes.SMELTING).register(pl);

        new GUICrafter(ItemGroups.BASIC_MACHINES, ItemStacks.COOKING_FURNACE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.SMOKER), new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS),
        }, RecipeTypes.COOKING).register(pl);

        new GUICrafter(ItemGroups.BASIC_MACHINES, ItemStacks.ALL_IN_ONE_FURNACE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.FURNACE), new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS),
        }, RecipeTypes.SMELTING, RecipeTypes.COOKING).register(pl);

        new GUICrafter(ItemGroups.BASIC_MACHINES, ItemStacks.ALTAR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.ENCHANTING_TABLE), new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.OAK_PLANKS),
        }, RecipeTypes.ALTAR).register(pl);

        // Basic crafting recipes

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.SMALL_BLOCK_OF_STEEL, RecipeTypes.CRAFTING, new ItemStack[] {
            SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT, null,
            SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT, null,
            null, null, null,
        }).register(pl);

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.STEEL_AXE, RecipeTypes.CRAFTING, new ItemStack[] {
            SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT, null,
            SlimefunItems.STEEL_INGOT, new ItemStack(Material.STICK), null,
            null, new ItemStack(Material.STICK), null,
        }, MatchProcedure.SHAPED_FLIPPABLE).register(pl);

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.STEEL_WIRE, RecipeTypes.CRAFTING, new ItemStack[] {
            null, null, null,
            SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_INGOT,
            null, null, null,
        }).register(pl);

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.STEEL_NUGGET, RecipeTypes.CRAFTING, new ItemStack[] {
            null, null, null,
            null, SlimefunItems.STEEL_INGOT, null,
            null, null, null,
        }).register(pl);

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.ASSORTED_DUST, RecipeTypes.CRAFTING, new ItemStack[] {
            SlimefunItems.IRON_DUST, SlimefunItems.GOLD_DUST, SlimefunItems.SILVER_DUST,
            SlimefunItems.TIN_DUST, null, null,
            null, null, null,
        }, MatchProcedure.SHAPELESS).register(pl);

        // Smelting recipes

        // TODO: Kind of a pain to write out, maybe a builder?
        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.PIG_IRON, RecipeTypes.SMELTING, new Recipe(
            Optional.empty(),
                "other_recipes",
                new RecipeInput(
                List.of(
                    RecipeInputItem.EMPTY, RecipeInputItem.EMPTY, RecipeInputItem.EMPTY,
                    RecipeInputItem.EMPTY, new RecipeInputTag(Tag.IRON_ORES, 2), RecipeInputItem.EMPTY,
                    RecipeInputItem.EMPTY, RecipeInputItem.EMPTY, RecipeInputItem.EMPTY
                ),
                MatchProcedure.SUBSET
            ),
            RecipeOutput.fromItemStacks(new ItemStack[] { ItemStacks.PIG_IRON }),
            List.of(RecipeTypes.SMELTING),
            Optional.empty(),
            Optional.empty(),
            List.of()
        )).register(pl);

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.SLIME_ALLOY_INGOT, RecipeTypes.SMELTING, new ItemStack[] {
            new ItemStack(Material.SLIME_BALL), SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.CARBON,
            null, null, null,
            null, null, null
        }).register(pl);

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.SLIME_INGOT, RecipeTypes.SMELTING, new ItemStack[] {
            null, null, null,
            null, new ItemStack(Material.SLIME_BALL), null,
            null, null, null
        }).register(pl);

        // Cooking recipes

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.PIZZA, RecipeTypes.COOKING, new ItemStack[] {
            null, new ItemStack(Material.COOKED_PORKCHOP), null,
            SlimefunItems.CHEESE, SlimefunItems.CHEESE, SlimefunItems.CHEESE,
            SlimefunItems.WHEAT_FLOUR, SlimefunItems.WHEAT_FLOUR, SlimefunItems.WHEAT_FLOUR,
        }, MatchProcedure.SHAPED).register(pl);

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.APPLE_PIE, RecipeTypes.COOKING, new ItemStack[] {
            new ItemStack(Material.APPLE), new ItemStack(Material.COOKED_PORKCHOP), new ItemStack(Material.SUGAR),
            null, null, null,
            null, null, null,
        }).register(pl);

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.BEEF_STEW, RecipeTypes.COOKING, new ItemStack[] {
            new ItemStack(Material.COOKED_BEEF), new ItemStack(Material.CARROT, 2), new ItemStack(Material.WATER_BUCKET),
            new ItemStack(Material.POTATO, 2), new ItemStack(Material.BOWL), null,
            null, null, null,
        }, new ItemStack[] { ItemStacks.BEEF_STEW, new ItemStack(Material.BUCKET) }).register(pl);

        // Altar Recipes

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.ALTAR_RECIPE_1, RecipeTypes.ALTAR, new ItemStack[] {
            new ItemStack(Material.RED_WOOL), new ItemStack(Material.ORANGE_WOOL), new ItemStack(Material.YELLOW_WOOL),
            new ItemStack(Material.LIME_WOOL), new ItemStack(Material.STRING, 8), new ItemStack(Material.GREEN_WOOL),
            new ItemStack(Material.LIGHT_BLUE_WOOL), new ItemStack(Material.BLUE_WOOL), new ItemStack(Material.PURPLE_WOOL),
        }).register(pl);

        new NewSlimefunItem(ItemGroups.ITEMS, ItemStacks.ALTAR_RECIPE_2, RecipeTypes.ALTAR, new ItemStack[] {
            new ItemStack(Material.IRON_INGOT, 8), null, new ItemStack(Material.IRON_INGOT),
            null, new ItemStack(Material.IRON_BLOCK, 2), null,
            new ItemStack(Material.IRON_INGOT), null, new ItemStack(Material.IRON_INGOT),
        }).register(pl);


    }
    
}
