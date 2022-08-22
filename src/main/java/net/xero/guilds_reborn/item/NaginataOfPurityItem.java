package net.xero.guilds_reborn.item;

import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.network.PacketDistributor;
import net.xero.guilds_reborn.item.client.NaginataOfPurityRenderer;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.network.GeckoLibNetwork;
import software.bernie.geckolib3.network.ISyncable;
import software.bernie.geckolib3.util.GeckoLibUtil;

import java.util.function.Consumer;

public class NaginataOfPurityItem extends SwordItem implements IAnimatable, ISyncable {
    private static final String CONTROLLER_NAME = "controller";
    private static final int ANIM_HIT = 0;
    private static final int ANIM_IDLE = 0;

    public AnimationFactory factory = new AnimationFactory(this);


    public NaginataOfPurityItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
        GeckoLibNetwork.registerSyncable(this);
    }

    @Override
    public void initializeClient(Consumer<IItemRenderProperties> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IItemRenderProperties() {
            private final BlockEntityWithoutLevelRenderer renderer = new NaginataOfPurityRenderer();

            @Override
            public BlockEntityWithoutLevelRenderer getItemStackRenderer() {
                return renderer;
            }
        });
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void registerControllers(AnimationData data) {
        AnimationController controller = new AnimationController(this, CONTROLLER_NAME,
                1, this::predicate);
        data.addAnimationController(controller);
    }

    private <E extends SwordItem & IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        if (!pLevel.isClientSide && pIsSelected) {
            Player player = (Player) pEntity;
            final int id = GeckoLibUtil.guaranteeIDForStack(pStack, (ServerLevel) pLevel);
            final PacketDistributor.PacketTarget target = PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> player);
            if (!player.swinging) {
                if (player.getMainHandItem().getItem() == NaginataOfPurityItem.this) {
                    GeckoLibNetwork.syncAnimation(target, this, id, ANIM_HIT);
                }
            }
        }

        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
    }

    @Override
    public void onAnimationSync(int id, int state) {
        final AnimationController<?> controller = GeckoLibUtil.getControllerForID(this.factory, id, CONTROLLER_NAME);
        if (state == ANIM_IDLE) {
            if (controller.getAnimationState() == AnimationState.Stopped) {
                controller.markNeedsReload();
                controller.setAnimation(new AnimationBuilder().addAnimation("tpo_naginata_idle", true));
            }
        }
    }
}
