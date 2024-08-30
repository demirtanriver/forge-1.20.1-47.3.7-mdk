package net.demir.mccourse.item;

import net.demir.mccourse.MCCourseMod;
import net.demir.mccourse.item.custom.MultitoolItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MCCourseMod.MOD_ID);


    public static final RegistryObject<Item> URILIUM = ITEMS.register("urilium",
            () -> new Item(new Item.Properties() ));

    public static final RegistryObject<Item> URILIUM_BAR = ITEMS.register("urilium_bar",
            () -> new Item(new Item.Properties().food(ModFoodProperties.URILIUM_BAR)) );

    public static final RegistryObject<Item> URILIUM_SWORD = ITEMS.register("urilium_sword",
            () -> new SwordItem(ModToolTiers.URILIUM,8,-2.4f,new Item.Properties().durability(3000) ));

    public static final RegistryObject<Item> URILIUM_PICKAXE = ITEMS.register("urilium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.URILIUM,6,-2.8f,new Item.Properties().durability(3000) ));

    public static final RegistryObject<Item> URILIUM_AXE = ITEMS.register("urilium_axe",
            () -> new AxeItem(ModToolTiers.URILIUM,10,-3,new Item.Properties().durability(3000) ));

    public static final RegistryObject<Item> URILIUM_SHOVEL = ITEMS.register("urilium_shovel",
            () -> new ShovelItem(ModToolTiers.URILIUM,5.5f,-3,new Item.Properties().durability(3000) ));

    public static final RegistryObject<Item> URILIUM_HOE = ITEMS.register("urilium_hoe",
            () -> new HoeItem(ModToolTiers.URILIUM,0,-3,new Item.Properties().durability(3000) ));

    public static final RegistryObject<Item> URILIUM_MULTITOOL = ITEMS.register("urilium_multitool",
            () -> new MultitoolItem(ModToolTiers.URILIUM,8,-2.4f,new Item.Properties().durability(4000) ));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
