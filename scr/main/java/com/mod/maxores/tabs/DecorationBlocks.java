package com.mod.maxores.tabs;

import com.mod.maxores.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DecorationBlocks extends CreativeTabs
{
	public DecorationBlocks(String label)
	{
		super("decorationblocks");
		this.setBackgroundImageName("decorationblocks.png");
	}

	public ItemStack getTabIconItem()
	{
		return new ItemStack(Item.getItemFromBlock(ModBlocks.ORES_FURNACE));
	}
}
