package io.github.schntgaispock.rrshowcase.core.slimefun;

import io.github.schntgaispock.rrshowcase.RRShowcase;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.recipes.matching.MatchProcedure;

public final class RecipeTypes {

    public static final RecipeType CRAFTING = new RecipeType(RRShowcase.key("crafting"), ItemStacks.RECIPE_TYPE_CRAFTING, MatchProcedure.SHAPED);
    public static final RecipeType SMELTING = new RecipeType(RRShowcase.key("smelting"), ItemStacks.RECIPE_TYPE_SMELTING, MatchProcedure.SUBSET);
    public static final RecipeType COOKING = new RecipeType(RRShowcase.key("cooking"), ItemStacks.RECIPE_TYPE_COOKING, MatchProcedure.SHAPELESS);
    public static final RecipeType ALTAR = new RecipeType(RRShowcase.key("altar"), ItemStacks.RECIPE_TYPE_ALTAR, MatchProcedure.SHAPED_ROTATABLE_45_3X3);
    public static final RecipeType SIFTING = new RecipeType(RRShowcase.key("sifting"), ItemStacks.RECIPE_TYPE_SIFTING, MatchProcedure.SUBSET);
    
}
