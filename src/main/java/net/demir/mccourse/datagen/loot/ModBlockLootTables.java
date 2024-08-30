package net.demir.mccourse.datagen.loot;

import net.demir.mccourse.block.ModBlocks;
import net.demir.mccourse.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {


    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.URILIUM_BLOCK.get());
        this.add(ModBlocks.URILIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.URILIUM_ORE.get(), ModItems.URILIUM.get()));

        this.add(ModBlocks.DEEPSLATE_URILIUM_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_URILIUM_ORE.get(), ModItems.URILIUM.get()));


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;

    }
}
