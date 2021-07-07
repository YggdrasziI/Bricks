package fr.yggdraszil.bricks.core.material;

import java.util.function.Supplier;

import fr.yggdraszil.bricks.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum CustomToolMaterial implements IItemTier
{
    //Harvest Level, Durability, Efficiency, Damage, Enchantability, Repair Material
    ALLABOGDANITE_TOOL(3, 3696, 12.0f, 3.0f, 8, () -> Ingredient.of(ItemInit.ALLABOGDANITE_INGOT.get())),
    ASGARDIUM_TOOL(4, 4121, 14.0f, 3.0f, 12, () -> Ingredient.of(ItemInit.ASGARDIUM_INGOT.get())),
    YGGDRASIL_TOOL(5, 5252, 16.0f, 3.0f, 14, () -> Ingredient.of(ItemInit.YGGDRASIL_INGOT.get()));
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;
    
    CustomToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial.get();
    }
    
    @Override
    public int getUses()
    {
        return this.maxUses;
    }
    @Override
    public float getSpeed()
    {
        return this.efficiency;
    }
    @Override
    public float getAttackDamageBonus()
    {
        return this.attackDamage;
    }
    @Override
    public int getLevel()
    {
        return this.harvestLevel;
    }
    @Override
    public int getEnchantmentValue()
    {
        return this.enchantability;
    }
    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairMaterial;
    }
}
