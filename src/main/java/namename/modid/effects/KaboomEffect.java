package namename.modid.effects;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;

import static net.minecraft.sounds.SoundEvents.*;
import static net.minecraft.world.level.block.entity.BeaconBlockEntity.playSound;


public class KaboomEffect extends MobEffect {
    public KaboomEffect() {
        // category: StatusEffectCategory - describes if the effect is helpful (BENEFICIAL), harmful (HARMFUL) or useless (NEUTRAL)
        // color: int - Color is the color assigned to the effect (in RGB)
        super(MobEffectCategory.HARMFUL, 0x09b9b3);
    }

    // Called every tick to check if the effect can be applied or not
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the effect every tick
        return true;
    }

    // Called when the effect is applied.
    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
        if (entity instanceof Player) {

            ((Player) entity).playSound(LIGHTNING_BOLT_IMPACT, 2f, 0.7f);
            //((Player) entity).kill((ServerLevel) level);
            ((Player) entity).attack((Player) entity);




        }

        return super.applyEffectTick(level, entity, amplifier);
    }

    }


