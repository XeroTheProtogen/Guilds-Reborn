package net.xero.guilds_reborn.item.client;

import net.minecraft.resources.ResourceLocation;
import net.xero.guilds_reborn.GuildsRebornMod;
import net.xero.guilds_reborn.item.NaginataOfPurityItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NaginataOfPurityModel extends AnimatedGeoModel<NaginataOfPurityItem> {
    @Override
    public ResourceLocation getModelLocation(NaginataOfPurityItem object) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "geo/item/naginata_of_purity.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(NaginataOfPurityItem object) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "textures/item/naginata_of_purity.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(NaginataOfPurityItem animatable) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "animations/item/naginata_of_purity.animation.json");
    }
}
