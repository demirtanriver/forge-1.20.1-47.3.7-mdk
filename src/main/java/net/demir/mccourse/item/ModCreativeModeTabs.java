package net.demir.mccourse.item;

import net.demir.mccourse.MCCourseMod;
import net.demir.mccourse.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ModItems.URILIUM.get()))
                    .title(Component.translatable("creativetab.course_tab"))
                    .displayItems((displayParameters,output) -> {
                        output.accept(ModItems.URILIUM.get());
                        output.accept(ModBlocks.URILIUM_BLOCK.get());
                        output.accept(ModBlocks.URILIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_URILIUM_ORE.get());
                        output.accept(ModItems.URILIUM_SWORD.get());
                        output.accept(ModItems.URILIUM_PICKAXE.get());
                        output.accept(ModItems.URILIUM_AXE.get());
                        output.accept(ModItems.URILIUM_SHOVEL.get());
                        output.accept(ModItems.URILIUM_HOE.get());
                        output.accept(ModItems.URILIUM_MULTITOOL.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register((eventBus));
    }
}
