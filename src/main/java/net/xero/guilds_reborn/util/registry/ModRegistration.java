package net.xero.guilds_reborn.util.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xero.guilds_reborn.GuildsRebornMod;

public class ModRegistration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GuildsRebornMod.MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GuildsRebornMod.MOD_ID);

    public static void init() {
        // Register items and stuff here
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> TPO_MEDALLION = ITEMS.register("tpo_medallion",
            () -> new Item(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> AEG_MEDALLION = ITEMS.register("aeg_medallion",
            () -> new Item(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
    public static final RegistryObject<Item> NAR_MEDALLION = ITEMS.register("nar_medallion",
            () -> new Item(new Item.Properties().tab(ModSetup.ITEM_GROUP)));
}
