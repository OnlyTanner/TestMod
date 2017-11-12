package com.onlytanner.test.items;

import com.onlytanner.test.Reference;
import com.onlytanner.test.TestMod;

import net.minecraft.item.Item;

public class ItemCopperIngot extends Item {

    public ItemCopperIngot() {
        setUnlocalizedName(Reference.TestModItems.COPPER_INGOT.getUnlocalizedName());
        setRegistryName(Reference.TestModItems.COPPER_INGOT.getRegistryName());
        setCreativeTab(TestMod.RESOURCES_TAB);
    }
}