package io.github.schntgaispock.rrshowcase.core.slimefun;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

public final class ItemStacks {

    public static final ItemStack GUIDE_MAIN = new CustomItemStack(Material.CRAFTING_TABLE, "&bRecipe Rewrite Showcase");
    public static final ItemStack GUIDE_ITEMS = new CustomItemStack(Material.IRON_INGOT, "&bItems");
    public static final ItemStack GUIDE_BASIC_MACHINES = new CustomItemStack(Material.CRAFTING_TABLE, "&bBasic Machines");
    public static final ItemStack GUIDE_ELECTRIC_MACHINES = new CustomItemStack(Material.FURNACE, "&bElectric Machines");

    public static final ItemStack RECIPE_TYPE_CRAFTING = new CustomItemStack(Material.CRAFTING_TABLE, "&bCrafting");
    public static final ItemStack RECIPE_TYPE_SMELTING = new CustomItemStack(Material.BLAST_FURNACE, "&bSmelting");
    public static final ItemStack RECIPE_TYPE_COOKING = new CustomItemStack(Material.FURNACE, "&bCooking");
    public static final ItemStack RECIPE_TYPE_ALTAR = new CustomItemStack(Material.ENCHANTING_TABLE, "&bAltar");
    public static final ItemStack RECIPE_TYPE_SIFTING = new CustomItemStack(Material.BOWL, "&bSifting");

    public static final SlimefunItemStack BASIC_CRAFTER = new SlimefunItemStack("BASIC_CRAFTER", Material.CRAFTING_TABLE,
        "&bBasic Crafter",
        "",
        "&7Crafts recipes that use the &bCrafting",
        "&7recipe type."
    );
    public static final SlimefunItemStack ITEM_FRAME_CRAFTER = new SlimefunItemStack("ITEM_FRAME_CRAFTER", Material.OBSERVER,
        "&bItem Frame Crafter",
        "",
        "&7Crafts recipes that use the &bCrafting",
        "&7recipe type. Place the inputs in a 3x3",
        "&7grid of item frames one block in front,",
        "with the crafter facing the bottom-middle",
        "frame"
    );
    public static final SlimefunItemStack CHEST_CRAFTER = new SlimefunItemStack("CHEST_CRAFTER", Material.PISTON,
        "&bChest Crafter",
        "",
        "&7Crafts recipes that use the &bCrafting",
        "&7recipe type. Place the inputs in a chest",
        "&7on top of this crafter."
    );
    public static final SlimefunItemStack BASIC_SMELTER = new SlimefunItemStack("BASIC_SMELTER", Material.BLAST_FURNACE,
        "&bBasic Smelter",
        "",
        "&7Crafts recipes that use the &bSmelting",
        "&7recipe type."
    );
    public static final SlimefunItemStack COOKING_FURNACE = new SlimefunItemStack("COOKING_FURNACE", Material.SMOKER,
        "&bCooking Furnace",
        "",
        "&7Crafts recipes that use the &bCooking",
        "&7recipe type."
    );
    public static final SlimefunItemStack ALL_IN_ONE_FURNACE = new SlimefunItemStack("ALL_IN_ONE_FURNACE", Material.FURNACE,
        "&bAll-in-one Furnace",
        "",
        "&7Crafts recipes that use either the",
        "&bSmelting &7or &bCooking &7recipe type."
    );
    public static final SlimefunItemStack ALTAR = new SlimefunItemStack("ALTAR", Material.ENCHANTING_TABLE,
        "&bAltar",
        "",
        "&7Crafts recipes that use the &bAltar",
        "&7recipe type."
    );
    
    public static final SlimefunItemStack SMALL_BLOCK_OF_STEEL = new SlimefunItemStack("SMALL_BLOCK_OF_STEEL", Material.IRON_BLOCK,
        "&bSmall Block of Steel"
    );
    public static final SlimefunItemStack STEEL_AXE = new SlimefunItemStack("STEEL_AXE", Material.IRON_AXE,
        "&bSteel Axe",
        "",
        "&7Recipe can be flipped"
    );
    public static final SlimefunItemStack STEEL_WIRE = new SlimefunItemStack("STEEL_WIRE", Material.STRING,
        "&bSteel Wire"
    );
    public static final SlimefunItemStack STEEL_NUGGET = new SlimefunItemStack("STEEL_NUGGET", Material.IRON_NUGGET,
        "&bSteel Nugget"
    );
    public static final SlimefunItemStack ASSORTED_DUST = new SlimefunItemStack("ASSORTED_DUST", Material.SUGAR,
        "&bAssorted Dust",
        "",
        "&7Shapeless recipe"
    );
    
    public static final SlimefunItemStack PIG_IRON = new SlimefunItemStack("PIG_IRON", Material.NETHERITE_INGOT,
        "&bPig Iron"
    );
    public static final SlimefunItemStack SLIME_INGOT = new SlimefunItemStack("SLIME_INGOT", Material.IRON_INGOT,
        "&aSlime Ingot"
    );
    public static final SlimefunItemStack SLIME_ALLOY_INGOT = new SlimefunItemStack("SLIME_ALLOY_INGOT", Material.NETHER_BRICK,
        "&aSlime Alloy Ingot"
    );

    public static final SlimefunItemStack PIZZA = new SlimefunItemStack("PIZZA", Material.BREAD,
        "&bPizza"
    );
    public static final SlimefunItemStack APPLE_PIE = new SlimefunItemStack("APPLE_PIE", Material.PUMPKIN_PIE,
        "&bApple Pie"
    );
    public static final SlimefunItemStack BEEF_STEW = new SlimefunItemStack("BEEF_STEW", Material.RABBIT_STEW,
        "&bBeef Stew"
    );
    
    public static final SlimefunItemStack ALTAR_RECIPE_1 = new SlimefunItemStack("ALTAR_RECIPE_1", Material.WHITE_WOOL,
        "&fAltar Recipe 1",
        "",
        "&7I'm running out of ideas"
    );
    
    public static final SlimefunItemStack ALTAR_RECIPE_2 = new SlimefunItemStack("ALTAR_RECIPE_2", Material.IRON_INGOT,
        "&fAltar Recipe 2",
        "",
        "&7I'm running out of ideas"
    );
}
