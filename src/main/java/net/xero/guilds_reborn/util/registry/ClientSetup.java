package net.xero.guilds_reborn.util.registry;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.xero.guilds_reborn.GuildsRebornMod;
import net.xero.guilds_reborn.item.EnergizedArmorItem;
import net.xero.guilds_reborn.item.client.armor.EnergizedArmorRenderer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = GuildsRebornMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(EnergizedArmorItem.class, new EnergizedArmorRenderer());
    }
    public static void init(final FMLClientSetupEvent event) {
    }
}
