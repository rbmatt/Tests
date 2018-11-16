package com.mod.maxores.tabs;

import com.mod.maxores.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BuildingBlocks extends CreativeTabs
{
	public BuildingBlocks(String label)
	{
		super("buildingblocks");
		this.setBackgroundImageName("buildingblocks.png");
	}

	public ItemStack getTabIconItem()
	{
		return new ItemStack(Item.getItemFromBlock(ModBlocks.TITANIUM_BLOCK_POLID));
	}
}
