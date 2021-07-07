package fr.yggdraszil.bricks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.yggdraszil.bricks.core.init.BlockInit;
import fr.yggdraszil.bricks.core.init.FeatureInit;
import fr.yggdraszil.bricks.core.init.ItemInit;
import fr.yggdraszil.bricks.core.itemtab.BricksTab;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("bricks")
@Mod.EventBusSubscriber(modid = BricksMod.MOD_ID, bus = Bus.MOD)
public class BricksMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "bricks";

    public BricksMod()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::doClientStuff);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
        
    }

    private void doClientStuff(final FMLClientSetupEvent event) 
    {
        RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_FRAME.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_GLASS.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SUGAR_CANE_FRAME.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SUGAR_CANE_GLASS.get(), RenderType.cutout());
               
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_BLACK.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_BLUE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_BROWN.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_CYAN.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_GRAY.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_GREEN.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_LIGHT_BLUE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_LIGHT_GRAY.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_LIME.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_MAGENTA.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_ORANGE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_PINK.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_PURPLE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_RED.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_YELLOW.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.GLOW_GLASS_WHITE.get(), RenderType.translucent());
        
        RenderTypeLookup.setRenderLayer(BlockInit.SPAWNER_BLOCK.get(), RenderType.cutout());
        
        RenderTypeLookup.setRenderLayer(BlockInit.IRON_CAGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BLAZE_CAGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.BAMBOO_CAGE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SUGAR_CANE_CAGE.get(), RenderType.cutout());
        
        RenderTypeLookup.setRenderLayer(BlockInit.SCRIBE_GLASS.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SCRIBE_GLASS_VERTICAL_DOWN.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(BlockInit.SCRIBE_GLASS_VERTICAL_UP.get(), RenderType.cutout());
        
        RenderTypeLookup.setRenderLayer(BlockInit.QUARTZ_GLASS.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.QUARTZ_GLASS_PINK.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.QUARTZ_GLASS_RED.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.QUARTZ_GLASS_GREEN.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.QUARTZ_GLASS_SMOKY.get(), RenderType.translucent());
        
        RenderTypeLookup.setRenderLayer(BlockInit.CRYSTAL_BLUE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.CRYSTAL_GREEN.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.CRYSTAL_PINK.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.CRYSTAL_PURPLE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.CRYSTAL_WHITE.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(BlockInit.CRYSTAL_YELLOW.get(), RenderType.translucent());
        
    }


    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event)
    {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->
        {
            event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(BricksTab.BRICKS_MOD)).setRegistryName(block.getRegistryName()));
            
        });
    }
}