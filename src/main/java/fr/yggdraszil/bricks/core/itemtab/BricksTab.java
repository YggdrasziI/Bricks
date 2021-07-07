package fr.yggdraszil.bricks.core.itemtab;

import fr.yggdraszil.bricks.core.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BricksTab extends ItemGroup
{
    public static final BricksTab BRICKS_MOD = new BricksTab(ItemGroup.getGroupCountSafe(), "bricks_mod");

    public BricksTab(int p_i1853_1_, String p_i1853_2_)
    {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(BlockInit.MAGMA_RED_BRICKS.get());
    }
}
