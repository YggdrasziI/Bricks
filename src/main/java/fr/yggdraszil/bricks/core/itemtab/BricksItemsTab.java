package fr.yggdraszil.bricks.core.itemtab;

import fr.yggdraszil.bricks.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BricksItemsTab extends ItemGroup
{
    public static final BricksItemsTab BRICKSITEMS_MOD = new BricksItemsTab(ItemGroup.getGroupCountSafe(), "bricksitems_mod");

    public BricksItemsTab(int p_i1853_1_, String p_i1853_2_)
    {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(ItemInit.PINK_QUARTZ.get());
    }
}
