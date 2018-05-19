package com.fhalo.fhore.init;

import cpw.mods.fml.common.registry.GameRegistry;

import com.fhalo.fhore.CrystalPalladium;
import com.fhalo.fhore.IngotPalladium;
import com.fhalo.fhore.NuggetPalladium;
import com.fhalo.fhore.block.OresBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ItemsRegister {
	
	public static Item crystalpalladium = new CrystalPalladium();
	public static Item nuggetpalladium = new NuggetPalladium();
	public static Item ingotpalladium = new IngotPalladium();

	public static void init() {
		
		ItemsRegister();
		
	}

	public static void ItemsRegister() {
		GameRegistry.registerItem(crystalpalladium, "crystalpalladium");
		GameRegistry.registerItem(nuggetpalladium, "nuggetpalladium");
		GameRegistry.registerItem(ingotpalladium, "ingotpalladium");
		
	}

}