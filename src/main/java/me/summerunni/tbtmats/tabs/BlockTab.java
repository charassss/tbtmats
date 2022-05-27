package me.summerunni.tbtmats.tabs;

import me.summerunni.tbtmats.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class BlockTab extends CreativeTabs {

    public BlockTab() {
        super("block_tab");
    }

    @Override
    public @NotNull ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(ModBlocks.AGC_BLOCK));
    }
}
