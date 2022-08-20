package net.xero.guilds_reborn.item.client;

import net.xero.guilds_reborn.item.NaginataOfPurityItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class NaginataOfPurityRenderer extends GeoItemRenderer<NaginataOfPurityItem> {
    public NaginataOfPurityRenderer() {
        super(new NaginataOfPurityModel());
    }
}
