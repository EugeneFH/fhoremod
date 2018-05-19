package com.fhalo.fhore.init;

import cpw.mods.fml.common.registry.GameRegistry;
import com.fhalo.fhore.block.OresBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OresRegister {
	public static Block orepalladium = new OresBlock().setBlockTextureName("fhmod:orepalladium");
	public static Block orepalladiumnether = new OresBlock().setBlockTextureName("fhmod:orepalladiumnether");
	public static Block orepalladiumender = new OresBlock().setBlockTextureName("fhmod:orepalladiumender");
	
	public static void init() {
		
		OresRegister();
		
	}

	public static void OresRegister() {
		GameRegistry.registerBlock(orepalladium, "orepalladium");
		GameRegistry.registerBlock(orepalladiumnether, "orepalladiumnether");
		GameRegistry.registerBlock(orepalladiumender, "orepalladiumender");
		
	}

}