package net.kostik.kostikmod.item;

import net.kostik.kostikmod.Kostikmod;
import net.kostik.kostikmod.item.custom.EightBallItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {


    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Kostikmod.MOD_ID);
        public static final RegistryObject<Item> MANDARIN = ITEMS.register("mandarin",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.KOSTIKMOD_TAB)));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.KOSTIKMOD_TAB).stacksTo(1)));


}
