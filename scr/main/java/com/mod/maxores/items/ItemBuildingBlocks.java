package com.mod.maxores.items;

import com.mod.maxores.Main;
import com.mod.maxores.init.ModItems;
import com.mod.maxores.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBuildingBlocks extends Item implements IHasModel
{
	public ItemBuildingBlocks (String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.buildingblocks);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
