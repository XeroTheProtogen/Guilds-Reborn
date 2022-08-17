package net.xero.guilds_reborn.util.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.xero.guilds_reborn.GuildsRebornMod;

public class GRBlockTags extends BlockTagsProvider {
    public GRBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, GuildsRebornMod.MOD_ID, helper);
    }
}
