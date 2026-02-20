package namename.modid.item;

import namename.modid.Altcookiemod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import namename.modid.item.ModItems;

/// this is a comment stating that ItemGroup -> .world.item.CreativeModeTab

public class ModItemGroups {

    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Altcookiemod.MOD_ID, "creative_tab"));
    public static final CreativeModeTab COOKIES_ITEMS_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.SNOWCOOKIE))
            .title(Component.translatable("itemGroup.altcookiemod"))
            .displayItems((params, output) -> {
                output.accept(ModItems.SNOWCOOKIE);
                output.accept(ModItems.CREEPERCOOKIE);
                output.accept(ModItems.CHARGED_CREEPERCOOKIE);
                output.accept(ModItems.CUTECOOKIE);
                output.accept(ModItems.DIRTCOOKIE);

            }).build();

}
