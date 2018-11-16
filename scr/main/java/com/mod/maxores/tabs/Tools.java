package com.mod.maxores.tabs;

import com.mod.maxores.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Tools extends CreativeTabs
{
	public Tools(String label)
	{
		super("tools");
		this.setBackgroundImageName("tools.png");
	}

	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.CHALCANTHITE_AXE);
	}
}
