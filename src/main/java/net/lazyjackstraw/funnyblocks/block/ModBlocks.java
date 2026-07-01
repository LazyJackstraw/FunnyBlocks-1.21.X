package net.lazyjackstraw.funnyblocks.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lazyjackstraw.funnyblocks.FunnyBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block ALLIUM_BLOCK = register("allium_block", Block::new, Block.Settings.create().strength(0.5f, 4.0f).sounds(BlockSoundGroup.FLOWERING_AZALEA));

    public static final Block BLANK_TERRACOTTA_BLOCK = register("blank_terracotta_block",
         Block::new, Block.Settings.create().strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE));

    public static final Block CAGE_BLOCK = register("cage_block",
            Block::new, Block.Settings.create().strength(3.0f).sounds(BlockSoundGroup.SOUL_SAND));

    public static final Block CANADIAN_BLOCK = register("canadian_block",
            Block::new, Block.Settings.create().strength(3.0f).sounds(BlockSoundGroup.FLOWERING_AZALEA));

    public static final Block CEILING_TILE_BLOCK = register("ceiling_tile_block",
            Block::new, Block.Settings.create().strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE_TILES));

    public static final RotatingBlock STAINED_CEILING_TILE_BLOCK = registerRotationalBlock("stained_ceiling_tile_block",
            RotatingBlock::new, RotatingBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE_TILES));

    public static final Block COCK_BLOCK = register("cock_block",
            Block::new, Block.Settings.create().strength(3.5f).sounds(BlockSoundGroup.NETHERITE));

    public static final Block CODE_BLOCK = register("code_block",
            Block::new, Block.Settings.create().strength(2.0f).sounds(BlockSoundGroup.POLISHED_TUFF));

    public static final Block COOKIE_BLOCK = register("cookie_block",
            Block::new, Block.Settings.create().strength(1.5f).sounds(BlockSoundGroup.ANCIENT_DEBRIS));

    public static final Block CONSTRUCTION_BLOCK = register("construction_block",
            Block::new, Block.Settings.create().strength(2.5f).sounds(BlockSoundGroup.STONE));

    public static final Block COSMIC_BLOCK = register("cosmic_block",
            Block::new, Block.Settings.create().strength(1.5f).sounds(BlockSoundGroup.WOOD));

    public static final Block DENIM_BLOCK = register("denim_block",
            Block::new, Block.Settings.create().strength(1.5f).sounds(BlockSoundGroup.WOOL));

    public static final Block GLITCH_BLOCK = register("glitch_block",
            Block::new, Block.Settings.create().strength(2.0f).sounds(BlockSoundGroup.SCAFFOLDING));

    public static final Block GOVERNMENT_AC_UNIT = register("government_ac_unit",
            Block::new, Block.Settings.create().strength(3.0f).sounds(BlockSoundGroup.HEAVY_CORE));

    public static final Block HEART_BLOCK = register("heart_block",
            Block::new, Block.Settings.create().strength(2.0f).sounds(BlockSoundGroup.BASALT));

    public static final Block LELIEL_BLOCK = register("leliel_block",
            Block::new, Block.Settings.create().strength(2.0f).sounds(BlockSoundGroup.HONEY));

    public static final Block LEOPARD_PRINT_BLOCK = register("leopard_print_block",
            Block::new, Block.Settings.create().strength(1.0f).sounds(BlockSoundGroup.WOOL));

    public static final Block LIMINAL_BLOCK = register("liminal_block",
            Block::new, Block.Settings.create().strength(1.0f).sounds(BlockSoundGroup.CORAL));

    public static final RotatingBlock NOKIA_PHONE_BLOCK = registerRotationalBlock("nokia_phone_block",
            RotatingBlock::new, RotatingBlock.Settings.create().strength(10.0F, 50.0F).requiresTool().sounds(BlockSoundGroup.HEAVY_CORE));

    public static final RotatingBlock PACKAGE_BLOCK = registerRotationalBlock("package_block",
            RotatingBlock::new, RotatingBlock.Settings.create().strength(2.0f).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));

    public static final Block PAPER_BLOCK = register("paper_block",
            Block::new, Block.Settings.create().strength(1.0f).sounds(BlockSoundGroup.BIG_DRIPLEAF));

    public static final Block POISONOUS_POTATO_BLOCK = register("poisonous_potato_block",
            Block::new, Block.Settings.create().strength(2.0f).sounds(BlockSoundGroup.CORAL));

    public static final Block RAINBOW_WOOL_BLOCK = register("rainbow_wool_block",
            Block::new, Block.Settings.create().strength(1.5f).sounds(BlockSoundGroup.WOOL));

    public static final Block ROTTEN_FLESH_BLOCK = register("rotten_flesh_block",
            Block::new, Block.Settings.create().strength(1.0f).sounds(BlockSoundGroup.SOUL_SOIL));

    public static final Block SPIDER_EYE_BLOCK = register("spider_eye_block",
            Block::new, Block.Settings.create().strength(1.0f).sounds(BlockSoundGroup.SOUL_SAND));

    public static final Block SUN_BLOCK = register("sun_block",
            Block::new, Block.Settings.create().strength(1.0f).sounds(BlockSoundGroup.BIG_DRIPLEAF));

    public static final Block WHEAT_SEED_BLOCK = register("wheat_seed_block",
            Block::new, Block.Settings.create().strength(0.5f).sounds(BlockSoundGroup.CROP));

    public static final Block WHITE_EGG_BLOCK = register("white_egg_block",
            Block::new, Block.Settings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT));

    public static final Block BLUE_EGG_BLOCK = register("blue_egg_block",
            Block::new, Block.Settings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT));

    public static final Block BROWN_EGG_BLOCK = register("brown_egg_block",
            Block::new, Block.Settings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT));

    // registers normal blocks, specific to 1.21.2
    private static Block register(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(FunnyBlocks.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }

    // registers normal blocks, specific to 1.21.2 (the blocks passed in MUST be RotatingBlocks)
    private static RotatingBlock registerRotationalBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(FunnyBlocks.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);

        return (RotatingBlock) block;
    }

    public static void registerModBlocks() {

        FunnyBlocks.LOGGER.info("Registering Mod Blocks for " + FunnyBlocks.MOD_ID);

        // Register the blocks in the Building Blocks tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            // add the blocks here

            entries.add(ModBlocks.ALLIUM_BLOCK);
            entries.add(ModBlocks.BLANK_TERRACOTTA_BLOCK);
            entries.add(ModBlocks.CAGE_BLOCK);
            entries.add(ModBlocks.CEILING_TILE_BLOCK);
            entries.add(ModBlocks.STAINED_CEILING_TILE_BLOCK);
            entries.add(ModBlocks.CANADIAN_BLOCK);
            entries.add(ModBlocks.COCK_BLOCK);
            entries.add(ModBlocks.CODE_BLOCK);
            entries.add(ModBlocks.CONSTRUCTION_BLOCK);
            entries.add(ModBlocks.COOKIE_BLOCK);
            entries.add(ModBlocks.COSMIC_BLOCK);
            entries.add(ModBlocks.DENIM_BLOCK);
            entries.add(ModBlocks.GLITCH_BLOCK);
            entries.add(ModBlocks.GOVERNMENT_AC_UNIT);
            entries.add(ModBlocks.HEART_BLOCK);
            entries.add(ModBlocks.LELIEL_BLOCK);
            entries.add(ModBlocks.LEOPARD_PRINT_BLOCK);
            entries.add(ModBlocks.LIMINAL_BLOCK);
            entries.add(ModBlocks.NOKIA_PHONE_BLOCK);
            entries.add(ModBlocks.PACKAGE_BLOCK);
            entries.add(ModBlocks.PAPER_BLOCK);
            entries.add(ModBlocks.POISONOUS_POTATO_BLOCK);
            entries.add(ModBlocks.RAINBOW_WOOL_BLOCK);
            entries.add(ModBlocks.ROTTEN_FLESH_BLOCK);
            entries.add(ModBlocks.SPIDER_EYE_BLOCK);
            entries.add(ModBlocks.SUN_BLOCK);
            entries.add(ModBlocks.WHEAT_SEED_BLOCK);
            entries.add(ModBlocks.WHITE_EGG_BLOCK);
            entries.add(ModBlocks.BLUE_EGG_BLOCK);
            entries.add(ModBlocks.BROWN_EGG_BLOCK);
        });
    }
}
