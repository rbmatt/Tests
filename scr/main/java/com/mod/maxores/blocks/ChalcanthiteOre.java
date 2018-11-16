package com.mod.maxores.blocks;

import java.util.Random;

import com.mod.maxores.Main;
import com.mod.maxores.init.ModBlocks;
import com.mod.maxores.init.ModItems;
import com.mod.maxores.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ChalcanthiteOre extends Block implements IHasModel
{
	public ChalcanthiteOre(String name, Material material)
	{
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
		setCreativeTab(Main.buildingblocks);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return ModItems.CHALCANTHITE;
    }
	
	@Override
    public int quantityDropped(IBlockState state, int fortune, Random random)
    {
        return random.nextInt(1 + fortune) + 1; // <--- This will drop 1 to 2 items, and the +1 is so its not from 0 to 2.
    }

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}