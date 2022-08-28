package net.xero.guilds_reborn.util.registry;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xero.guilds_reborn.GuildsRebornMod;
import net.xero.guilds_reborn.item.ElectroBladeItem;
import net.xero.guilds_reborn.item.HazelsScytheItem;
import net.xero.guilds_reborn.item.NaginataOfPurityItem;
import net.xero.guilds_reborn.util.material.GRTools;

public class ModRegistration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GuildsRebornMod.MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GuildsRebornMod.MOD_ID);
    public static final DeferredRegister<Motive> PAINTINGS = DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, GuildsRebornMod.MOD_ID);

    public static void init() {
        // Register items and stuff here
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        PAINTINGS.register(eventBus);
    }

    public static final RegistryObject<Item> TPO_MEDALLION = ITEMS.register("tpo_medallion",
            () -> new Item(new Item.Properties().tab(ModSetup.GUILD_MEDALLIONS)));
    public static final RegistryObject<Item> AEG_MEDALLION = ITEMS.register("aeg_medallion",
            () -> new Item(new Item.Properties().tab(ModSetup.GUILD_MEDALLIONS)));
    public static final RegistryObject<Item> NAR_MEDALLION = ITEMS.register("nar_medallion",
            () -> new Item(new Item.Properties().tab(ModSetup.GUILD_MEDALLIONS)));

    public static final RegistryObject<Item> NAGINATA_OF_PURITY = ITEMS.register("naginata_of_purity",
            () -> new NaginataOfPurityItem(GRTools.TPO_WEAPONS, 2, 0, new Item.Properties().tab(ModSetup.GUILD_WEAPONS).stacksTo(1).durability(2348)));
    public static final RegistryObject<Item> ELECTRO_BLADE = ITEMS.register("electro_blade",
            () -> new ElectroBladeItem(GRTools.NAR_WEAPONS, 0, 2, new Item.Properties().tab(ModSetup.GUILD_WEAPONS).stacksTo(1).durability(2348)));
    public static final RegistryObject<Item> HAZELS_SCYTHE = ITEMS.register("hazels_scythe",
            () -> new HazelsScytheItem(GRTools.AEG_WEAPONS, 1, 1, new Item.Properties().tab(ModSetup.GUILD_WEAPONS).stacksTo(1).durability(2348)));

    public static final TagKey<Item> GUILD_MEDALLION = TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(GuildsRebornMod.MOD_ID, "guild_medallion"));

    public static final RegistryObject<Motive> TRUE_PERFECTION = PAINTINGS.register("true_perfection", () -> new Motive(64, 64));
    public static final RegistryObject<Motive> TECHNOLOGICAL_STRIDE = PAINTINGS.register("technological_stride", () -> new Motive(64, 64));
    public static final RegistryObject<Motive> CIVIL_DEFENCE = PAINTINGS.register("civil_defence", () -> new Motive(64, 64));
}
