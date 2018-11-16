package com.mod.maxores.blocks;

import com.mod.maxores.Main;
import com.mod.maxores.init.ModBlocks;
import com.mod.maxores.init.ModItems;
import com.mod.maxores.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockPickaxe3 extends Block implements IHasModel
{
	public BlockPickaxe3(String name, Material material, SoundType soundType)
	{
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(soundType);
		setHarvestLevel("pickaxe", 3);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}