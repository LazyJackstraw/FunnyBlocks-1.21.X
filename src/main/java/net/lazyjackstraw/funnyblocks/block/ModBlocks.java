package net.lazyjackstraw.funnyblocks.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lazyjackstraw.funnyblocks.FunnyBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block ALLIUM_BLOCK = registerBlock("allium_block",
            properties -> new Block(properties.strength(.5f, 4.0f).sounds(BlockSoundGroup.FLOWERING_AZALEA)));

    public static final Block BLANK_TERRACOTTA_BLOCK = registerBlock("blank_terracotta_block",
         new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "blank_terracotta_block")))
                 .strength(1.5F, 6.0F).sounds(BlockSoundGroup.STONE)));

    public static final Block CAGE_BLOCK = registerBlock("cage_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "cage_block")))
                    .strength(3.0f).sounds(BlockSoundGroup.SOUL_SAND)));

    public static final Block CANADIAN_BLOCK = registerBlock("canadian_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "canadian_block")))
                    .strength(3.0f).sounds(BlockSoundGroup.FLOWERING_AZALEA)));

    public static final Block CEILING_TILE_BLOCK = registerBlock("ceiling_tile_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "ceiling_tile_block")))
                    .strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE_TILES)));

    public static final RotatingBlock STAINED_CEILING_TILE_BLOCK = registerBlock("stained_ceiling_tile_block",
            new RotatingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "stained_ceiling_tile_block")))
                    .strength(2.0f).sounds(BlockSoundGroup.DEEPSLATE_TILES)));

    public static final Block COCK_BLOCK = registerBlock("cock_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "cock_block")))
                    .strength(3.5f).sounds(BlockSoundGroup.NETHERITE)));

    public static final Block CODE_BLOCK = registerBlock("code_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "code_block")))
                    .strength(2.0f).sounds(BlockSoundGroup.POLISHED_TUFF)));

    public static final Block COOKIE_BLOCK = registerBlock("cookie_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "cookie_block")))
                    .strength(1.5f).sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block CONSTRUCTION_BLOCK = registerBlock("construction_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "construction_block")))
                    .strength(3.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block COSMIC_BLOCK = registerBlock("cosmic_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "cosmic_block")))
                    .strength(1.5f).sounds(BlockSoundGroup.WOOD)));

    public static final Block DENIM_BLOCK = registerBlock("denim_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "denim_block")))
                    .strength(1.5f).sounds(BlockSoundGroup.WOOL)));

    public static final Block GLITCH_BLOCK = registerBlock("glitch_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "glitch_block")))
                    .strength(2.0f).sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block GOVERNMENT_AC_UNIT = registerBlock("government_ac_unit",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "government_ac_unit")))
                    .strength(3.0f).sounds(BlockSoundGroup.HEAVY_CORE)));

    public static final Block HEART_BLOCK = registerBlock("heart_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "heart_block")))
                    .strength(2.0f).sounds(BlockSoundGroup.BASALT)));

    public static final Block LELIEL_BLOCK = registerBlock("leliel_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "leliel_block")))
                    .strength(2.0f).sounds(BlockSoundGroup.HONEY)));

    public static final Block LEOPARD_PRINT_BLOCK = registerBlock("leopard_print_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "leopard_print_block")))
                    .strength(1.0f).sounds(BlockSoundGroup.WOOL)));

    public static final Block LIMINAL_BLOCK = registerBlock("liminal_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "liminal_block")))
                    .strength(1.0f).sounds(BlockSoundGroup.CORAL)));

    public static final RotatingBlock NOKIA_PHONE_BLOCK = registerBlock("nokia_phone_block",
            new RotatingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "nokia_phone_block")))
                    .strength(10.0F, 50.0F).requiresTool().sounds(BlockSoundGroup.HEAVY_CORE)));

    public static final RotatingBlock PACKAGE_BLOCK = registerBlock("package_block",
            new RotatingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "package_block")))
                    .strength(2.0f).sounds(BlockSoundGroup.CHISELED_BOOKSHELF)));

    public static final Block PAPER_BLOCK = registerBlock("paper_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "paper_block")))
                    .strength(1.0f).sounds(BlockSoundGroup.MANGROVE_ROOTS)));

    public static final Block POISONOUS_POTATO_BLOCK = registerBlock("poisonous_potato_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "poisonous_potato_block")))
                    .strength(2.0f).sounds(BlockSoundGroup.CORAL)));

    public static final Block RAINBOW_WOOL_BLOCK = registerBlock("rainbow_wool_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "rainbow_wool_block")))
                    .strength(1.5f).sounds(BlockSoundGroup.WOOL)));

    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "rotten_flesh_block")))
                    .strength(1.0f).sounds(BlockSoundGroup.SOUL_SOIL)));

    public static final Block SPIDER_EYE_BLOCK = registerBlock("spider_eye_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "spider_eye_block")))
                    .strength(1.0f).sounds(BlockSoundGroup.SOUL_SAND)));

    public static final Block SUN_BLOCK = registerBlock("sun_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "sun_block")))
                    .strength(1.5f).sounds(BlockSoundGroup.BIG_DRIPLEAF)));

    public static final Block WHEAT_SEED_BLOCK = registerBlock("wheat_seed_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "wheat_seed_block")))
                    .strength(0.5f).sounds(BlockSoundGroup.CROP)));

    public static final Block WHITE_EGG_BLOCK = registerBlock("white_egg_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "white_egg_block")))
                    .strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block BLUE_EGG_BLOCK = registerBlock("blue_egg_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "blue_egg_block")))
                    .strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT)));

    public static final Block BROWN_EGG_BLOCK = registerBlock("brown_egg_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, "brown_egg_block")))
                    .strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT)));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> function) {
        Block toRegister = function.apply(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, name))));
        registerBlockItem2(name, toRegister);
        return Registry.register(Registries.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem2(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FunnyBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FunnyBlocks.MOD_ID, name)))));
    }

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, name), block);
    }

    public static RotatingBlock registerBlock(String name, RotatingBlock block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FunnyBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FunnyBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FunnyBlocks.MOD_ID, name))).useBlockPrefixedTranslationKey()));
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
