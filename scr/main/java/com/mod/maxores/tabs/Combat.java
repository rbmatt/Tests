package com.mod.maxores.tabs;

import com.mod.maxores.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Combat extends CreativeTabs
{
	public Combat(String label)
	{
		super("combat");
		this.setBackgroundImageName("combat.png");
	}

	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.AMETHYST_SWORD);
	}
}
