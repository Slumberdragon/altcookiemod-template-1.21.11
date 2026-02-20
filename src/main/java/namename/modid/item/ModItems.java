package namename.modid.item;

import namename.modid.Altcookiemod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final Item SNOWCOOKIE = registerItem( "snowcookie", new Item(new Item.Properties()));
    public static final Item CREEPERCOOKIE = registerItem( "creepercookie", new Item(new Item.Properties()));
    public static final Item CHARGED_CREEPERCOOKIE = registerItem( "charged_creepercookie", new Item(new Item.Properties()));
    public static final Item CUTECOOKIE = registerItem( "cutecookie", new Item(new Item.Properties()));
    public static final Item DIRTCOOKIE = registerItem( "dirtcookie", new Item(new Item.Properties()));



    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, Identifier.parse("altcookiemod", "snowcookie", SNOWCOOKIE));
        return Registry.register(Registries.ITEM, Identifier.parse("altcookiemod", "creepercookie", CREEPERCOOKIE));
        return Registry.register(Registries.ITEM, Identifier.parse("altcookiemod", "charged_creepercookie", CHARGED_CREEPERCOOKIE));
        return Registry.register(Registries.ITEM, Identifier.parse("altcookiemod", "cutecookie", CUTECOOKIE));
        return Registry.register(Registries.ITEM, Identifier.parse("altcookiemod", "dirtcookie", DIRTCOOKIE));

    }


    public static void registerModItems() {
        Altcookiemod.LOGGER.info("Registering Mod Items for" + Altcookiemod.MOD_ID);


        };
    }

