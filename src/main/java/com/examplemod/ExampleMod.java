package com.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class ExampleMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("ExampleMod");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info( "Hello Quilt world from ExampleMod v{}!", mod.metadata().version().raw() );
	}
}
