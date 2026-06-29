package net.lazyjackstraw.funnyblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lazyjackstraw.funnyblocks.FunnyBlocks;
import net.lazyjackstraw.funnyblocks.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    // Creates a custom item group for the funny blocks
    public static final ItemGroup FUNNY_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FunnyBlocks.MOD_ID, "funny_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.DENIM_BLOCK))
                    .displayName(Text.translatable("itemgroup.funnyblocks.funny_blocks"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.ALLIUM_BLOCK);
                        entries.add(ModBlocks.BLANK_TERRACOTTA_BLOCK);
                        entries.add(ModBlocks.BLUE_EGG_BLOCK);
                        entries.add(ModBlocks.BROWN_EGG_BLOCK);
                        entries.add(ModBlocks.WHITE_EGG_BLOCK);
                        entries.add(ModBlocks.CAGE_BLOCK);
                        entries.add(ModBlocks.CANADIAN_BLOCK);
                        entries.add(ModBlocks.CEILING_TILE_BLOCK);
                        entries.add(ModBlocks.STAINED_CEILING_TILE_BLOCK);
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

                    })).build());


    public static void registerItemGroups() {
        FunnyBlocks.LOGGER.info("Registering Item Groups for " + FunnyBlocks.MOD_ID);
    }
}
