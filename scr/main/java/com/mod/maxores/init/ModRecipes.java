	package com.mod.maxores.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.CHALCANTHITE_ORE, new ItemStack(ModItems.CHALCANTHITE), 1.0F);
		GameRegistry.addSmelting(ModBlocks.CHALCANTHITE_BLOCK, new ItemStack(ModBlocks.CHALCANTHITE_BLOCK_SOLID), 0.3F);
		GameRegistry.addSmelting(ModBlocks.AMETHYST_ORE, new ItemStack(ModItems.AMETHYST), 1.0F);
		GameRegistry.addSmelting(ModBlocks.AMETHYST_BLOCK, new ItemStack(ModBlocks.AMETHYST_BLOCK_SOLID), 0.3F);
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY), 1.0F);
		GameRegistry.addSmelting(ModBlocks.RUBY_BLOCK, new ItemStack(ModBlocks.RUBY_BLOCK_SOLID), 0.3F);
	}
}
