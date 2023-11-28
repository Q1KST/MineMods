package net.kostik.kostikmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab KOSTIKMOD_TAB = new CreativeModeTab("kostikmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MANDARIN.get());
        }
    };

}
