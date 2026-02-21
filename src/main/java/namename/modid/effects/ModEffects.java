package namename.modid.effects;

import namename.modid.Altcookiemod;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;

public class ModEffects implements ModInitializer {
        public static final Holder<MobEffect> KABOOM =
                Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(Altcookiemod.MOD_ID, "kaboom"), new KaboomEffect());

        @Override
        public void onInitialize() {
            // ...
        }
    }

