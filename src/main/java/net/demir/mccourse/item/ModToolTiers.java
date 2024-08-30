package net.demir.mccourse.item;

import net.demir.mccourse.MCCourseMod;
import net.demir.mccourse.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier URILIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5,3000,13f,1f,26,
                    ModTags.Blocks.NEEDS_URILIUM_TOOL, () -> Ingredient.of(ModItems.URILIUM.get())),
            new ResourceLocation(MCCourseMod.MOD_ID,"urilium"), List.of(Tiers.NETHERITE),List.of());

}
