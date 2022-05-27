package me.summerunni.tbtmats.items;

import me.summerunni.tbtmats.TBTMats;
import me.summerunni.tbtmats.init.ModItems;
import me.summerunni.tbtmats.util.IHasModel;
import me.summerunni.tbtmats.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        TBTMats.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
