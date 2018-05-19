package com.fhalo.fhore.init;

import cpw.mods.fml.common.registry.GameRegistry;
import com.fhalo.fhore.world.OresDepositsWorldGenerator;

public class WorldGenRegister {
	
	public static OresDepositsWorldGenerator OresDepositsWorldGenerator = new OresDepositsWorldGenerator();

	public static void init() {
		
		WorldGenRegister();

	}

	public static void WorldGenRegister() {
		
		GameRegistry.registerWorldGenerator(OresDepositsWorldGenerator, 0);

	}
}