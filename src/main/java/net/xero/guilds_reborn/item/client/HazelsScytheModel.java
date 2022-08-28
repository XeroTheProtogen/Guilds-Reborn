package net.xero.guilds_reborn.item.client;

import net.minecraft.resources.ResourceLocation;
import net.xero.guilds_reborn.GuildsRebornMod;
import net.xero.guilds_reborn.item.HazelsScytheItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HazelsScytheModel extends AnimatedGeoModel<HazelsScytheItem> {
    @Override
    public ResourceLocation getModelLocation(HazelsScytheItem object) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "geo/item/hazels_scythe.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(HazelsScytheItem object) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "textures/item/hazels_scythe.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(HazelsScytheItem animatable) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "animations/item/hazels_scythe.animation.json");
    }
}
