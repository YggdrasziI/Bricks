package fr.yggdraszil.bricks.core.init;

import fr.yggdraszil.bricks.BricksMod;
import fr.yggdraszil.bricks.core.itemtab.BricksCombatTab;
import fr.yggdraszil.bricks.core.itemtab.BricksItemsTab;
import fr.yggdraszil.bricks.core.itemtab.BricksToolsTab;
import fr.yggdraszil.bricks.core.material.CustomArmorMaterial;
import fr.yggdraszil.bricks.core.material.CustomToolMaterial;
import fr.yggdraszil.bricks.objects.items.ToolBricksShears;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BricksMod.MOD_ID);

    public static final RegistryObject<Item> PINK_QUARTZ = ITEMS.register("pink_quartz", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));
    public static final RegistryObject<Item> GREEN_QUARTZ = ITEMS.register("green_quartz", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));
    public static final RegistryObject<Item> RED_QUARTZ = ITEMS.register("red_quartz", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));
    public static final RegistryObject<Item> SMOKY_QUARTZ = ITEMS.register("smoky_quartz", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));

    public static final RegistryObject<Item> WARPED_WART = ITEMS.register("warped_wart", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));

    public static final RegistryObject<Item> GLOW_BALL = ITEMS.register("glow_ball", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));
    public static final RegistryObject<Item> GLOWSTONE_BRICK = ITEMS.register("glowstone_brick", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));

    public static final RegistryObject<Item> CONDUCTIVE_DUST = ITEMS.register("conductive_dust", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));

    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));
    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));

    public static final RegistryObject<Item> ALLABOGDANITE_INGOT = ITEMS.register("allabogdanite_ingot", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));
    public static final RegistryObject<Item> ALLABOGDANITE_NUGGET = ITEMS.register("allabogdanite_nugget", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));
    
    public static final RegistryObject<Item> ASGARDIUM_INGOT = ITEMS.register("asgardium_ingot", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));
    public static final RegistryObject<Item> ASGARDIUM_NUGGET = ITEMS.register("asgardium_nugget", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));

    public static final RegistryObject<Item> YGGDRASIL_ALLOY = ITEMS.register("yggdrasil_alloy", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));
    public static final RegistryObject<Item> YGGDRASIL_INGOT = ITEMS.register("yggdrasil_ingot", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));
    public static final RegistryObject<Item> YGGDRASIL_NUGGET = ITEMS.register("yggdrasil_nugget", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));

    // Seeds
    public static final RegistryObject<Item> ORCHIDYE_SEEDS = ITEMS.register("orchidye_seeds", () -> new Item(new Item.Properties().tab(BricksItemsTab.BRICKSITEMS_MOD)));

    // Allabogdanite Stuff
    public static final RegistryObject<Item> ALLABOGDANITE_SWORD = ITEMS.register("allabogdanite_sword", () -> new SwordItem(CustomToolMaterial.ALLABOGDANITE_TOOL, 5, -2.4f, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> ALLABOGDANITE_AXE = ITEMS.register("allabogdanite_axe", () -> new AxeItem(CustomToolMaterial.ALLABOGDANITE_TOOL, 7, -3f, new Item.Properties().tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> ALLABOGDANITE_PICKAXE = ITEMS.register("allabogdanite_pickaxe", () -> new PickaxeItem(CustomToolMaterial.ALLABOGDANITE_TOOL, 3, -2.8f, new Item.Properties().tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> ALLABOGDANITE_SHOVEL = ITEMS.register("allabogdanite_shovel", () -> new ShovelItem(CustomToolMaterial.ALLABOGDANITE_TOOL, 3.5f, -3f, new Item.Properties().tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> ALLABOGDANITE_HOE = ITEMS.register("allabogdanite_hoe", () -> new HoeItem(CustomToolMaterial.ALLABOGDANITE_TOOL, -1, 0f, new Item.Properties().stacksTo(1).durability(2029).tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> ALLABOGDANITE_SHEARS = ITEMS.register("allabogdanite_shears", () -> new ToolBricksShears(new Item.Properties().stacksTo(1).durability(3096).tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    
    public static final RegistryObject<Item> ALLABOGDANITE_HELMET = ITEMS.register("allabogdanite_helmet", () -> new ArmorItem(CustomArmorMaterial.ALLABOGDANITE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> ALLABOGDANITE_CHESTPLATE = ITEMS.register("allabogdanite_chestplate", () -> new ArmorItem(CustomArmorMaterial.ALLABOGDANITE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> ALLABOGDANITE_LEGGINGS = ITEMS.register("allabogdanite_leggings", () -> new ArmorItem(CustomArmorMaterial.ALLABOGDANITE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> ALLABOGDANITE_BOOTS = ITEMS.register("allabogdanite_boots", () -> new ArmorItem(CustomArmorMaterial.ALLABOGDANITE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    
    // Asgardium Stuff
    public static final RegistryObject<Item> ASGARDIUM_SWORD = ITEMS.register("asgardium_sword", () -> new SwordItem(CustomToolMaterial.ASGARDIUM_TOOL, 3, -1.5f, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> ASGARDIUME_AXE = ITEMS.register("asgardium_axe", () -> new AxeItem(CustomToolMaterial.ASGARDIUM_TOOL, 5, -2.1f, new Item.Properties().tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> ASGARDIUM_PICKAXE = ITEMS.register("asgardium_pickaxe", () -> new PickaxeItem(CustomToolMaterial.ASGARDIUM_TOOL, 1, -1.9f, new Item.Properties().tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> ASGARDIUM_SHOVEL = ITEMS.register("asgardium_shovel", () -> new ShovelItem(CustomToolMaterial.ASGARDIUM_TOOL, 1.5f, -2.1f, new Item.Properties().tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> ASGARDIUM_HOE = ITEMS.register("asgardium_hoe", () -> new HoeItem(CustomToolMaterial.ASGARDIUM_TOOL, -3, 0.9f, new Item.Properties().tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> ASGARDIUM_SHEARS = ITEMS.register("asgardium_shears", () -> new ToolBricksShears(new Item.Properties().stacksTo(1).durability(4021).tab(BricksToolsTab.BRICKSTOOLS_MOD)));

    public static final RegistryObject<Item> ASGARDIUM_HELMET = ITEMS.register("asgardium_helmet", () -> new ArmorItem(CustomArmorMaterial.ASGARDIUM_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> ASGARDIUM_CHESTPLATE = ITEMS.register("asgardium_chestplate", () -> new ArmorItem(CustomArmorMaterial.ASGARDIUM_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> ASGARDIUM_LEGGINGS = ITEMS.register("asgardium_leggings", () -> new ArmorItem(CustomArmorMaterial.ASGARDIUM_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> ASGARDIUM_BOOTS = ITEMS.register("asgardium_boots", () -> new ArmorItem(CustomArmorMaterial.ASGARDIUM_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    
    // Yggdrasil Stuff
    public static final RegistryObject<Item> YGGDRASIL_SWORD = ITEMS.register("yggdrasil_sword", () -> new SwordItem(CustomToolMaterial.YGGDRASIL_TOOL, 12, -2f, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> YGGDRASIL_AXE = ITEMS.register("yggdrasil_axe", () -> new AxeItem(CustomToolMaterial.YGGDRASIL_TOOL, 14, -2.6f, new Item.Properties().tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> YGGDRASIL_PICKAXE = ITEMS.register("yggdrasil_pickaxe", () -> new PickaxeItem(CustomToolMaterial.YGGDRASIL_TOOL, 10, -2.4f, new Item.Properties().tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> YGGDRASIL_SHOVEL = ITEMS.register("yggdrasil_shovel", () -> new ShovelItem(CustomToolMaterial.YGGDRASIL_TOOL, 10.5f, -2.6f, new Item.Properties().tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> YGGDRASIL_HOE = ITEMS.register("yggdrasil_hoe", () -> new HoeItem(CustomToolMaterial.YGGDRASIL_TOOL, 6, 0.4f, new Item.Properties().tab(BricksToolsTab.BRICKSTOOLS_MOD)));
    public static final RegistryObject<Item> YGGDRASIL_SHEARS = ITEMS.register("yggdrasil_shears", () -> new ToolBricksShears(new Item.Properties().stacksTo(1).durability(5052).tab(BricksToolsTab.BRICKSTOOLS_MOD)));

    public static final RegistryObject<Item> YGGDRASIL_HELMET = ITEMS.register("yggdrasil_helmet", () -> new ArmorItem(CustomArmorMaterial.YGGDRASIL_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> YGGDRASIL_CHESTPLATE = ITEMS.register("yggdrasil_chestplate", () -> new ArmorItem(CustomArmorMaterial.YGGDRASIL_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> YGGDRASIL_LEGGINGS = ITEMS.register("yggdrasil_leggings", () -> new ArmorItem(CustomArmorMaterial.YGGDRASIL_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
    public static final RegistryObject<Item> YGGDRASIL_BOOTS = ITEMS.register("yggdrasil_boots", () -> new ArmorItem(CustomArmorMaterial.YGGDRASIL_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(BricksCombatTab.BRICKSCOMBAT_MOD)));
}
