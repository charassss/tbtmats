package me.summerunni.tbtmats.tabs;

import me.summerunni.tbtmats.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ArmorTab extends CreativeTabs {

    public ArmorTab() {
        super("armor_tab");
    }

    @Override
    public @NotNull ItemStack getTabIconItem() {
        return new ItemStack(ModItems.AGC_CHESTPLATE);
    }

}
