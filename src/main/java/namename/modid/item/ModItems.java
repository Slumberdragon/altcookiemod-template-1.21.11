package namename.modid.item;

import namename.modid.Altcookiemod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;

import java.util.function.Function;

import static net.minecraft.core.Registry.register;

public class ModItems {

    public static <GenericItem extends Item> GenericItem register(String name, Function<Properties, GenericItem> itemFactory, Item.Properties settings) {
        // Create the item key.
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Altcookiemod.MOD_ID, name));

        // Create the item instance.
        GenericItem item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

}

    public static final Item SNOWCOOKIE = registerItem("suspicious_substance", Item::new, new Item.Properties());
    public static final Item CREEPERCOOKIE = registerItem("suspicious_substance", Item::new, new Item.Properties());
    public static final Item CHARGED_CREEPERCOOKIE = registerItem("suspicious_substance", Item::new, new Item.Properties());
    public static final Item CUTECOOKIE = registerItem("suspicious_substance", Item::new, new Item.Properties());
    public static final Item DIRTCOOKIE = registerItem("suspicious_substance", Item::new, new Item.Properties());



    private static Item registerItem(String name, Item item) {

        return register(Registries.ITEM, Identifier.parse("altcookiemod", "snowcookie", SNOWCOOKIE));
        return register(Registries.ITEM, Identifier.parse("altcookiemod", "creepercookie", CREEPERCOOKIE));
        return register(Registries.ITEM, Identifier.parse("altcookiemod", "charged_creepercookie", CHARGED_CREEPERCOOKIE));
        return register(Registries.ITEM, Identifier.parse("altcookiemod", "cutecookie", CUTECOOKIE));
        return register(Registries.ITEM, Identifier.parse("altcookiemod", "dirtcookie", DIRTCOOKIE));

    }


    public static void registerModItems() {
        Altcookiemod.LOGGER.info("Registering Mod Items for" + Altcookiemod.MOD_ID);


        };

    public static void initialize() {
    }
}

