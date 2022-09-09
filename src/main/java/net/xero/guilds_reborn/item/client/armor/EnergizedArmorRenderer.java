package net.xero.guilds_reborn.item.client.armor;

import net.xero.guilds_reborn.item.EnergizedArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class EnergizedArmorRenderer extends GeoArmorRenderer<EnergizedArmorItem> {
    public EnergizedArmorRenderer() {
        super(new EnergizedArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoot";
        this.leftBootBone = "armorLeftBoot";
    }
}
