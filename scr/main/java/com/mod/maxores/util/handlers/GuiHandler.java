package com.mod.maxores.util.handlers;

import com.mod.maxores.machines.furnace.ContainerOresFurnace;
import com.mod.maxores.machines.furnace.GuiOresFurnace;
import com.mod.maxores.machines.furnace.TileEntityOresFurnace;
import com.mod.maxores.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ORES_FURNACE) return new ContainerOresFurnace(player.inventory, (TileEntityOresFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ORES_FURNACE) return new GuiOresFurnace(player.inventory, (TileEntityOresFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
}
