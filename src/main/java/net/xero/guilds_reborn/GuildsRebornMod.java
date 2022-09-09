package net.xero.guilds_reborn;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.xero.guilds_reborn.config.GRCommonConfig;
import net.xero.guilds_reborn.util.registry.ClientSetup;
import net.xero.guilds_reborn.util.registry.ModRegistration;
import net.xero.guilds_reborn.util.registry.ModSetup;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.network.GeckoLibNetwork;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(GuildsRebornMod.MOD_ID)
public class GuildsRebornMod
{
    public static final String MOD_ID = "guilds_reborn";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public GuildsRebornMod()
    {

        //Register the Register
        ModRegistration.init();

        //Activate Geckolib & Geckolib Network
        GeckoLib.initialize();
        GeckoLibNetwork.initialize();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GRCommonConfig.SPEC, "guilds_reborn-common.toml");

        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(ModSetup::init);
        // Register 'ClientSetup::init' to be called at mod setup time (client only)
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> eventBus.addListener(ClientSetup::init));
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
