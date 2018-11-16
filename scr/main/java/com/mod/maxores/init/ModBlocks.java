package com.mod.maxores.init;

import java.util.ArrayList;
import java.util.List;

import com.mod.maxores.Main;
import com.mod.maxores.blocks.AmethystOre;
import com.mod.maxores.blocks.BlockPickaxe1;
import com.mod.maxores.blocks.BlockPickaxe2;
import com.mod.maxores.blocks.BlockPickaxe3;
import com.mod.maxores.blocks.ChalcanthiteOre;
import com.mod.maxores.blocks.CopperOre;
import com.mod.maxores.blocks.RubyOre;
import com.mod.maxores.blocks.TitaniumOre;
import com.mod.maxores.blocks.liquids.LiquidBlock;
import com.mod.maxores.machines.furnace.OresFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//MACHINES
    public static OresFurnace ORES_FURNACE = new OresFurnace("ores_furnace", false);
    public static OresFurnace ORES_FURNACE_ACTIVE = new OresFurnace("ores_furnace_active", true);

    public static void register(IForgeRegistry<Block> registry)
    {
        registry.registerAll(ORES_FURNACE, ORES_FURNACE_ACTIVE.setLightLevel(0.875F));
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry)
    {
        registry.registerAll(ORES_FURNACE.createItemBlock());
    }

    public static void registerModels()
    {
    	ORES_FURNACE.registerItemModel(Item.getItemFromBlock(ORES_FURNACE));
    	ORES_FURNACE_ACTIVE.registerItemModel(Item.getItemFromBlock(ORES_FURNACE_ACTIVE));
    }
    
	//BLOCKS
	public static final Block OBSIDIAN_BLOCK_SOLID = new BlockPickaxe3("obsidian_block_solid", Material.ROCK, SoundType.STONE).setHardness(50F).setResistance(6000F).setCreativeTab(Main.buildingblocks);
	
	//LIQUIDS
	public static final Block COPPER_LIQUID = new LiquidBlock("copper_liquid", ModFluids.COPPER_LIQUID, Material.LAVA);
	
	//EQUIPAMENTS
	public static final Block CHALCANTHITE_ORE = new ChalcanthiteOre("chalcanthite_ore", Material.ROCK);
	public static final Block CHALCANTHITE_BLOCK = new BlockPickaxe1("chalcanthite_block", Material.ROCK, SoundType.STONE).setHardness(3F).setResistance(15F).setCreativeTab(Main.buildingblocks);
	public static final Block CHALCANTHITE_BLOCK_SOLID = new BlockPickaxe1("chalcanthite_block_solid", Material.IRON, SoundType.METAL).setHardness(5F).setResistance(30F).setCreativeTab(Main.buildingblocks);
	public static final Block CHALCANTHITE_BLOCK_POLID = new BlockPickaxe1("chalcanthite_block_polid", Material.IRON, SoundType.METAL).setHardness(5F).setResistance(30F).setCreativeTab(Main.buildingblocks);
	
	public static final Block AMETHYST_ORE = new AmethystOre("amethyst_ore", Material.ROCK);
	public static final Block AMETHYST_BLOCK = new BlockPickaxe2("amethyst_block", Material.ROCK, SoundType.STONE).setHardness(3F).setResistance(15F).setCreativeTab(Main.buildingblocks);
	public static final Block AMETHYST_BLOCK_SOLID = new BlockPickaxe2("amethyst_block_solid", Material.IRON, SoundType.METAL).setHardness(5F).setResistance(30F).setCreativeTab(Main.buildingblocks);
	public static final Block AMETHYST_BLOCK_POLID = new BlockPickaxe2("amethyst_block_polid", Material.IRON, SoundType.METAL).setHardness(5F).setResistance(30F).setCreativeTab(Main.buildingblocks);
	
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block RUBY_BLOCK = new BlockPickaxe3("ruby_block", Material.ROCK, SoundType.STONE).setHardness(3F).setResistance(15F).setCreativeTab(Main.buildingblocks);
	public static final Block RUBY_BLOCK_SOLID = new BlockPickaxe3("ruby_block_solid", Material.IRON, SoundType.METAL).setHardness(5F).setResistance(30F).setCreativeTab(Main.buildingblocks);
	public static final Block RUBY_BLOCK_POLID = new BlockPickaxe3("ruby_block_polid", Material.IRON, SoundType.METAL).setHardness(5F).setResistance(30F).setCreativeTab(Main.buildingblocks);
	
	public static final Block TITANIUM_ORE = new TitaniumOre("titanium_ore", Material.ROCK);
	public static final Block TITANIUM_BLOCK = new BlockPickaxe2("titanium_block", Material.IRON, SoundType.METAL).setHardness(3F).setResistance(15F).setCreativeTab(Main.buildingblocks);
	public static final Block TITANIUM_BLOCK_POLID = new BlockPickaxe2("titanium_block_polid", Material.IRON, SoundType.METAL).setHardness(5F).setResistance(30F).setCreativeTab(Main.buildingblocks);
	
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK);
	public static final Block COPPER_BLOCK = new BlockPickaxe1("copper_block", Material.IRON, SoundType.METAL).setHardness(3F).setResistance(15F).setCreativeTab(Main.buildingblocks);
	public static final Block COPPER_BLOCK_POLID = new BlockPickaxe1("copper_block_polid", Material.IRON, SoundType.METAL).setHardness(5F).setResistance(30F).setCreativeTab(Main.buildingblocks);
}