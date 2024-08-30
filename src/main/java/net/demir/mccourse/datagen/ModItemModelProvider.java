package net.demir.mccourse.datagen;

import net.demir.mccourse.MCCourseMod;
import net.demir.mccourse.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.URILIUM);
        simpleItem(ModItems.URILIUM_BAR);

        handheldItem(ModItems.URILIUM_SWORD);
        handheldItem(ModItems.URILIUM_PICKAXE);
        handheldItem(ModItems.URILIUM_AXE);
        handheldItem(ModItems.URILIUM_SHOVEL);
        handheldItem(ModItems.URILIUM_HOE);
        handheldItem(ModItems.URILIUM_MULTITOOL);

    }


    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(MCCourseMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MCCourseMod.MOD_ID,"item/"+item.getId().getPath()));
    }
}
