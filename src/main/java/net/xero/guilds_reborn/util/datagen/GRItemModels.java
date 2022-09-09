package net.xero.guilds_reborn.util.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.xero.guilds_reborn.GuildsRebornMod;
import net.xero.guilds_reborn.util.registry.ModRegistration;

public class GRItemModels extends ItemModelProvider {
    public GRItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GuildsRebornMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Generates Item Models

        //Medallions
        singleTexture(ModRegistration.TPO_MEDALLION.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/tpo_medallion"));
        singleTexture(ModRegistration.AEG_MEDALLION.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/aeg_medallion"));
        singleTexture(ModRegistration.NAR_MEDALLION.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/nar_medallion"));

        // Nar Armor
        singleTexture(ModRegistration.ENERGIZED_HELMET.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/energized_helmet"));
        singleTexture(ModRegistration.ENERGIZED_CHESTPLATE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/energized_chestplate"));
        singleTexture(ModRegistration.ENERGIZED_LEGGINGS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/energized_leggings"));
        singleTexture(ModRegistration.ENERGIZED_BOOTS.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/energized_boots"));
    }
}
