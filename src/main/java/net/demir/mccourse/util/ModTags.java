package net.demir.mccourse.util;

import net.demir.mccourse.MCCourseMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MCCourseMod.MOD_ID,name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge",name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> NEEDS_URILIUM_TOOL = tag("needs_urilium_tool");
        public static final TagKey<Block> MULTITOOL_MINEABLE = tag("mineable/multitool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MCCourseMod.MOD_ID,name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge",name));
        }
    }
}
