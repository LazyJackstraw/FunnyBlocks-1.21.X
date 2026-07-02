package net.lazyjackstraw.funnyblocks;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.lazyjackstraw.funnyblocks.block.ModBlocks;
import net.lazyjackstraw.funnyblocks.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;


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

		// when the player joins the server, give them all the recipes
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {

			// loop through all recipes
			server.getRecipeManager().values().forEach(recipeEntry -> {

				// filter by funnyblocks mod ID
				if (recipeEntry.id().getValue().getNamespace().equals(FunnyBlocks.MOD_ID)) {
					handler.player.unlockRecipes(Collections.singleton(recipeEntry));
				}
			});
		});

	}
}