package fr.yggdraszil.bricks.core.itemtab;

import fr.yggdraszil.bricks.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BricksCombatTab extends ItemGroup
{
    public static final BricksCombatTab BRICKSCOMBAT_MOD = new BricksCombatTab(ItemGroup.getGroupCountSafe(), "brickscombat_mod");

    public BricksCombatTab(int p_i1853_1_, String p_i1853_2_)
    {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(ItemInit.ALLABOGDANITE_SWORD.get());
    }
}
