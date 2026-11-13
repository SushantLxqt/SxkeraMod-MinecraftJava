package com.example.sxkera.item;

import com.example.sxkera.Sxkera;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet");

    private static Item registerItem(String name) {

        ResourceKey<Item> itemKey = ResourceKey.create(
                Registries.ITEM,
                Sxkera.id(name)
        );

        Item item = new Item(
                new Item.Properties().setId(itemKey)
        );

        return Registry.register(BuiltInRegistries.ITEM, itemKey, item);
    }

    public static void registerModItems() {

        Sxkera.LOGGER.info("Registering ModItems for " + Sxkera.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register(entries -> entries.accept(PINK_GARNET));
    }
}
