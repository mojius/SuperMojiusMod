package com.mojius.supermojiusmod.init;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.recipe.BrewingRecipeRegistry.Builder;
import net.minecraft.registry.Registries;



public class SuperMojiusModPotions {
    public static final Potion EXAMPLE_POTION =
            Registry.register(Registries.POTION, Identifier.of("supermojiusmod", "example_potion"),
            new Potion(new StatusEffectInstance(StatusEffects.WITHER, 3600, 0)));


    public static void init(Builder builder){
        registerPotionRecipe(builder, EXAMPLE_POTION, Items.WITHER_ROSE, Potions.AWKWARD);
    }

    public static void registerPotionRecipe(Builder builder, Potion potion, Item ingredient, RegistryEntry<Potion> base){
        RegistryEntry<Potion> potionKey = Registries.POTION.getEntry(potion);
        builder.registerPotionRecipe(base, ingredient, potionKey);
    }


}
