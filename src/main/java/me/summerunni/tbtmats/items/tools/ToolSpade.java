package me.summerunni.tbtmats.items.tools;

import me.summerunni.tbtmats.TBTMats;
import me.summerunni.tbtmats.init.ModItems;
import me.summerunni.tbtmats.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel {
    public ToolSpade(String name, CreativeTabs tab, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        TBTMats.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
