package com.mod.maxores.blocks.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MItemBlock extends ItemBlock
{
	private int burnTime;
	private int burnMeta;
	
	public MItemBlock(Block block)
	{
		super(block);
		this.burnTime = 0;
		this.burnMeta = OreDictionary.WILDCARD_VALUE;
	}
	
	public MItemBlock setBurnTime(int time)
	{
		return setBurnTime(time, 0);
	}
	
	public MItemBlock setBurnTime(int time, int meta)
	{
		this.burnTime = time;
		this.burnMeta = meta;
		return this;
	}
	
	public int getItemBurnTime(ItemStack itemStack)
    {
		if(this.burnTime > 0 && this.burnMeta == itemStack.getMetadata())
			return this.burnTime;
		else
			return 0;
    }
}