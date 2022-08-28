package net.xero.guilds_reborn.item.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.xero.guilds_reborn.item.HazelsScytheItem;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class HazelsScytheRenderer extends GeoItemRenderer<HazelsScytheItem> {
    public HazelsScytheRenderer() {
        super(new HazelsScytheModel());
    }

    @Override
    public RenderType getRenderType(HazelsScytheItem animatable, float partialTicks, PoseStack stack, @Nullable MultiBufferSource renderTypeBuffer, @Nullable VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
        return RenderType.itemEntityTranslucentCull(getTextureLocation(animatable));
    }
}
