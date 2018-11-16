package com.mod.maxores.tabs;

import com.mod.maxores.init.ModBlocks;
import com.mod.maxores.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Miscellaneous extends CreativeTabs
{
	public Miscellaneous(String label)
	{
		super("miscellaneous");
		this.setBackgroundImageName("miscellaneous.png");
	}

	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.RUBY);
	}
}