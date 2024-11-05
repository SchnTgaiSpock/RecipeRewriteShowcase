package io.github.schntgaispock.rrshowcase.api.items;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.Recipe;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.recipes.matching.MatchProcedure;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;

public class NewSlimefunItem extends SlimefunItem {
    
    public NewSlimefunItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, Recipe recipe) {
        super(itemGroup, item, recipeType, new ItemStack[9]); // TODO display
        Slimefun.getRecipeService().addRecipe(recipe);
    }
    
    public NewSlimefunItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        Slimefun.getRecipeService().addRecipe(Recipe.fromItemStacks(item.getItemId(), recipe, new ItemStack[] { item }, recipeType));
    }

    public NewSlimefunItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, ItemStack[] output) {
        super(itemGroup, item, recipeType, recipe, output[0]);
        Slimefun.getRecipeService().addRecipe(Recipe.fromItemStacks(item.getItemId(), recipe, output, recipeType));
    }
    
    public NewSlimefunItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, MatchProcedure match) {
        super(itemGroup, item, recipeType, recipe);
        Slimefun.getRecipeService().addRecipe(Recipe.fromItemStacks(item.getItemId(), recipe, new ItemStack[] { item }, recipeType, match));
    }

    public NewSlimefunItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, ItemStack[] output, MatchProcedure match) {
        super(itemGroup, item, recipeType, recipe, output[0]);
        Slimefun.getRecipeService().addRecipe(Recipe.fromItemStacks(item.getItemId(), recipe, output, recipeType, match));
    }

}
