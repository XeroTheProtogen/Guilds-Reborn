package net.xero.guilds_reborn.util.registry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.xero.guilds_reborn.GuildsRebornMod;

@Mod.EventBusSubscriber(modid = GuildsRebornMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {
    public static final String TAB_NAME = "guilds_reborn";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModRegistration.TPO_MEDALLION.get());
        }
    };
    public static void init(final FMLCommonSetupEvent event) {
    }
}
