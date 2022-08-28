package net.xero.guilds_reborn.util.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;
import net.xero.guilds_reborn.GuildsRebornMod;
import net.xero.guilds_reborn.util.registry.ModRegistration;

import static net.xero.guilds_reborn.util.registry.ModSetup.GUILD_MEDALLIONS_NAME;
import static net.xero.guilds_reborn.util.registry.ModSetup.GUILD_WEAPONS_NAME;

public class GRLanguageProvider extends LanguageProvider {
    public GRLanguageProvider(DataGenerator gen, String locale) {
        super(gen, GuildsRebornMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + GUILD_MEDALLIONS_NAME, "Guild Medallions");
        add("itemGroup." + GUILD_WEAPONS_NAME, "Guild Weapons");

        add(ModRegistration.AEG_MEDALLION.get(), "AEG Medallion");
        add(ModRegistration.NAR_MEDALLION.get(), "NAR Medallion");
        add(ModRegistration.TPO_MEDALLION.get(), "TPO Medallion");
        add(ModRegistration.NAGINATA_OF_PURITY.get(), "Naginata Of Purity");
        add(ModRegistration.ELECTRO_BLADE.get(), "Electro-Blade");
        add(ModRegistration.HAZELS_SCYTHE.get(), "Hazel's Scythe");
    }
}
