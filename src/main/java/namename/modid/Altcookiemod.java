package namename.modid;

import namename.modid.item.ModItemGroups;
import namename.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

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