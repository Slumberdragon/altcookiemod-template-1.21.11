package namename.modid;

import namename.modid.effects.KaboomEffect;
import namename.modid.item.ModItemGroups;
import namename.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Altcookiemod implements ModInitializer {
	public static final String MOD_ID = "altcookiemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();


	}





}


