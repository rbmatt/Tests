package com.mod.maxores.machines.furnace;

import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Maps;
import com.mod.maxores.init.ModBlocks;
import com.mod.maxores.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;

public class OresFurnaceRecipes
{
    private static final OresFurnaceRecipes SMELTING_BASE = new OresFurnaceRecipes();

    private final Map<ItemStack, ItemStack> smeltingList = Maps.<ItemStack, ItemStack>newHashMap();

    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static OresFurnaceRecipes instance()
    {
        return SMELTING_BASE;
    }

    private OresFurnaceRecipes()
    {
        this.addSmeltingRecipeForBlock(ModBlocks.TITANIUM_ORE, new ItemStack(ModItems.TITANIUM_INGOT), 1.0F);
        this.addSmeltingRecipeForBlock(ModBlocks.COPPER_ORE, new ItemStack(ModItems.COPPER_INGOT), 1.0F);
        
        this.addSmelting(ModItems.TITANIUM_BOOTS, new ItemStack(ModItems.TITANIUM_NUGGET), 0.1F);
        this.addSmelting(ModItems.TITANIUM_CHESTPLATE, new ItemStack(ModItems.TITANIUM_NUGGET), 0.1F);
        this.addSmelting(ModItems.TITANIUM_HELMET, new ItemStack(ModItems.TITANIUM_NUGGET), 0.1F);
        this.addSmelting(ModItems.TITANIUM_LEGGINGS, new ItemStack(ModItems.TITANIUM_NUGGET), 0.1F);
    }

    public void addSmeltingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addSmelting(Item.getItemFromBlock(input), stack, experience);
    }

    public void addSmelting(Item input, ItemStack stack, float experience)
    {
        this.addSmeltingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }

    public void addSmeltingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        if (getSmeltingResult(input) != ItemStack.EMPTY) { net.minecraftforge.fml.common.FMLLog.log.info("Ignored smelting recipe with conflicting input: {} = {}", input, stack); return; }
        this.smeltingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }

    public ItemStack getSmeltingResult(ItemStack stack)
    {
        for (Entry<ItemStack, ItemStack> entry : this.smeltingList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return entry.getValue();
            }
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Map<ItemStack, ItemStack> getSmeltingList()
    {
        return this.smeltingList;
    }

    public float getSmeltingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;

        for (Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }
}
