package com.gyro.gyroswogartifacts.item;


import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

import java.util.function.Supplier;

public class MorphingSwordItem extends SwordItem {

    private MorphingSwordItem toMorphSword;
    private SoundEvent morphingSoundEvent;
    public MorphingSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack heldSword = pPlayer.getItemInHand(pUsedHand);
        if (!pPlayer.isShiftKeyDown() || toMorphSword == null || pUsedHand != InteractionHand.MAIN_HAND)
            return super.use(pLevel, pPlayer, pUsedHand);
        if (pLevel.isClientSide) {
            playMorphingSound(pPlayer);
            return InteractionResultHolder.sidedSuccess(heldSword, true);
        }
        morphSword(pPlayer, pUsedHand);
        return InteractionResultHolder.sidedSuccess(heldSword, true);
    }

    private void morphSword(Player pPlayer, InteractionHand pUsedHand) {
        CompoundTag oldSwordTag = pPlayer.getItemInHand(pUsedHand).getTag();
        cooldownMorphingSword(pPlayer, 20);
        pPlayer.setItemInHand(pUsedHand, new ItemStack(toMorphSword));
        pPlayer.getItemInHand(pUsedHand).setTag(oldSwordTag);

    }

    private void playMorphingSound(Player pPlayer) {
        pPlayer.level.playSound(pPlayer, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(),
                morphingSoundEvent, pPlayer.getSoundSource(), 1.0F, 1.0F);
    }

    private void cooldownMorphingSword(Player pPlayer, int cooldown) {
        pPlayer.getCooldowns().addCooldown(this, cooldown);
        pPlayer.getCooldowns().addCooldown(toMorphSword, cooldown);
    }

    public void setAlternateItems(Supplier<MorphingSwordItem> demonicSwordItem) {
        this.toMorphSword = demonicSwordItem.get();
    }

    public void setMorphingSoundEvent(Supplier<SoundEvent> morphingSoundEvent) {
        this.morphingSoundEvent = morphingSoundEvent.get();
    }
}
