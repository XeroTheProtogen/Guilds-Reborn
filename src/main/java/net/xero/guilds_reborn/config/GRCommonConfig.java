package net.xero.guilds_reborn.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class GRCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> MEDALLIONS_PER_RANK_UP;

    static {
        BUILDER.push("Guilds Reborn Configs");

        MEDALLIONS_PER_RANK_UP = BUILDER.comment("Amount Of Tokens Needed Per Rank-up")
                .defineInRange("Tokens Per Rank-up", 10, 5, 20);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
