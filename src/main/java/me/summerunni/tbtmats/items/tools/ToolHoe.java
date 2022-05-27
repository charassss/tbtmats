package me.summerunni.tbtmats.items.tools;

import me.summerunni.tbtmats.TBTMats;
import me.summerunni.tbtmats.init.ModItems;
import me.summerunni.tbtmats.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {
    public ToolHoe(String name, CreativeTabs tab, ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(tab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        TBTMats.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
