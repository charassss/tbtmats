package me.summerunni.tbtmats.blocks;

import me.summerunni.tbtmats.TBTMats;
import me.summerunni.tbtmats.init.ModBlocks;
import me.summerunni.tbtmats.init.ModItems;
import me.summerunni.tbtmats.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Objects;

public class BlockBase extends Block implements IHasModel {

        public BlockBase(String name, Material material, CreativeTabs tab) {
            super(material);
            setUnlocalizedName(name);
            setRegistryName(name);
            setCreativeTab(tab);

            ModBlocks.BLOCKS.add(this);
            ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
        }

        @Override
        public void registerModels() {
            TBTMats.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
        }
}
