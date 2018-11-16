package com.mod.maxores.util.handlers;

import com.mod.maxores.machines.furnace.TileEntityOresFurnace;
import com.mod.maxores.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{
	public static void registerTileEntity()
	{
		GameRegistry.registerTileEntity(TileEntityOresFurnace.class, new ResourceLocation(Reference.MOD_ID + "ores_furnace"));
	}
}
