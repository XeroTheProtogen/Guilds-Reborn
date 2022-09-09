package net.xero.guilds_reborn.util.material;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.xero.guilds_reborn.GuildsRebornMod;
import net.xero.guilds_reborn.util.registry.ModRegistration;

import java.util.function.Supplier;

public enum GRArmorMaterials implements ArmorMaterial {
    TPO_ARMOR("tpo_armor", 42, new int[]{4, 7, 10, 4}, 18, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.5F, 0.15F, () -> Ingredient.of(ModRegistration.AEG_MEDALLION.get())),

    NAR_ARMOR("nar_armor", 42, new int[]{4, 7, 10, 4}, 18, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.5F, 0.15F, () -> Ingredient.of(ModRegistration.NAR_MEDALLION.get())),

    AEG_ARMOR("aeg_armor", 42, new int[]{4, 7, 10, 4}, 18, SoundEvents.ARMOR_EQUIP_NETHERITE,
            3.5F, 0.15F, () -> Ingredient.of(ModRegistration.AEG_MEDALLION.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    GRArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }


    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return GuildsRebornMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
