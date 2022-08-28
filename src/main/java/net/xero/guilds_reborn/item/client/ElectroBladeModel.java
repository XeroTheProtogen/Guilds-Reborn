package net.xero.guilds_reborn.item.client;

import net.minecraft.resources.ResourceLocation;
import net.xero.guilds_reborn.GuildsRebornMod;
import net.xero.guilds_reborn.item.ElectroBladeItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ElectroBladeModel extends AnimatedGeoModel<ElectroBladeItem> {
    @Override
    public ResourceLocation getModelLocation(ElectroBladeItem object) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "geo/item/electro_blade.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ElectroBladeItem object) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "textures/item/electro_blade.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ElectroBladeItem animatable) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "animations/item/electro_blade.animation.json");
    }
}
