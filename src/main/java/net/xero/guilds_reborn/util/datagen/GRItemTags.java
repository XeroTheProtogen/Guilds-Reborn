package net.xero.guilds_reborn.util.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.xero.guilds_reborn.GuildsRebornMod;
import net.xero.guilds_reborn.util.registry.ModRegistration;
import org.jetbrains.annotations.NotNull;

public class GRItemTags extends ItemTagsProvider {
    public GRItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, GuildsRebornMod.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(ModRegistration.GUILD_MEDALLION)
                .add(ModRegistration.TPO_MEDALLION.get())
                .add(ModRegistration.AEG_MEDALLION.get())
                .add(ModRegistration.NAR_MEDALLION.get());
    }

    @NotNull
    @Override
    public String getName() {
        return "Guilds Reborn Tags";
    }
}
