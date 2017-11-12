package com.onlytanner.test.items.tools;

import com.onlytanner.test.Reference;
import com.onlytanner.test.TestMod;
import com.onlytanner.test.init.ModItems;

import net.minecraft.item.ItemPickaxe;

public class ItemSteelPickaxe extends ItemPickaxe {

    public ItemSteelPickaxe() {
        super(ModItems.STEEL);
        setUnlocalizedName(Reference.TestModItems.STEEL_PICKAXE.getUnlocalizedName());
        setRegistryName(Reference.TestModItems.STEEL_PICKAXE.getRegistryName());
        setCreativeTab(TestMod.TOOLS_TAB);
    }
}