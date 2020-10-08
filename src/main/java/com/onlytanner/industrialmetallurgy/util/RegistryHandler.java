package com.onlytanner.industrialmetallurgy.util;

import com.onlytanner.industrialmetallurgy.IndustrialMetallurgy;
import com.onlytanner.industrialmetallurgy.blocks.*;
import com.onlytanner.industrialmetallurgy.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, IndustrialMetallurgy.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, IndustrialMetallurgy.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", ItemBase::new);
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot", ItemBase::new);
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", ItemBase::new);
    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot", ItemBase::new);
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", ItemBase::new);
    public static final RegistryObject<Item> COBALT_STEEL_INGOT = ITEMS.register("cobalt_steel_ingot", ItemBase::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
    public static final RegistryObject<Item> INVAR_INGOT = ITEMS.register("invar_ingot", ItemBase::new);
    public static final RegistryObject<Item> KANTHAL_INGOT = ITEMS.register("kanthal_ingot", ItemBase::new);
    public static final RegistryObject<Item> NEQUITUM_INGOT = ITEMS.register("nequitum_ingot", ItemBase::new);
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", ItemBase::new);
    public static final RegistryObject<Item> NICHROME_INGOT = ITEMS.register("nichrome_ingot", ItemBase::new);
    public static final RegistryObject<Item> NITINOL_INGOT = ITEMS.register("nitinol_ingot", ItemBase::new);
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ItemBase::new);
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ItemBase::new);
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_STEEL_INGOT = ITEMS.register("tungsten_steel_ingot", ItemBase::new);
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", ItemBase::new);
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", ItemBase::new);
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget", ItemBase::new);
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", ItemBase::new);
    public static final RegistryObject<Item> CHROMIUM_NUGGET = ITEMS.register("chromium_nugget", ItemBase::new);
    public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget", ItemBase::new);
    public static final RegistryObject<Item> COBALT_STEEL_NUGGET = ITEMS.register("cobalt_steel_nugget", ItemBase::new);
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ItemBase::new);
    public static final RegistryObject<Item> INVAR_NUGGET = ITEMS.register("invar_nugget", ItemBase::new);
    public static final RegistryObject<Item> KANTHAL_NUGGET = ITEMS.register("kanthal_nugget", ItemBase::new);
    public static final RegistryObject<Item> NEQUITUM_NUGGET = ITEMS.register("nequitum_nugget", ItemBase::new);
    public static final RegistryObject<Item> NICHROME_NUGGET = ITEMS.register("nichrome_nugget", ItemBase::new);
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", ItemBase::new);
    public static final RegistryObject<Item> NITINOL_NUGGET = ITEMS.register("nitinol_nugget", ItemBase::new);
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", ItemBase::new);
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", ItemBase::new);
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_STEEL_NUGGET = ITEMS.register("tungsten_steel_nugget", ItemBase::new);
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_BAUXITE_ORE = ITEMS.register("crushed_bauxite_ore", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_CASSITERITE_ORE = ITEMS.register("crushed_cassiterite_ore", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_CHROMITE_ORE = ITEMS.register("crushed_chromite_ore", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_COBALTITE_ORE = ITEMS.register("crushed_cobaltite_ore", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_CUPRITE_ORE = ITEMS.register("crushed_cuprite_ore", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_GARNIERITE_ORE = ITEMS.register("crushed_garnierite_ore", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_GOLD_ORE = ITEMS.register("crushed_gold_ore", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_IRON_ORE = ITEMS.register("crushed_iron_ore", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_RUTILE_ORE = ITEMS.register("crushed_rutile_ore", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_SPHALERITE_ORE = ITEMS.register("crushed_sphalerite_ore", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_WOLFRAMITE_ORE = ITEMS.register("crushed_wolframite_ore", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_COAL = ITEMS.register("crushed_coal", ItemBase::new);
    public static final RegistryObject<Item> CRUSHED_DIAMOND = ITEMS.register("crushed_diamond", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_CARBIDE_DUST = ITEMS.register("tungsten_carbide_dust", ItemBase::new);
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur", ItemBase::new);
    public static final RegistryObject<Item> ETHYLENE_BOTTLE = ITEMS.register("ethylene_bottle", ItemBase::new);
    public static final RegistryObject<Item> METHANE_BOTTLE = ITEMS.register("methane_bottle", ItemBase::new);
    public static final RegistryObject<Item> PETROLEUM_BOTTLE = ITEMS.register("petroleum_bottle", ItemBase::new);
    public static final RegistryObject<Item> SULFURIC_ACID_BOTTLE = ITEMS.register("sulfuric_acid_bottle", ItemBase::new);
    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke", ItemBase::new);
    public static final RegistryObject<Item> BITUMEN = ITEMS.register("bitumen", ItemBase::new);
    public static final RegistryObject<Item> FERTILIZER = ITEMS.register("fertilizer", ItemBase::new);
    public static final RegistryObject<Item> HDPE_SHEET = ITEMS.register("hdpe_sheet", ItemBase::new);
    public static final RegistryObject<Item> PEAT = ITEMS.register("peat", ItemBase::new);
    public static final RegistryObject<Item> POTASSIUM_NITRATE = ITEMS.register("potassium_nitrate", ItemBase::new);
    public static final RegistryObject<Item> REFRACTORY_BRICK = ITEMS.register("refractory_brick", ItemBase::new);
    public static final RegistryObject<Item> REFRACTORY_COMPOSITE = ITEMS.register("refractory_composite", ItemBase::new);
    public static final RegistryObject<Item> BATTERY_BANK = ITEMS.register("battery_bank", ItemBase::new);
    public static final RegistryObject<Item> BATTERY_CELL = ITEMS.register("battery_cell", ItemBase::new);
    public static final RegistryObject<Item> CONDUCTING_ELEMENT = ITEMS.register("conducting_element", ItemBase::new);
    public static final RegistryObject<Item> ELECTRIC_MOTOR = ITEMS.register("electric_motor", ItemBase::new);
    public static final RegistryObject<Item> STATOR = ITEMS.register("stator", ItemBase::new);
    public static final RegistryObject<Item> ROTOR = ITEMS.register("rotor", ItemBase::new);
    public static final RegistryObject<Item> FIELD_COIL = ITEMS.register("field_coil", ItemBase::new);
    public static final RegistryObject<Item> HEATING_ELEMENT = ITEMS.register("heating_element", ItemBase::new);
    public static final RegistryObject<Item> INDUCTION_CORE = ITEMS.register("induction_core", ItemBase::new);
    public static final RegistryObject<Item> MAGNET_WIRE = ITEMS.register("magnet_wire", ItemBase::new);
    public static final RegistryObject<Item> MEMORY_WIRE = ITEMS.register("memory_wire", ItemBase::new);
    public static final RegistryObject<Item> RESISTANCE_WIRE = ITEMS.register("resistance_wire", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", MetalBlock::new);
    public static final RegistryObject<Block> BRASS_BLOCK = BLOCKS.register("brass_block", MetalBlock::new);
    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", MetalBlock::new);
    public static final RegistryObject<Block> CHROMIUM_BLOCK = BLOCKS.register("chromium_block", MetalBlock::new);
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", MetalBlock::new);
    public static final RegistryObject<Block> COBALT_STEEL_BLOCK = BLOCKS.register("cobalt_steel_block", MetalBlock::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", MetalBlock::new);
    public static final RegistryObject<Block> INVAR_BLOCK = BLOCKS.register("invar_block", MetalBlock::new);
    public static final RegistryObject<Block> KANTHAL_BLOCK = BLOCKS.register("kanthal_block", MetalBlock::new);
    public static final RegistryObject<Block> NEQUITUM_BLOCK = BLOCKS.register("nequitum_block", MetalBlock::new);
    public static final RegistryObject<Block> NICHROME_BLOCK = BLOCKS.register("nichrome_block", MetalBlock::new);
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", MetalBlock::new);
    public static final RegistryObject<Block> NITINOL_BLOCK = BLOCKS.register("nitinol_block", MetalBlock::new);
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", MetalBlock::new);
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", MetalBlock::new);
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = BLOCKS.register("tungsten_block", MetalBlock::new);
    public static final RegistryObject<Block> TUNGSTEN_STEEL_BLOCK = BLOCKS.register("tungsten_steel_block", MetalBlock::new);
    public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block", MetalBlock::new);
    public static final RegistryObject<Block> BAUXITE_ORE = BLOCKS.register("bauxite_ore", Tier1OreBlock::new);
    public static final RegistryObject<Block> CASSITERITE_ORE = BLOCKS.register("cassiterite_ore", Tier1OreBlock::new);
    public static final RegistryObject<Block> CHROMITE_ORE = BLOCKS.register("chromite_ore", Tier2OreBlock::new);
    public static final RegistryObject<Block> COBALTITE_ORE = BLOCKS.register("cobaltite_ore", Tier3OreBlock::new);
    public static final RegistryObject<Block> CUPRITE_ORE = BLOCKS.register("cuprite_ore", Tier1OreBlock::new);
    public static final RegistryObject<Block> GARNIERITE_ORE = BLOCKS.register("garnierite_ore", Tier1OreBlock::new);
    public static final RegistryObject<Block> RUTILE_ORE = BLOCKS.register("rutile_ore", Tier2OreBlock::new);
    public static final RegistryObject<Block> SPHALERITE_ORE = BLOCKS.register("sphalerite_ore", Tier1OreBlock::new);
    public static final RegistryObject<Block> WOLFRAMITE_ORE = BLOCKS.register("wolframite_ore", Tier4OreBlock::new);


    // Block Items
    public static final RegistryObject<Item> ALUMINUM_BLOCK_ITEM = ITEMS.register("aluminum_block", () -> new BlockItemBase(ALUMINUM_BLOCK.get()));
    public static final RegistryObject<Item> BRASS_BLOCK_ITEM = ITEMS.register("brass_block", () -> new BlockItemBase(BRASS_BLOCK.get()));
    public static final RegistryObject<Item> BRONZE_BLOCK_ITEM = ITEMS.register("bronze_block", () -> new BlockItemBase(BRONZE_BLOCK.get()));
    public static final RegistryObject<Item> CHROMIUM_BLOCK_ITEM = ITEMS.register("chromium_block", () -> new BlockItemBase(CHROMIUM_BLOCK.get()));
    public static final RegistryObject<Item> COBALT_BLOCK_ITEM = ITEMS.register("cobalt_block", () -> new BlockItemBase(COBALT_BLOCK.get()));
    public static final RegistryObject<Item> COBALT_STEEL_BLOCK_ITEM = ITEMS.register("cobalt_steel_block", () -> new BlockItemBase(COBALT_STEEL_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItemBase(COPPER_BLOCK.get()));
    public static final RegistryObject<Item> INVAR_BLOCK_ITEM = ITEMS.register("invar_block", () -> new BlockItemBase(INVAR_BLOCK.get()));
    public static final RegistryObject<Item> KANTHAL_BLOCK_ITEM = ITEMS.register("kanthal_block", () -> new BlockItemBase(KANTHAL_BLOCK.get()));
    public static final RegistryObject<Item> NEQUITUM_BLOCK_ITEM = ITEMS.register("nequitum_block", () -> new BlockItemBase(NEQUITUM_BLOCK.get()));
    public static final RegistryObject<Item> NICHROME_BLOCK_ITEM = ITEMS.register("nichrome_block", () -> new BlockItemBase(NICHROME_BLOCK.get()));
    public static final RegistryObject<Item> NICKEL_BLOCK_ITEM = ITEMS.register("nickel_block", () -> new BlockItemBase(NICKEL_BLOCK.get()));
    public static final RegistryObject<Item> NITINOL_BLOCK_ITEM = ITEMS.register("nitinol_block", () -> new BlockItemBase(NITINOL_BLOCK.get()));
    public static final RegistryObject<Item> TIN_BLOCK_ITEM = ITEMS.register("tin_block", () -> new BlockItemBase(TIN_BLOCK.get()));
    public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block", () -> new BlockItemBase(TITANIUM_BLOCK.get()));
    public static final RegistryObject<Item> TUNGSTEN_BLOCK_ITEM = ITEMS.register("tungsten_block", () -> new BlockItemBase(TUNGSTEN_BLOCK.get()));
    public static final RegistryObject<Item> TUNGSTEN_STEEL_BLOCK_ITEM = ITEMS.register("tungsten_steel_block", () -> new BlockItemBase(TUNGSTEN_STEEL_BLOCK.get()));
    public static final RegistryObject<Item> ZINC_BLOCK_ITEM = ITEMS.register("zinc_block", () -> new BlockItemBase(ZINC_BLOCK.get()));
    public static final RegistryObject<Item> BAUXITE_ORE_ITEM = ITEMS.register("bauxite_ore", () -> new BlockItemBase(BAUXITE_ORE.get()));
    public static final RegistryObject<Item> CASSITERITE_ORE_ITEM = ITEMS.register("cassiterite_ore", () -> new BlockItemBase(CASSITERITE_ORE.get()));
    public static final RegistryObject<Item> CHROMITE_ORE_ITEM = ITEMS.register("chromite_ore", () -> new BlockItemBase(CHROMITE_ORE.get()));
    public static final RegistryObject<Item> COBALTITE_ORE_ITEM = ITEMS.register("cobaltite_ore", () -> new BlockItemBase(COBALTITE_ORE.get()));
    public static final RegistryObject<Item> CUPRITE_ORE_ITEM = ITEMS.register("cuprite_ore", () -> new BlockItemBase(CUPRITE_ORE.get()));
    public static final RegistryObject<Item> GARNIERITE_ORE_ITEM = ITEMS.register("garnierite_ore", () -> new BlockItemBase(GARNIERITE_ORE.get()));
    public static final RegistryObject<Item> RUTILE_ORE_ITEM = ITEMS.register("rutile_ore", () -> new BlockItemBase(RUTILE_ORE.get()));
    public static final RegistryObject<Item> SPHALERITE_ORE_ITEM = ITEMS.register("sphalerite_ore", () -> new BlockItemBase(SPHALERITE_ORE.get()));
    public static final RegistryObject<Item> WOLFRAMITE_ORE_ITEM = ITEMS.register("wolframite_ore", () -> new BlockItemBase(WOLFRAMITE_ORE.get()));

}
