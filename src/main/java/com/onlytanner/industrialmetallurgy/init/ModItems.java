package com.onlytanner.industrialmetallurgy.init;

import com.onlytanner.industrialmetallurgy.IndustrialMetallurgy;
import com.onlytanner.industrialmetallurgy.Reference.IndustrialMetallurgyItems;
import com.onlytanner.industrialmetallurgy.items.*;
import com.onlytanner.industrialmetallurgy.items.tools.*;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
    public static Item refractory_composite;
    public static Item refractory_brick;
    public static Item coal_coke;
    public static Item crushed_coal;
    public static Item crushed_diamond;
    public static Item tungsten_carbide_dust;
    public static Item memory_wire;
    public static Item resistance_wire;
    public static Item magnet_wire;
    public static Item stator;
    public static Item rotor;
    public static Item field_coil;
    public static Item electric_motor;
    public static Item conducting_element;
    public static Item heating_element;

    public static Item crushed_bauxite_ore;
    public static Item crushed_cassiterite_ore;
    public static Item crushed_chromite_ore;
    public static Item crushed_cobaltite_ore;
    public static Item crushed_cuprite_ore;
    public static Item crushed_garnierite_ore;
    public static Item crushed_gold_ore;
    public static Item crushed_iron_ore;
    public static Item crushed_rutile_ore;
    public static Item crushed_sphalerite_ore;
    public static Item crushed_wolframite_ore;

    public static Item alloy7201_ingot;
    public static Item aluminum_ingot;
    public static Item brass_ingot;
    public static Item bronze_ingot;
    public static Item chromium_ingot;
    public static Item cobalt_ingot;
    public static Item cobalt_steel_ingot;
    public static Item copper_ingot;
    public static Item invar_ingot;
    public static Item kanthal_ingot;
    public static Item nichrome_ingot;
    public static Item nickel_ingot;
    public static Item nitinol_ingot;
    public static Item steel_ingot;
    public static Item tin_ingot;
    public static Item titanium_ingot;
    public static Item tungsten_ingot;
    public static Item tungsten_steel_ingot;
    public static Item zinc_ingot;

    public static Item alloy7201_nugget;
    public static Item aluminum_nugget;
    public static Item brass_nugget;
    public static Item bronze_nugget;
    public static Item chromium_nugget;
    public static Item cobalt_nugget;
    public static Item cobalt_steel_nugget;
    public static Item copper_nugget;
    public static Item invar_nugget;
    public static Item iron_nugget;
    public static Item kanthal_nugget;
    public static Item nichrome_nugget;
    public static Item nickel_nugget;
    public static Item nitinol_nugget;
    public static Item steel_nugget;
    public static Item tin_nugget;
    public static Item titanium_nugget;
    public static Item tungsten_nugget;
    public static Item tungsten_steel_nugget;
    public static Item zinc_nugget;

    public static ItemPickaxe alloy7201_pickaxe;
    public static ItemPickaxe aluminum_pickaxe;
    public static ItemPickaxe brass_pickaxe;
    public static ItemPickaxe bronze_pickaxe;
    public static ItemPickaxe chromium_pickaxe;
    public static ItemPickaxe cobalt_pickaxe;
    public static ItemPickaxe copper_pickaxe;
    public static ItemPickaxe invar_pickaxe;
    public static ItemPickaxe nichrome_pickaxe;
    public static ItemPickaxe nickel_pickaxe;
    public static ItemPickaxe nitinol_pickaxe;
    public static ItemPickaxe steel_pickaxe;
    public static ItemPickaxe tin_pickaxe;
    public static ItemPickaxe titanium_pickaxe;
    public static ItemPickaxe tungsten_pickaxe;
    public static ItemPickaxe zinc_pickaxe;

    public static ItemSword alloy7201_sword;
    public static ItemSword aluminum_sword;
    public static ItemSword brass_sword;
    public static ItemSword bronze_sword;
    public static ItemSword chromium_sword;
    public static ItemSword cobalt_sword;
    public static ItemSword copper_sword;
    public static ItemSword invar_sword;
    public static ItemSword nichrome_sword;
    public static ItemSword nickel_sword;
    public static ItemSword nitinol_sword;
    public static ItemSword steel_sword;
    public static ItemSword tin_sword;
    public static ItemSword titanium_sword;
    public static ItemSword tungsten_sword;
    public static ItemSword zinc_sword;

    public static ItemSpade alloy7201_shovel;
    public static ItemSpade aluminum_shovel;
    public static ItemSpade brass_shovel;
    public static ItemSpade bronze_shovel;
    public static ItemSpade chromium_shovel;
    public static ItemSpade cobalt_shovel;
    public static ItemSpade copper_shovel;
    public static ItemSpade invar_shovel;
    public static ItemSpade nichrome_shovel;
    public static ItemSpade nickel_shovel;
    public static ItemSpade nitinol_shovel;
    public static ItemSpade steel_shovel;
    public static ItemSpade tin_shovel;
    public static ItemSpade titanium_shovel;
    public static ItemSpade tungsten_shovel;
    public static ItemSpade zinc_shovel;

    public static ItemAxe alloy7201_axe;
    public static ItemAxe aluminum_axe;
    public static ItemAxe brass_axe;
    public static ItemAxe bronze_axe;
    public static ItemAxe chromium_axe;
    public static ItemAxe cobalt_axe;
    public static ItemAxe copper_axe;
    public static ItemAxe invar_axe;
    public static ItemAxe nichrome_axe;
    public static ItemAxe nickel_axe;
    public static ItemAxe nitinol_axe;
    public static ItemAxe steel_axe;
    public static ItemAxe tin_axe;
    public static ItemAxe titanium_axe;
    public static ItemAxe tungsten_axe;
    public static ItemAxe zinc_axe;

    public static ItemHoe alloy7201_hoe;
    public static ItemHoe aluminum_hoe;
    public static ItemHoe brass_hoe;
    public static ItemHoe bronze_hoe;
    public static ItemHoe chromium_hoe;
    public static ItemHoe cobalt_hoe;
    public static ItemHoe copper_hoe;
    public static ItemHoe invar_hoe;
    public static ItemHoe nichrome_hoe;
    public static ItemHoe nickel_hoe;
    public static ItemHoe nitinol_hoe;
    public static ItemHoe steel_hoe;
    public static ItemHoe tin_hoe;
    public static ItemHoe titanium_hoe;
    public static ItemHoe tungsten_hoe;
    public static ItemHoe zinc_hoe;

    public static final ToolMaterial ALLOY7201 = EnumHelper.addToolMaterial("ALLOY7201", 5, 50000, 25.0F, 5.0F, 50);
    public static final ToolMaterial ALUMINUM = EnumHelper.addToolMaterial("ALUMINUM", 1, 300, 7.0F, 1.0F, 10);
    public static final ToolMaterial BRASS = EnumHelper.addToolMaterial("BRASS", 1, 300, 6.0F, 1.0F, 10);
    public static final ToolMaterial BRONZE = EnumHelper.addToolMaterial("BRONZE", 1, 400, 6.0F, 1.0F, 14);
    public static final ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 1, 220, 5.0F, 1.0F, 10);
    public static final ToolMaterial CHROMIUM = EnumHelper.addToolMaterial("CHROMIUM", 3, 32, 20.0F, 1.0F, 25);
    public static final ToolMaterial COBALT = EnumHelper.addToolMaterial("COBALT", 4, 650, 15.0F, 2.0F, 15);
    public static final ToolMaterial COBALT_STEEL = EnumHelper.addToolMaterial("COBALT_STEEL", 4, 1300, 18.0F, 2.0F, 20);
    public static final ToolMaterial INVAR = EnumHelper.addToolMaterial("INVAR", 2, 400, 6.0F, 1.0F, 8);
    public static final ToolMaterial KANTHAL = EnumHelper.addToolMaterial("KANTHAL", 2, 550, 7.0F, 1.0F, 15);
    public static final ToolMaterial NICKEL = EnumHelper.addToolMaterial("NICKEL", 1, 220, 5.0F, 1.0F, 12);
    public static final ToolMaterial NICHROME = EnumHelper.addToolMaterial("NICHROME", 2, 800, 12.0F, 2.0F, 18);
    public static final ToolMaterial NITINOL = EnumHelper.addToolMaterial("NITINOL", 2, 1200, 8.0F, 2.0F, 15);
    public static final ToolMaterial STEEL = EnumHelper.addToolMaterial("STEEL", 2, 800, 9.0F, 2.0F, 17);
    public static final ToolMaterial TIN = EnumHelper.addToolMaterial("TIN", 1, 220, 5.0F, 1.0F, 10);
    public static final ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 600, 7.0F, 2.0F, 16);
    public static final ToolMaterial TUNGSTEN = EnumHelper.addToolMaterial("TUNGSTEN", 4, 1000, 14.0F, 2.0F, 20);
    public static final ToolMaterial TUNGSTEN_STEEL = EnumHelper.addToolMaterial("TUNGSTEN_STEEL", 4, 3000, 20.0F, 2.0F, 30);
    public static final ToolMaterial ZINC = EnumHelper.addToolMaterial("ZINC", 1, 150, 5.0F, 1.0F, 12);

    public static void init() {
        crushed_bauxite_ore = new ItemBase(IndustrialMetallurgyItems.CRUSHED_BAUXITE_ORE.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_BAUXITE_ORE.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        crushed_cassiterite_ore = new ItemBase(IndustrialMetallurgyItems.CRUSHED_CASSITERITE_ORE.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_CASSITERITE_ORE.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        crushed_chromite_ore = new ItemBase(IndustrialMetallurgyItems.CRUSHED_CHROMITE_ORE.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_CHROMITE_ORE.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        crushed_cobaltite_ore = new ItemBase(IndustrialMetallurgyItems.CRUSHED_COBALTITE_ORE.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_COBALTITE_ORE.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        crushed_cuprite_ore = new ItemBase(IndustrialMetallurgyItems.CRUSHED_CUPRITE_ORE.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_CUPRITE_ORE.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        crushed_garnierite_ore = new ItemBase(IndustrialMetallurgyItems.CRUSHED_GARNIERITE_ORE.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_GARNIERITE_ORE.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        crushed_gold_ore = new ItemBase(IndustrialMetallurgyItems.CRUSHED_GOLD_ORE.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_GOLD_ORE.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        crushed_iron_ore = new ItemBase(IndustrialMetallurgyItems.CRUSHED_IRON_ORE.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_IRON_ORE.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        crushed_rutile_ore = new ItemBase(IndustrialMetallurgyItems.CRUSHED_RUTILE_ORE.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_RUTILE_ORE.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        crushed_sphalerite_ore = new ItemBase(IndustrialMetallurgyItems.CRUSHED_SPHALERITE_ORE.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_SPHALERITE_ORE.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        crushed_wolframite_ore = new ItemBase(IndustrialMetallurgyItems.CRUSHED_WOLFRAMITE_ORE.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_WOLFRAMITE_ORE.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);

        alloy7201_ingot = new ItemBase(IndustrialMetallurgyItems.ALLOY7201_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.ALLOY7201_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB) {
            @Override
            public boolean hasEffect(ItemStack stack)
            {
                return true;
            }
        };
        aluminum_ingot = new ItemBase(IndustrialMetallurgyItems.ALUMINUM_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.ALUMINUM_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        brass_ingot = new ItemBase(IndustrialMetallurgyItems.BRASS_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.BRASS_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        bronze_ingot = new ItemBase(IndustrialMetallurgyItems.BRONZE_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.BRONZE_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        chromium_ingot = new ItemBase(IndustrialMetallurgyItems.CHROMIUM_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.CHROMIUM_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        cobalt_ingot = new ItemBase(IndustrialMetallurgyItems.COBALT_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.COBALT_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        cobalt_steel_ingot = new ItemBase(IndustrialMetallurgyItems.COBALT_STEEL_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.COBALT_STEEL_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        copper_ingot = new ItemBase(IndustrialMetallurgyItems.COPPER_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.COPPER_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        invar_ingot = new ItemBase(IndustrialMetallurgyItems.INVAR_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.INVAR_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        kanthal_ingot = new ItemBase(IndustrialMetallurgyItems.KANTHAL_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.KANTHAL_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        nichrome_ingot = new ItemBase(IndustrialMetallurgyItems.NICHROME_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.NICHROME_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        nickel_ingot = new ItemBase(IndustrialMetallurgyItems.NICKEL_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.NICKEL_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        nitinol_ingot = new ItemBase(IndustrialMetallurgyItems.NITINOL_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.NITINOL_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        steel_ingot = new ItemBase(IndustrialMetallurgyItems.STEEL_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.STEEL_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        tin_ingot = new ItemBase(IndustrialMetallurgyItems.TIN_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.TIN_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        titanium_ingot = new ItemBase(IndustrialMetallurgyItems.TITANIUM_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.TITANIUM_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        tungsten_ingot = new ItemBase(IndustrialMetallurgyItems.TUNGSTEN_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.TUNGSTEN_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        tungsten_steel_ingot = new ItemBase(IndustrialMetallurgyItems.TUNGSTEN_STEEL_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.TUNGSTEN_STEEL_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        zinc_ingot = new ItemBase(IndustrialMetallurgyItems.ZINC_INGOT.getUnlocalizedName(), IndustrialMetallurgyItems.ZINC_INGOT.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);

        alloy7201_nugget = new ItemBase(IndustrialMetallurgyItems.ALLOY7201_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.ALLOY7201_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB) {
            @Override
            public boolean hasEffect(ItemStack stack)
            {
                return true;
            }
        };
        aluminum_nugget = new ItemBase(IndustrialMetallurgyItems.ALUMINUM_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.ALUMINUM_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        brass_nugget = new ItemBase(IndustrialMetallurgyItems.BRASS_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.BRASS_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        bronze_nugget = new ItemBase(IndustrialMetallurgyItems.BRONZE_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.BRONZE_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        chromium_nugget = new ItemBase(IndustrialMetallurgyItems.CHROMIUM_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.CHROMIUM_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        cobalt_nugget = new ItemBase(IndustrialMetallurgyItems.COBALT_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.COBALT_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        cobalt_steel_nugget = new ItemBase(IndustrialMetallurgyItems.COBALT_STEEL_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.COBALT_STEEL_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        copper_nugget = new ItemBase(IndustrialMetallurgyItems.COPPER_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.COPPER_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        invar_nugget = new ItemBase(IndustrialMetallurgyItems.INVAR_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.INVAR_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        iron_nugget = new ItemBase(IndustrialMetallurgyItems.IRON_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.IRON_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        kanthal_nugget = new ItemBase(IndustrialMetallurgyItems.KANTHAL_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.KANTHAL_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        nichrome_nugget = new ItemBase(IndustrialMetallurgyItems.NICHROME_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.NICHROME_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        nickel_nugget = new ItemBase(IndustrialMetallurgyItems.NICKEL_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.NICKEL_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        nitinol_nugget = new ItemBase(IndustrialMetallurgyItems.NITINOL_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.NITINOL_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        steel_nugget = new ItemBase(IndustrialMetallurgyItems.STEEL_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.STEEL_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        tin_nugget = new ItemBase(IndustrialMetallurgyItems.TIN_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.TIN_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        titanium_nugget = new ItemBase(IndustrialMetallurgyItems.TITANIUM_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.TITANIUM_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        tungsten_nugget = new ItemBase(IndustrialMetallurgyItems.TUNGSTEN_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.TUNGSTEN_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        tungsten_steel_nugget = new ItemBase(IndustrialMetallurgyItems.TUNGSTEN_STEEL_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.TUNGSTEN_STEEL_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        zinc_nugget = new ItemBase(IndustrialMetallurgyItems.ZINC_NUGGET.getUnlocalizedName(), IndustrialMetallurgyItems.ZINC_NUGGET.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);

        alloy7201_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.ALLOY7201_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.ALLOY7201_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ALLOY7201) {
            @Override
            public boolean hasEffect(ItemStack stack)
            {
                return true;
            }
        };
        aluminum_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.ALUMINUM_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.ALUMINUM_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ALUMINUM);
        brass_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.BRASS_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.BRASS_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, BRASS);
        bronze_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.BRONZE_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.BRONZE_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, BRONZE);
        chromium_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.CHROMIUM_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.CHROMIUM_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, CHROMIUM);
        cobalt_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.COBALT_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.COBALT_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, COBALT);
        copper_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.COPPER_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.COPPER_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, COPPER);
        invar_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.INVAR_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.INVAR_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, INVAR);
        nichrome_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.NICHROME_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.NICHROME_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NICHROME);
        nickel_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.NICKEL_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.NICKEL_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NICKEL);
        nitinol_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.NITINOL_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.NITINOL_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NITINOL);
        steel_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.STEEL_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.STEEL_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, STEEL);
        tin_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.TIN_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.TIN_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TIN);
        titanium_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.TITANIUM_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.TITANIUM_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TITANIUM);
        tungsten_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.TUNGSTEN_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.TUNGSTEN_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TUNGSTEN);
        zinc_pickaxe = new ItemPickaxeBase(IndustrialMetallurgyItems.ZINC_PICKAXE.getUnlocalizedName(), IndustrialMetallurgyItems.ZINC_PICKAXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ZINC);

        alloy7201_sword = new ItemSwordBase(IndustrialMetallurgyItems.ALLOY7201_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.ALLOY7201_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ALLOY7201) {
            @Override
            public boolean hasEffect(ItemStack stack)
            {
                return true;
            }
        };
        aluminum_sword = new ItemSwordBase(IndustrialMetallurgyItems.ALUMINUM_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.ALUMINUM_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ALUMINUM);
        brass_sword = new ItemSwordBase(IndustrialMetallurgyItems.BRASS_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.BRASS_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, BRASS);
        bronze_sword = new ItemSwordBase(IndustrialMetallurgyItems.BRONZE_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.BRONZE_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, BRONZE);
        chromium_sword = new ItemSwordBase(IndustrialMetallurgyItems.CHROMIUM_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.CHROMIUM_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, CHROMIUM);
        cobalt_sword = new ItemSwordBase(IndustrialMetallurgyItems.COBALT_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.COBALT_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, COBALT);
        copper_sword = new ItemSwordBase(IndustrialMetallurgyItems.COPPER_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.COPPER_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, COPPER);
        invar_sword = new ItemSwordBase(IndustrialMetallurgyItems.INVAR_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.INVAR_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, INVAR);
        nichrome_sword = new ItemSwordBase(IndustrialMetallurgyItems.NICHROME_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.NICHROME_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NICHROME);
        nickel_sword = new ItemSwordBase(IndustrialMetallurgyItems.NICKEL_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.NICKEL_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NICKEL);
        nitinol_sword = new ItemSwordBase(IndustrialMetallurgyItems.NITINOL_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.NITINOL_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NITINOL);
        steel_sword = new ItemSwordBase(IndustrialMetallurgyItems.STEEL_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.STEEL_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, STEEL);
        tin_sword = new ItemSwordBase(IndustrialMetallurgyItems.TIN_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.TIN_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TIN);
        titanium_sword = new ItemSwordBase(IndustrialMetallurgyItems.TITANIUM_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.TITANIUM_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TITANIUM);
        tungsten_sword = new ItemSwordBase(IndustrialMetallurgyItems.TUNGSTEN_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.TUNGSTEN_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TUNGSTEN);
        zinc_sword = new ItemSwordBase(IndustrialMetallurgyItems.ZINC_SWORD.getUnlocalizedName(), IndustrialMetallurgyItems.ZINC_SWORD.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ZINC);

        alloy7201_shovel = new ItemShovelBase(IndustrialMetallurgyItems.ALLOY7201_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.ALLOY7201_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ALLOY7201) {
            @Override
            public boolean hasEffect(ItemStack stack)
            {
                return true;
            }
        };
        aluminum_shovel = new ItemShovelBase(IndustrialMetallurgyItems.ALUMINUM_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.ALUMINUM_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ALUMINUM);
        brass_shovel = new ItemShovelBase(IndustrialMetallurgyItems.BRASS_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.BRASS_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, BRASS);
        bronze_shovel = new ItemShovelBase(IndustrialMetallurgyItems.BRONZE_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.BRONZE_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, BRONZE);
        chromium_shovel = new ItemShovelBase(IndustrialMetallurgyItems.CHROMIUM_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.CHROMIUM_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, CHROMIUM);
        cobalt_shovel = new ItemShovelBase(IndustrialMetallurgyItems.COBALT_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.COBALT_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, COBALT);
        copper_shovel = new ItemShovelBase(IndustrialMetallurgyItems.COPPER_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.COPPER_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, COPPER);
        invar_shovel = new ItemShovelBase(IndustrialMetallurgyItems.INVAR_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.INVAR_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, INVAR);
        nichrome_shovel = new ItemShovelBase(IndustrialMetallurgyItems.NICHROME_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.NICHROME_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NICHROME);
        nickel_shovel = new ItemShovelBase(IndustrialMetallurgyItems.NICKEL_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.NICKEL_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NICKEL);
        nitinol_shovel = new ItemShovelBase(IndustrialMetallurgyItems.NITINOL_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.NITINOL_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NITINOL);
        steel_shovel = new ItemShovelBase(IndustrialMetallurgyItems.STEEL_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.STEEL_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, STEEL);
        tin_shovel = new ItemShovelBase(IndustrialMetallurgyItems.TIN_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.TIN_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TIN);
        titanium_shovel = new ItemShovelBase(IndustrialMetallurgyItems.TITANIUM_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.TITANIUM_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TITANIUM);
        tungsten_shovel = new ItemShovelBase(IndustrialMetallurgyItems.TUNGSTEN_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.TUNGSTEN_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TUNGSTEN);
        zinc_shovel = new ItemShovelBase(IndustrialMetallurgyItems.ZINC_SHOVEL.getUnlocalizedName(), IndustrialMetallurgyItems.ZINC_SHOVEL.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ZINC);
        
        alloy7201_axe = new ItemAxeBase(IndustrialMetallurgyItems.ALLOY7201_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.ALLOY7201_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ALLOY7201) {
            @Override
            public boolean hasEffect(ItemStack stack)
            {
                return true;
            }
        };
        aluminum_axe = new ItemAxeBase(IndustrialMetallurgyItems.ALUMINUM_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.ALUMINUM_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ALUMINUM);
        brass_axe = new ItemAxeBase(IndustrialMetallurgyItems.BRASS_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.BRASS_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, BRASS);
        bronze_axe = new ItemAxeBase(IndustrialMetallurgyItems.BRONZE_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.BRONZE_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, BRONZE);
        chromium_axe = new ItemAxeBase(IndustrialMetallurgyItems.CHROMIUM_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.CHROMIUM_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, CHROMIUM);
        cobalt_axe = new ItemAxeBase(IndustrialMetallurgyItems.COBALT_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.COBALT_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, COBALT);
        copper_axe = new ItemAxeBase(IndustrialMetallurgyItems.COPPER_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.COPPER_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, COPPER);
        invar_axe = new ItemAxeBase(IndustrialMetallurgyItems.INVAR_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.INVAR_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, INVAR);
        nichrome_axe = new ItemAxeBase(IndustrialMetallurgyItems.NICHROME_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.NICHROME_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NICHROME);
        nickel_axe = new ItemAxeBase(IndustrialMetallurgyItems.NICKEL_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.NICKEL_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NICKEL);
        nitinol_axe = new ItemAxeBase(IndustrialMetallurgyItems.NITINOL_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.NITINOL_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NITINOL);
        steel_axe = new ItemAxeBase(IndustrialMetallurgyItems.STEEL_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.STEEL_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, STEEL);
        tin_axe = new ItemAxeBase(IndustrialMetallurgyItems.TIN_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.TIN_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TIN);
        titanium_axe = new ItemAxeBase(IndustrialMetallurgyItems.TITANIUM_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.TITANIUM_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TITANIUM);
        tungsten_axe = new ItemAxeBase(IndustrialMetallurgyItems.TUNGSTEN_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.TUNGSTEN_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TUNGSTEN);
        zinc_axe = new ItemAxeBase(IndustrialMetallurgyItems.ZINC_AXE.getUnlocalizedName(), IndustrialMetallurgyItems.ZINC_AXE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ZINC);

        alloy7201_hoe = new ItemHoeBase(IndustrialMetallurgyItems.ALLOY7201_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.ALLOY7201_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ALLOY7201) {
            @Override
            public boolean hasEffect(ItemStack stack)
            {
                return true;
            }
        };
        aluminum_hoe = new ItemHoeBase(IndustrialMetallurgyItems.ALUMINUM_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.ALUMINUM_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ALUMINUM);
        brass_hoe = new ItemHoeBase(IndustrialMetallurgyItems.BRASS_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.BRASS_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, BRASS);
        bronze_hoe = new ItemHoeBase(IndustrialMetallurgyItems.BRONZE_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.BRONZE_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, BRONZE);
        chromium_hoe = new ItemHoeBase(IndustrialMetallurgyItems.CHROMIUM_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.CHROMIUM_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, CHROMIUM);
        cobalt_hoe = new ItemHoeBase(IndustrialMetallurgyItems.COBALT_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.COBALT_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, COBALT);
        copper_hoe = new ItemHoeBase(IndustrialMetallurgyItems.COPPER_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.COPPER_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, COPPER);
        invar_hoe = new ItemHoeBase(IndustrialMetallurgyItems.INVAR_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.INVAR_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, INVAR);
        nichrome_hoe = new ItemHoeBase(IndustrialMetallurgyItems.NICHROME_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.NICHROME_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NICHROME);
        nickel_hoe = new ItemHoeBase(IndustrialMetallurgyItems.NICKEL_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.NICKEL_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NICKEL);
        nitinol_hoe = new ItemHoeBase(IndustrialMetallurgyItems.NITINOL_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.NITINOL_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, NITINOL);
        steel_hoe = new ItemHoeBase(IndustrialMetallurgyItems.STEEL_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.STEEL_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, STEEL);
        tin_hoe = new ItemHoeBase(IndustrialMetallurgyItems.TIN_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.TIN_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TIN);
        titanium_hoe = new ItemHoeBase(IndustrialMetallurgyItems.TITANIUM_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.TITANIUM_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TITANIUM);
        tungsten_hoe = new ItemHoeBase(IndustrialMetallurgyItems.TUNGSTEN_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.TUNGSTEN_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, TUNGSTEN);
        zinc_hoe = new ItemHoeBase(IndustrialMetallurgyItems.ZINC_HOE.getUnlocalizedName(), IndustrialMetallurgyItems.ZINC_HOE.getRegistryName(), IndustrialMetallurgy.TOOLS_TAB, ZINC);

        refractory_composite = new ItemBase(IndustrialMetallurgyItems.REFRACTORY_COMPOSITE.getUnlocalizedName(), IndustrialMetallurgyItems.REFRACTORY_COMPOSITE.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
        refractory_brick = new ItemBase(IndustrialMetallurgyItems.REFRACTORY_BRICK.getUnlocalizedName(), IndustrialMetallurgyItems.REFRACTORY_BRICK.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
        coal_coke = new ItemBase(IndustrialMetallurgyItems.COAL_COKE.getUnlocalizedName(), IndustrialMetallurgyItems.COAL_COKE.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
        crushed_coal = new ItemBase(IndustrialMetallurgyItems.CRUSHED_COAL.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_COAL.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        crushed_diamond = new ItemBase(IndustrialMetallurgyItems.CRUSHED_DIAMOND.getUnlocalizedName(), IndustrialMetallurgyItems.CRUSHED_DIAMOND.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        tungsten_carbide_dust = new ItemBase(IndustrialMetallurgyItems.TUNGSTEN_CARBIDE_DUST.getUnlocalizedName(), IndustrialMetallurgyItems.TUNGSTEN_CARBIDE_DUST.getRegistryName(), IndustrialMetallurgy.RESOURCES_TAB);
        memory_wire = new ItemBase(IndustrialMetallurgyItems.MEMORY_WIRE.getUnlocalizedName(), IndustrialMetallurgyItems.MEMORY_WIRE.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
        resistance_wire = new ItemBase(IndustrialMetallurgyItems.RESISTANCE_WIRE.getUnlocalizedName(), IndustrialMetallurgyItems.RESISTANCE_WIRE.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
        magnet_wire = new ItemBase(IndustrialMetallurgyItems.MAGNET_WIRE.getUnlocalizedName(), IndustrialMetallurgyItems.MAGNET_WIRE.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
        stator = new ItemBase(IndustrialMetallurgyItems.STATOR.getUnlocalizedName(), IndustrialMetallurgyItems.STATOR.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
        rotor = new ItemBase(IndustrialMetallurgyItems.ROTOR.getUnlocalizedName(), IndustrialMetallurgyItems.ROTOR.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
        field_coil = new ItemBase(IndustrialMetallurgyItems.FIELD_COIL.getUnlocalizedName(), IndustrialMetallurgyItems.FIELD_COIL.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
        electric_motor = new ItemBase(IndustrialMetallurgyItems.ELECTRIC_MOTOR.getUnlocalizedName(), IndustrialMetallurgyItems.ELECTRIC_MOTOR.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
        conducting_element = new ItemBase(IndustrialMetallurgyItems.CONDUCTING_ELEMENT.getUnlocalizedName(), IndustrialMetallurgyItems.CONDUCTING_ELEMENT.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
        heating_element = new ItemBase(IndustrialMetallurgyItems.HEATING_ELEMENT.getUnlocalizedName(), IndustrialMetallurgyItems.HEATING_ELEMENT.getRegistryName(), IndustrialMetallurgy.MACHINES_TAB);
    }

    public static void register() {
        GameRegistry.register(crushed_bauxite_ore);
        GameRegistry.register(crushed_cassiterite_ore);
        GameRegistry.register(crushed_chromite_ore);
        GameRegistry.register(crushed_cobaltite_ore);
        GameRegistry.register(crushed_cuprite_ore);
        GameRegistry.register(crushed_garnierite_ore);
        GameRegistry.register(crushed_gold_ore);
        GameRegistry.register(crushed_iron_ore);
        GameRegistry.register(crushed_rutile_ore);
        GameRegistry.register(crushed_sphalerite_ore);
        GameRegistry.register(crushed_wolframite_ore);

        GameRegistry.register(alloy7201_ingot);
        GameRegistry.register(aluminum_ingot);
        GameRegistry.register(brass_ingot);
        GameRegistry.register(bronze_ingot);
        GameRegistry.register(chromium_ingot);
        GameRegistry.register(cobalt_ingot);
        GameRegistry.register(cobalt_steel_ingot);
        GameRegistry.register(copper_ingot);
        GameRegistry.register(invar_ingot);
        GameRegistry.register(kanthal_ingot);
        GameRegistry.register(nichrome_ingot);
        GameRegistry.register(nickel_ingot);
        GameRegistry.register(nitinol_ingot);
        GameRegistry.register(steel_ingot);
        GameRegistry.register(tin_ingot);
        GameRegistry.register(titanium_ingot);
        GameRegistry.register(tungsten_ingot);
        GameRegistry.register(tungsten_steel_ingot);
        GameRegistry.register(zinc_ingot);

        GameRegistry.register(alloy7201_nugget);
        GameRegistry.register(aluminum_nugget);
        GameRegistry.register(brass_nugget);
        GameRegistry.register(bronze_nugget);
        GameRegistry.register(chromium_nugget);
        GameRegistry.register(cobalt_nugget);
        GameRegistry.register(cobalt_steel_nugget);
        GameRegistry.register(copper_nugget);
        GameRegistry.register(invar_nugget);
        GameRegistry.register(iron_nugget);
        GameRegistry.register(kanthal_nugget);
        GameRegistry.register(nichrome_nugget);
        GameRegistry.register(nickel_nugget);
        GameRegistry.register(nitinol_nugget);
        GameRegistry.register(steel_nugget);
        GameRegistry.register(tin_nugget);
        GameRegistry.register(titanium_nugget);
        GameRegistry.register(tungsten_nugget);
        GameRegistry.register(tungsten_steel_nugget);
        GameRegistry.register(zinc_nugget);
        //pick
        GameRegistry.register(alloy7201_pickaxe);
        GameRegistry.register(aluminum_pickaxe);
        GameRegistry.register(brass_pickaxe);
        GameRegistry.register(bronze_pickaxe);
        GameRegistry.register(chromium_pickaxe);
        GameRegistry.register(cobalt_pickaxe);
        GameRegistry.register(copper_pickaxe);
        GameRegistry.register(invar_pickaxe);
        GameRegistry.register(nichrome_pickaxe);
        GameRegistry.register(nickel_pickaxe);
        GameRegistry.register(nitinol_pickaxe);
        GameRegistry.register(steel_pickaxe);
        GameRegistry.register(tin_pickaxe);
        GameRegistry.register(titanium_pickaxe);
        GameRegistry.register(tungsten_pickaxe);
        GameRegistry.register(zinc_pickaxe);
        //sword
        GameRegistry.register(alloy7201_sword);
        GameRegistry.register(aluminum_sword);
        GameRegistry.register(brass_sword);
        GameRegistry.register(bronze_sword);
        GameRegistry.register(chromium_sword);
        GameRegistry.register(cobalt_sword);
        GameRegistry.register(copper_sword);
        GameRegistry.register(invar_sword);
        GameRegistry.register(nichrome_sword);
        GameRegistry.register(nickel_sword);
        GameRegistry.register(nitinol_sword);
        GameRegistry.register(steel_sword);
        GameRegistry.register(tin_sword);
        GameRegistry.register(titanium_sword);
        GameRegistry.register(tungsten_sword);
        GameRegistry.register(zinc_sword);
        //shovel
        GameRegistry.register(alloy7201_shovel);
        GameRegistry.register(aluminum_shovel);
        GameRegistry.register(brass_shovel);
        GameRegistry.register(bronze_shovel);
        GameRegistry.register(chromium_shovel);
        GameRegistry.register(cobalt_shovel);
        GameRegistry.register(copper_shovel);
        GameRegistry.register(invar_shovel);
        GameRegistry.register(nichrome_shovel);
        GameRegistry.register(nickel_shovel);
        GameRegistry.register(nitinol_shovel);
        GameRegistry.register(steel_shovel);
        GameRegistry.register(tin_shovel);
        GameRegistry.register(titanium_shovel);
        GameRegistry.register(tungsten_shovel);
        GameRegistry.register(zinc_shovel);
        //axe
        GameRegistry.register(alloy7201_axe);
        GameRegistry.register(aluminum_axe);
        GameRegistry.register(brass_axe);
        GameRegistry.register(bronze_axe);
        GameRegistry.register(chromium_axe);
        GameRegistry.register(cobalt_axe);
        GameRegistry.register(copper_axe);
        GameRegistry.register(invar_axe);
        GameRegistry.register(nichrome_axe);
        GameRegistry.register(nickel_axe);
        GameRegistry.register(nitinol_axe);
        GameRegistry.register(steel_axe);
        GameRegistry.register(tin_axe);
        GameRegistry.register(titanium_axe);
        GameRegistry.register(tungsten_axe);
        GameRegistry.register(zinc_axe);
        //hoe
        GameRegistry.register(alloy7201_hoe);
        GameRegistry.register(aluminum_hoe);
        GameRegistry.register(brass_hoe);
        GameRegistry.register(bronze_hoe);
        GameRegistry.register(chromium_hoe);
        GameRegistry.register(cobalt_hoe);
        GameRegistry.register(copper_hoe);
        GameRegistry.register(invar_hoe);
        GameRegistry.register(nichrome_hoe);
        GameRegistry.register(nickel_hoe);
        GameRegistry.register(nitinol_hoe);
        GameRegistry.register(steel_hoe);
        GameRegistry.register(tin_hoe);
        GameRegistry.register(titanium_hoe);
        GameRegistry.register(tungsten_hoe);
        GameRegistry.register(zinc_hoe);

        GameRegistry.register(refractory_composite);
        GameRegistry.register(refractory_brick);
        GameRegistry.register(coal_coke);
        GameRegistry.register(crushed_coal);
        GameRegistry.register(crushed_diamond);
        GameRegistry.register(tungsten_carbide_dust);
        GameRegistry.register(memory_wire);
        GameRegistry.register(resistance_wire);
        GameRegistry.register(magnet_wire);
        GameRegistry.register(stator);
        GameRegistry.register(rotor);
        GameRegistry.register(field_coil);
        GameRegistry.register(electric_motor);
        GameRegistry.register(conducting_element);
        GameRegistry.register(heating_element);
    }

    public static void registerRenders() {
        registerRender(crushed_bauxite_ore);
        registerRender(crushed_cassiterite_ore);
        registerRender(crushed_chromite_ore);
        registerRender(crushed_cobaltite_ore);
        registerRender(crushed_cuprite_ore);
        registerRender(crushed_garnierite_ore);
        registerRender(crushed_gold_ore);
        registerRender(crushed_iron_ore);
        registerRender(crushed_rutile_ore);
        registerRender(crushed_sphalerite_ore);
        registerRender(crushed_wolframite_ore);

        registerRender(alloy7201_ingot);
        registerRender(aluminum_ingot);
        registerRender(brass_ingot);
        registerRender(bronze_ingot);
        registerRender(chromium_ingot);
        registerRender(cobalt_ingot);
        registerRender(cobalt_steel_ingot);
        registerRender(copper_ingot);
        registerRender(invar_ingot);
        registerRender(kanthal_ingot);
        registerRender(nichrome_ingot);
        registerRender(nickel_ingot);
        registerRender(nitinol_ingot);
        registerRender(steel_ingot);
        registerRender(tin_ingot);
        registerRender(titanium_ingot);
        registerRender(tungsten_ingot);
        registerRender(tungsten_steel_ingot);
        registerRender(zinc_ingot);

        registerRender(alloy7201_nugget);
        registerRender(aluminum_nugget);
        registerRender(brass_nugget);
        registerRender(bronze_nugget);
        registerRender(chromium_nugget);
        registerRender(cobalt_nugget);
        registerRender(cobalt_steel_nugget);
        registerRender(copper_nugget);
        registerRender(invar_nugget);
        registerRender(iron_nugget);
        registerRender(kanthal_nugget);
        registerRender(nichrome_nugget);
        registerRender(nickel_nugget);
        registerRender(nitinol_nugget);
        registerRender(steel_nugget);
        registerRender(tin_nugget);
        registerRender(titanium_nugget);
        registerRender(tungsten_nugget);
        registerRender(tungsten_steel_nugget);
        registerRender(zinc_nugget);
        //pick
        registerRender(alloy7201_pickaxe);
        registerRender(aluminum_pickaxe);
        registerRender(brass_pickaxe);
        registerRender(bronze_pickaxe);
        registerRender(chromium_pickaxe);
        registerRender(cobalt_pickaxe);
        registerRender(copper_pickaxe);
        registerRender(invar_pickaxe);
        registerRender(nichrome_pickaxe);
        registerRender(nickel_pickaxe);
        registerRender(nitinol_pickaxe);
        registerRender(steel_pickaxe);
        registerRender(tin_pickaxe);
        registerRender(titanium_pickaxe);
        registerRender(tungsten_pickaxe);
        registerRender(zinc_pickaxe);
        //sword
        registerRender(alloy7201_sword);
        registerRender(aluminum_sword);
        registerRender(brass_sword);
        registerRender(bronze_sword);
        registerRender(chromium_sword);
        registerRender(cobalt_sword);
        registerRender(copper_sword);
        registerRender(invar_sword);
        registerRender(nichrome_sword);
        registerRender(nickel_sword);
        registerRender(nitinol_sword);
        registerRender(steel_sword);
        registerRender(tin_sword);
        registerRender(titanium_sword);
        registerRender(tungsten_sword);
        registerRender(zinc_sword);
        //shovel
        registerRender(alloy7201_shovel);
        registerRender(aluminum_shovel);
        registerRender(brass_shovel);
        registerRender(bronze_shovel);
        registerRender(chromium_shovel);
        registerRender(cobalt_shovel);
        registerRender(copper_shovel);
        registerRender(invar_shovel);
        registerRender(nichrome_shovel);
        registerRender(nickel_shovel);
        registerRender(nitinol_shovel);
        registerRender(steel_shovel);
        registerRender(tin_shovel);
        registerRender(titanium_shovel);
        registerRender(tungsten_shovel);
        registerRender(zinc_shovel);
        //axe
        registerRender(alloy7201_axe);
        registerRender(aluminum_axe);
        registerRender(brass_axe);
        registerRender(bronze_axe);
        registerRender(chromium_axe);
        registerRender(cobalt_axe);
        registerRender(copper_axe);
        registerRender(invar_axe);
        registerRender(nichrome_axe);
        registerRender(nickel_axe);
        registerRender(nitinol_axe);
        registerRender(steel_axe);
        registerRender(tin_axe);
        registerRender(titanium_axe);
        registerRender(tungsten_axe);
        registerRender(zinc_axe);
        //hoe
        registerRender(alloy7201_hoe);
        registerRender(aluminum_hoe);
        registerRender(brass_hoe);
        registerRender(bronze_hoe);
        registerRender(chromium_hoe);
        registerRender(cobalt_hoe);
        registerRender(copper_hoe);
        registerRender(invar_hoe);
        registerRender(nichrome_hoe);
        registerRender(nickel_hoe);
        registerRender(nitinol_hoe);
        registerRender(steel_hoe);
        registerRender(tin_hoe);
        registerRender(titanium_hoe);
        registerRender(tungsten_hoe);
        registerRender(zinc_hoe);

        registerRender(refractory_composite);
        registerRender(refractory_brick);
        registerRender(coal_coke);
        registerRender(crushed_coal);
        registerRender(crushed_diamond);
        registerRender(tungsten_carbide_dust);
        registerRender(memory_wire);
        registerRender(resistance_wire);
        registerRender(magnet_wire);
        registerRender(stator);
        registerRender(rotor);
        registerRender(field_coil);
        registerRender(electric_motor);
        registerRender(conducting_element);
        registerRender(heating_element);
    }

    private static void registerRender(Item item) {
        //ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
