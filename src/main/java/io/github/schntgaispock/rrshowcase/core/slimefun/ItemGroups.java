package io.github.schntgaispock.rrshowcase.core.slimefun;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;

public final class ItemGroups {

    public static final SubGroup ITEMS = new SubGroup("items", ItemStacks.GUIDE_ITEMS);
    public static final SubGroup BASIC_MACHINES = new SubGroup("basic_machines", ItemStacks.GUIDE_BASIC_MACHINES);
    public static final SubGroup ELECTRIC_MACHINES = new SubGroup("electric_machines", ItemStacks.GUIDE_ELECTRIC_MACHINES);
    public static final MultiGroup MAIN = new MultiGroup("main", ItemStacks.GUIDE_MAIN, ITEMS, BASIC_MACHINES, ELECTRIC_MACHINES);

}