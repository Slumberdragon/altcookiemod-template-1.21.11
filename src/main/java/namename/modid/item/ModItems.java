package namename.modid.item;

import namename.modid.Altcookiemod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;

import java.util.function.Function;


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

    public static final Item SNOWCOOKIE = register("snowcookie", Item::new, new Item.Properties());
    public static final Item CREEPERCOOKIE = register("creepercookie", Item::new, new Item.Properties());
    public static final Item CHARGED_CREEPERCOOKIE = register("charged_creepercookie", Item::new, new Item.Properties());
    public static final Item CUTECOOKIE = register("cutecookie", Item::new, new Item.Properties());
    public static final Item DIRTCOOKIE = register("dirtcookie", Item::new, new Item.Properties());


    private static Item registerItem(String name, Item item) {

        return item;


    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(entries -> {
            entries.accept(SNOWCOOKIE);
            entries.accept(CREEPERCOOKIE);
            entries.accept(CHARGED_CREEPERCOOKIE);
            entries.accept(CUTECOOKIE);
            entries.accept(DIRTCOOKIE);

        });
    }
}
