package net.graywolf857.learningmod.item;

import net.graywolf857.learningmod.LearningMod;
import net.graywolf857.learningmod.item.custom.BlinkDagger;
import net.graywolf857.learningmod.item.custom.MetalDetectorItem;
import net.graywolf857.learningmod.item.custom.TNTWand;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LearningMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties()));

    public static final RegistryObject<Item> TNT_WAND = ITEMS.register("tnt_wand",
            () -> new TNTWand(new Item.Properties()));

    public static final RegistryObject<Item> BLINK_DAGGER = ITEMS.register("blink_dagger",
            () -> new BlinkDagger(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
