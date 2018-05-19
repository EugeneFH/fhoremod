package com.fhalo.fhore;

import com.fhalo.fhore.init.ItemsRegister;
import com.fhalo.fhore.init.OresRegister;
import com.fhalo.fhore.init.WorldGenRegister;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;

@Mod(modid = "fhmodores", name = "FHore", version = "1.0")

public class OreDeposits {

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		OresRegister.init();
		ItemsRegister.init();
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
		WorldGenRegister.init();
		
	}
}