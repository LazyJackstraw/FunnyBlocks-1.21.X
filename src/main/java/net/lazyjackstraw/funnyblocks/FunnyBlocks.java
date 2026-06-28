package net.lazyjackstraw.funnyblocks;

import net.fabricmc.api.ModInitializer;

import net.lazyjackstraw.funnyblocks.block.ModBlocks;
import net.lazyjackstraw.funnyblocks.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunnyBlocks implements ModInitializer {
	public static final String MOD_ID = "funnyblocks";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}