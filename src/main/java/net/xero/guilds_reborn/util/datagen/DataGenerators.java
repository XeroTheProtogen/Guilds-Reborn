package net.xero.guilds_reborn.util.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.xero.guilds_reborn.GuildsRebornMod;

@Mod.EventBusSubscriber(modid = GuildsRebornMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeClient()) {
            generator.addProvider(new GRItemModels(generator, event.getExistingFileHelper()));
            generator.addProvider(new GRLanguageProvider(generator, "en_us"));
        }
    }
}
