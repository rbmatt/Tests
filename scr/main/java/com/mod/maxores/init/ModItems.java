package com.mod.maxores.init;

import java.util.ArrayList;
import java.util.List;

import com.mod.maxores.items.ItemMiscellaneous;
import com.mod.maxores.items.armors.ArmorBase;
import com.mod.maxores.items.tools.ToolAxe;
import com.mod.maxores.items.tools.ToolHoe;
import com.mod.maxores.items.tools.ToolPickaxe;
import com.mod.maxores.items.tools.ToolSpade;
import com.mod.maxores.items.tools.ToolSword;
import com.mod.maxores.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//INFO
	//WOOD <= 0 = 2
	//STONE <= 2 = 4
	//IRON <= 4 = 6
	//DIAMOND <= 6 = 8
	
	//MATERIALS
	public static final ToolMaterial MATERIAL_CHALCANTHITE = EnumHelper.addToolMaterial("material_chalcanthite", 1, 131, 4.0F, 1.0F, 5);
	public static final ArmorMaterial ARMOR_MATERIAL_CHALCANTHITE = EnumHelper.addArmorMaterial("armor_material_chalcanthite", Reference.MOD_ID + ":chalcanthite", 15, new int[] {1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ToolMaterial MATERIAL_AMETHYST = EnumHelper.addToolMaterial("material_amethyst", 3, 1561, 9.0F, 4.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_AMETHYST = EnumHelper.addArmorMaterial("armor_material_amethyst", Reference.MOD_ID + ":amethyst", 33, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 1561, 11.0F, 6.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 33, new int[] {5, 8, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ToolMaterial MATERIAL_TITANIUM = EnumHelper.addToolMaterial("material_titanium", 3, 1561, 11.0F, 6.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_TITANIUM = EnumHelper.addArmorMaterial("armor_material_titanium", Reference.MOD_ID + ":titanium", 33, new int[] {5, 8, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5F);
	public static final ToolMaterial MATERIAL_COPPER = EnumHelper.addToolMaterial("material_copper", 1, 131, 4.0F, 1.0F, 5);
	public static final ArmorMaterial ARMOR_MATERIAL_COPPER = EnumHelper.addArmorMaterial("armor_material_copper", Reference.MOD_ID + ":copper", 15, new int[] {1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//ITEMS
	public static final Item CHALCANTHITE = new ItemMiscellaneous("chalcanthite");
	public static final Item AMETHYST = new ItemMiscellaneous("amethyst");
	public static final Item RUBY = new ItemMiscellaneous("ruby");
	public static final Item TITANIUM_INGOT = new ItemMiscellaneous("titanium_ingot");
	public static final Item TITANIUM_NUGGET = new ItemMiscellaneous("titanium_nugget");
	public static final Item COPPER_INGOT = new ItemMiscellaneous("copper_ingot");
	public static final Item COPPER_NUGGET = new ItemMiscellaneous("copper_nugget");
	
	//TOOLS
	public static final ItemSword CHALCANTHITE_SWORD = new ToolSword("chalcanthite_sword", MATERIAL_CHALCANTHITE);
	public static final ItemSpade CHALCANTHITE_SHOVEL = new ToolSpade("chalcanthite_shovel", MATERIAL_CHALCANTHITE);
	public static final ItemPickaxe CHALCANTHITE_PICKAXE = new ToolPickaxe("chalcanthite_pickaxe", MATERIAL_CHALCANTHITE);
	public static final ItemAxe CHALCANTHITE_AXE = new ToolAxe("chalcanthite_axe", MATERIAL_CHALCANTHITE);
	public static final ItemHoe CHALCANTHITE_HOE = new ToolHoe("chalcanthite_hoe", MATERIAL_CHALCANTHITE);
	
	public static final ItemSword AMETHYST_SWORD = new ToolSword("amethyst_sword", MATERIAL_AMETHYST);
	public static final ItemSpade AMETHYST_SHOVEL = new ToolSpade("amethyst_shovel", MATERIAL_AMETHYST);
	public static final ItemPickaxe AMETHYST_PICKAXE = new ToolPickaxe("amethyst_pickaxe", MATERIAL_AMETHYST);
	public static final ItemAxe AMETHYST_AXE = new ToolAxe("amethyst_axe", MATERIAL_AMETHYST);
	public static final ItemHoe AMETHYST_HOE = new ToolHoe("amethyst_hoe", MATERIAL_AMETHYST);
	
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	
	public static final ItemSword TITANIUM_SWORD = new ToolSword("titanium_sword", MATERIAL_TITANIUM);
	public static final ItemSpade TITANIUM_SHOVEL = new ToolSpade("titanium_shovel", MATERIAL_TITANIUM);
	public static final ItemPickaxe TITANIUM_PICKAXE = new ToolPickaxe("titanium_pickaxe", MATERIAL_TITANIUM);
	public static final ItemAxe TITANIUM_AXE = new ToolAxe("titanium_axe", MATERIAL_TITANIUM);
	public static final ItemHoe TITANIUM_HOE = new ToolHoe("titanium_hoe", MATERIAL_TITANIUM);
	
	public static final ItemSword COPPER_SWORD = new ToolSword("copper_sword", MATERIAL_COPPER);
	public static final ItemSpade COPPER_SHOVEL = new ToolSpade("copper_shovel", MATERIAL_COPPER);
	public static final ItemPickaxe COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", MATERIAL_COPPER);
	public static final ItemAxe COPPER_AXE = new ToolAxe("copper_axe", MATERIAL_COPPER);
	public static final ItemHoe COPPER_HOE = new ToolHoe("copper_hoe", MATERIAL_COPPER);
	
	//ARMORS
	public static final Item CHALCANTHITE_HELMET = new ArmorBase("chalcanthite_helmet", ARMOR_MATERIAL_CHALCANTHITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHALCANTHITE_CHESTPLATE = new ArmorBase("chalcanthite_chestplate", ARMOR_MATERIAL_CHALCANTHITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item CHALCANTHITE_LEGGINGS = new ArmorBase("chalcanthite_leggings", ARMOR_MATERIAL_CHALCANTHITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHALCANTHITE_BOOTS = new ArmorBase("chalcanthite_boots", ARMOR_MATERIAL_CHALCANTHITE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item AMETHYST_HELMET = new ArmorBase("amethyst_helmet", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.HEAD);
	public static final Item AMETHYST_CHESTPLATE = new ArmorBase("amethyst_chestplate", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.CHEST);
	public static final Item AMETHYST_LEGGINGS = new ArmorBase("amethyst_leggings", ARMOR_MATERIAL_AMETHYST, 2, EntityEquipmentSlot.LEGS);
	public static final Item AMETHYST_BOOTS = new ArmorBase("amethyst_boots", ARMOR_MATERIAL_AMETHYST, 1, EntityEquipmentSlot.FEET);
	
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	
	public static final Item TITANIUM_HELMET = new ArmorBase("titanium_helmet", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item TITANIUM_CHESTPLATE = new ArmorBase("titanium_chestplate", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item TITANIUM_LEGGINGS = new ArmorBase("titanium_leggings", ARMOR_MATERIAL_TITANIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item TITANIUM_BOOTS = new ArmorBase("titanium_boots", ARMOR_MATERIAL_TITANIUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item COPPER_HELMET = new ArmorBase("copper_helmet", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmorBase("copper_chestplate", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmorBase("copper_leggings", ARMOR_MATERIAL_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmorBase("copper_boots", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.FEET);
}
