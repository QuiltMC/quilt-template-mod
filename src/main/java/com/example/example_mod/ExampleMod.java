package com.example.example_mod;

import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.ModMetadata;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("Example Mod");
	public static @Nullable ModMetadata metadata = null;

	@Override
	public void onInitialize(ModContainer mod) {
		metadata = mod.metadata();

		LOGGER.info(
			"Hello Quilt world from {}! Remember to stay fresh!\nThis is Pineapple: {}",
			mod.metadata().name(),
			new Identifier(getMetadata().id(), "pineapple")
		);
	}

	public static ModMetadata getMetadata() {
		assert metadata != null;
		return metadata;
	}
}
