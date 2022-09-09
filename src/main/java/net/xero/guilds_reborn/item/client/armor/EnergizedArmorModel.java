package net.xero.guilds_reborn.item.client.armor;

import net.minecraft.resources.ResourceLocation;
import net.xero.guilds_reborn.GuildsRebornMod;
import net.xero.guilds_reborn.item.EnergizedArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EnergizedArmorModel extends AnimatedGeoModel<EnergizedArmorItem> {
    @Override
    public ResourceLocation getModelLocation(EnergizedArmorItem object) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "geo/armor/energized_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(EnergizedArmorItem object) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "textures/armor/energized_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(EnergizedArmorItem animatable) {
        return new ResourceLocation(GuildsRebornMod.MOD_ID, "animations/armor/energized_armor.animation.json");
    }
}
