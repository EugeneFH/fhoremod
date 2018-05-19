package com.fhalo.fhore.world;

import java.util.List;
import java.util.Random;
import cpw.mods.fml.common.IWorldGenerator;
import com.fhalo.fhore.init.OresRegister;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.oredict.OreDictionary;

public class OresDepositsWorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		generateOverworld(rand, chunkX, chunkZ, world);
		generateNether(rand, chunkX, chunkZ, world);
		generateEnd(rand, chunkX, chunkZ, world);
	
	}

	private void generateOverworld(Random rand, int chunkX, int chunkZ, World world) {

		generateOverworld(world, rand, chunkX * 16, chunkZ * 16);

	}


	private void generateNether(Random rand, int chunkX, int chunkZ, World world) {

		generateOverworld(world, rand, chunkX * 16, chunkZ * 16);

	}

	private void generateEnd(Random rand, int chunkX, int chunkZ, World world) {

		generateOverworld(world, rand, chunkX * 16, chunkZ * 16);

	}
	
	public void generateOverworld(World world, Random rand, int blockXPos, int blockZPos) {
		addOreSpawn(OresRegister.orepalladium,				 											Blocks.stone, world, rand, blockXPos, blockZPos, 16, 16, 1, 6, 1, 8, 10, 20, 35);		
	}
	
	public void generateNether(World world, Random rand, int blockXPos, int blockZPos) {
		addOreSpawn(OresRegister.orepalladiumnether,				 									Blocks.netherrack, world, rand, blockXPos, blockZPos, 16, 16, 1, 6, 1000, 1000, 120, 0, 256);		
	}
	
	public void generateEnd(World world, Random rand, int blockXPos, int blockZPos) {
		addOreSpawn(OresRegister.orepalladiumender,				 										Blocks.end_stone, world, rand, blockXPos, blockZPos, 16, 16, 1, 3, 0, 2, 10, 0, 256);		
	}

	
	public static void addOreSpawn(Block ore, Block replace, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ, int minVeinSize, int maxVeinSize, int minVeinsPerChunk, int maxVeinsPerChunk, int chanceToSpawn, int minY, int maxY) {
	    if (rand.nextInt(101) < (100 - chanceToSpawn)) return;
	    int veins = rand.nextInt(maxVeinsPerChunk - minVeinsPerChunk + 1) + minVeinsPerChunk;
	    	for (int i = 0; i < veins; i++){

	        int posX = blockXPos + rand.nextInt(maxX);
	        int posY = minY + rand.nextInt(maxY - minY);
	        int posZ = blockZPos + rand.nextInt(maxZ);

	        (new WorldGenMinable(ore, minVeinSize + rand.nextInt(maxVeinSize - minVeinSize + 1), replace)).generate(world, rand, posX, posY, posZ);

	    }
	}
}