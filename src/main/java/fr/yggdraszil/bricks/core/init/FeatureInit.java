package fr.yggdraszil.bricks.core.init;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit
{

    public static void addOres(final BiomeLoadingEvent event)
    {
        // veinSize, minHeight, maxHeight, amount
        addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.QUARTZ_OVERWORLD_ORE.get().defaultBlockState(), 7, 20, 140, 20);
        addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.PINK_QUARTZ_ORE.get().defaultBlockState(), 7, 20, 140, 20);
        addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.GREEN_QUARTZ_ORE.get().defaultBlockState(), 7, 20, 140, 20);
        addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SMOKY_QUARTZ_ORE.get().defaultBlockState(), 7, 20, 140, 20);
        addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.RED_QUARTZ_ORE.get().defaultBlockState(), 7, 20, 140, 20);

        addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ALLABOGDANITE_ORE.get().defaultBlockState(), 2, 5, 10, 2);
        
        addOre(event, new BlockMatchRuleTest(Blocks.END_STONE), BlockInit.ASGARDIUM_ORE.get().defaultBlockState(), 3, 0, 70, 10);
        addOre(event, new BlockMatchRuleTest(Blocks.END_STONE), BlockInit.CRYSTAL_BLUE.get().defaultBlockState(), 10, 0, 70, 5);
        addOre(event, new BlockMatchRuleTest(Blocks.END_STONE), BlockInit.CRYSTAL_GREEN.get().defaultBlockState(), 10, 0, 70, 5);
        addOre(event, new BlockMatchRuleTest(Blocks.END_STONE), BlockInit.CRYSTAL_PINK.get().defaultBlockState(), 10, 0, 70, 5);
        addOre(event, new BlockMatchRuleTest(Blocks.END_STONE), BlockInit.CRYSTAL_PURPLE.get().defaultBlockState(), 10, 0, 70, 5);
        addOre(event, new BlockMatchRuleTest(Blocks.END_STONE), BlockInit.CRYSTAL_WHITE.get().defaultBlockState(), 10, 0, 70, 5);
        addOre(event, new BlockMatchRuleTest(Blocks.END_STONE), BlockInit.CRYSTAL_YELLOW.get().defaultBlockState(), 10, 0, 70, 5);
        
        // Block / Replaced with
        // addOre(event, new BlockMatchRuleTest(BlockInit.ANDESITE_BORDERED.get()), BlockInit.ANDESITE_BRICKS.get().defaultBlockState(), 4, 0, 250, 20);
        // Allow spawn in minecraft tag (log, stone, etc)
        // addOre(event, new TagMatchRuleTest(BlockTags.LEAVES), BlockInit.ANDESITE_BRICKS.get().defaultBlockState(), 4, 0, 250, 20);

    }

    public static void addOre(final BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize, int minHeight, int maxHeight, int amount)
    {
        event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(new OreFeatureConfig(rule, state, veinSize)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight))).squared().count(amount));
    }

}