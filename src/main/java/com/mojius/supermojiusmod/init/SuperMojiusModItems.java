package com.mojius.supermojiusmod.init;

import com.mojius.supermojiusmod.SuperMojiusMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SuperMojiusModItems {
    public static Item register(Item item, String id){
        // Create the identifier for the particular item
        Identifier itemID = Identifier.of(SuperMojiusMod.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        return registeredItem;

    }

    public static final Item SUSPICIOUS_SUBSTANCE = register(
            new Item(
                    new Item.Settings()),
                "suspicious_substance"
    );

    public static void initialize(){
        // Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(SuperMojiusModItems.SUSPICIOUS_SUBSTANCE));
    }

}
