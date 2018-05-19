package com.fhalo.fhore.block;

import java.util.Random;

import com.fhalo.fhore.init.ItemsRegister;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OresBlock extends Block {
    
    public OresBlock() {
        
        super(Material.rock);
        
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHarvestLevel("pickaxe", 3);
        this.setResistance(5.0F);
		this.setBlockName("OrePalladium").setStepSound(Block.soundTypePiston);
		this.setHardness(15.0F);
        
    }
    
    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        return ItemsRegister.crystalpalladium;
    }
}
