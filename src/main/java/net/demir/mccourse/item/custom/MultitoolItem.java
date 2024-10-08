package net.demir.mccourse.item.custom;

import net.demir.mccourse.util.ModTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.level.block.Block;

public class MultitoolItem extends DiggerItem implements Vanishable {
    public MultitoolItem(Tier pTier,float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, ModTags.Blocks.MULTITOOL_MINEABLE, pProperties);
    }
}
