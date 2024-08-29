package net.demir.mccourse.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {

    public static final FoodProperties URILIUM_BAR = new FoodProperties.Builder().
            nutrition(10).saturationMod(0.3f).effect( () -> new MobEffectInstance(MobEffects.DIG_SPEED,6000),1.0f).
            effect( () -> new MobEffectInstance(MobEffects.NIGHT_VISION,6000),1.0f).alwaysEat().build();
}
