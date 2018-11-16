package com.mod.maxores.init;

import java.util.ArrayList;
import java.util.List;

import com.mod.maxores.Main;
import com.mod.maxores.fluid.FluidBase;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids
{ 
	public static final List<Fluid> FLUIDS = new ArrayList<Fluid>();
	
	public static final Fluid COPPER_LIQUID = new FluidBase("copper_liquid", new ResourceLocation(Main.MOD_ID, "blocks/liquids/copper_liquid_still.png"), new ResourceLocation(Main.MOD_ID, "blocks/liquids/copper_liquid_flow.png"));
	
	public static void registerFluids()
	{
		registerFluid(COPPER_LIQUID);
	}
	
	public static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}