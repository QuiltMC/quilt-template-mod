package com.example.example_mod;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Example Mod");

	// A central place to house your mod ID. This should match the ID in your quilt.mod.json file.
	public static final String MOD_ID = "example_mod";

	@Override
	public void onInitialize(ModContainer mod) {
		// the following block validates that you've updated both the quilt.mod.json file and MOD_ID field when you change your mod ID. if you're familiar with making mods, feel free to remove this!
		if (!mod.metadata().id().equals(MOD_ID)) {
			throw new RuntimeException(String.format("Mod IDs in quilt.mod.json and MOD_ID field do not match! (quilt.mod.json: %s; MOD_ID: %s", mod.metadata().id(), MOD_ID));
		}

		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
	}
}
