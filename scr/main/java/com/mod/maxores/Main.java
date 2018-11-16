package com.mod.maxores;

import com.mod.maxores.init.ModBlocks;
import com.mod.maxores.init.ModItems;
import com.mod.maxores.init.ModRecipes;
import com.mod.maxores.proxy.CommonProxy;
import com.mod.maxores.tabs.BuildingBlocks;
import com.mod.maxores.tabs.Combat;
import com.mod.maxores.tabs.DecorationBlocks;
import com.mod.maxores.tabs.Miscellaneous;
import com.mod.maxores.tabs.Tools;
import com.mod.maxores.util.Reference;
import com.mod.maxores.util.handlers.RegistryHandler;
import com.mod.maxores.world.ModWorldGen;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
    public static final String MOD_ID = "mo";
    public static final String NAME = "Max Ores";
    public static final String VERSION = "0.3";
    
	public static final CreativeTabs buildingblocks = new BuildingBlocks("buildingblocks");
	public static final CreativeTabs decorationblocks = new DecorationBlocks("decorationblocks");
	public static final CreativeTabs miscellaneous = new Miscellaneous("miscellaneous");
	public static final CreativeTabs tools = new Tools("tools");
	public static final CreativeTabs combat = new Combat("combat");
    
	@Instance
    public static Main instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
    static
    {
        FluidRegistry.enableUniversalBucket();
    }

    @EventHandler
    public void Preinit(FMLPreInitializationEvent event)
    {
		RegistryHandler.PreInitRegistries();
		proxy.PreInit(event);
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		ModRecipes.init();
		RegistryHandler.initRegistries();
		proxy.init(event);
    }

    @EventHandler
    public void Postinit(FMLPostInitializationEvent event)
    {
		RegistryHandler.PostInitRegistries();
		proxy.PostInit(event);
    }

    @EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event)
        {
            ModBlocks.register(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerItems(ModelRegistryEvent event)
        {
            ModBlocks.registerModels();
        }
    }
}