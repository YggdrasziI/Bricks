package fr.yggdraszil.bricks.core.material;

import java.util.function.Supplier;

import fr.yggdraszil.bricks.core.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum CustomArmorMaterial implements IArmorMaterial
{
    //                          Durability *            Boots, Leggings, Chestplate, Helmet           Toughness, Knockback Resistance
    ALLABOGDANITE_ARMOR("allabogdanite", 4, new int[] {3, 6, 8, 3}, 8, SoundEvents.ARMOR_EQUIP_NETHERITE, 5f, 0.3f, () -> Ingredient.of(ItemInit.ALLABOGDANITE_INGOT.get())),
    ASGARDIUM_ARMOR("asgardium", 5, new int[] {8, 12, 16, 6}, 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 0f, 0f, () -> Ingredient.of(ItemInit.ASGARDIUM_INGOT.get())),
    YGGDRASIL_ARMOR("yggdrasil", 6, new int[] {12, 16, 20, 10}, 14, SoundEvents.ARMOR_EQUIP_NETHERITE, 8f, 0.5f, () -> Ingredient.of(ItemInit.YGGDRASIL_INGOT.get()));

    private static final int[] baseDurability = {128, 144, 160, 112};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] armorVal;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Ingredient repairIngredient;

    CustomArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient)
    {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.armorVal = armorVal;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient.get();

    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slot)
    {
        return baseDurability[slot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slot)
    {
        return this.armorVal[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairIngredient;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }
}
