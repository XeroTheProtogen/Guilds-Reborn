package net.xero.guilds_reborn.util.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.xero.guilds_reborn.GuildsRebornMod;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = GuildsRebornMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {
    public static final String GUILD_MEDALLIONS_NAME = "guild_medallions";
    public static final String GUILD_WEAPONS_NAME = "guild_weapons";

    public static final CreativeModeTab GUILD_MEDALLIONS = new CreativeModeTab(GUILD_MEDALLIONS_NAME) {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModRegistration.TPO_MEDALLION.get());
        }
    };

    public static final CreativeModeTab GUILD_WEAPONS = new CreativeModeTab(GUILD_WEAPONS_NAME) {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModRegistration.NAGINATA_OF_PURITY.get());
        }
    };

    public static void setup() {
    }
    public static void init(final FMLCommonSetupEvent event) {
    }
}
