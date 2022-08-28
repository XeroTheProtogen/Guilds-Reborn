package net.xero.guilds_reborn.util.material;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.xero.guilds_reborn.util.registry.ModRegistration;

public class GRTools {
    public static final ForgeTier TPO_WEAPONS = new ForgeTier(5, 1568, 4.0F, 5.0F, 22, BlockTags.NEEDS_DIAMOND_TOOL, () ->
        Ingredient.of(ModRegistration.TPO_MEDALLION.get()));
    public static final ForgeTier NAR_WEAPONS = new ForgeTier(5, 1568, 4.0F, 5.0F, 22, BlockTags.NEEDS_DIAMOND_TOOL, () ->
        Ingredient.of(ModRegistration.NAR_MEDALLION.get()));
    public static final ForgeTier AEG_WEAPONS = new ForgeTier(5, 1568, 4.0F, 5.0F, 22, BlockTags.NEEDS_DIAMOND_TOOL, () ->
        Ingredient.of(ModRegistration.AEG_MEDALLION.get()));
}
