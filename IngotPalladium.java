package com.fhalo.fhore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class IngotPalladium extends Item {
	public IngotPalladium() {
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName("fhmod:ingotpalladium");
		this.setMaxStackSize(64);
		this.setUnlocalizedName("IngotPalladium");
	}
	
	public boolean hasEffect(ItemStack itemstack)
	{
		return true;
	}
}
