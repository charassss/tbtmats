package me.summerunni.tbtmats.init;

import me.summerunni.tbtmats.TBTMats;
import me.summerunni.tbtmats.items.ItemBase;
import me.summerunni.tbtmats.items.tools.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.*;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item.ToolMaterial MATERIAL_AGC = EnumHelper.addToolMaterial("material_agc", 3, 3500, 10.0F, 4.5F, 15);

    public static final Item AGC_INGOT = new ItemBase("agc_ingot", TBTMats.MATERIAL_TAB);
    public static final ItemSword AGC_SWORD = new ToolSword("agc_sword", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemPickaxe AGC_PICKAXE = new ToolPickaxe("agc_pickaxe", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemSpade AGC_SHOVEL = new ToolSpade("agc_shovel", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemHoe AGC_HOE = new ToolHoe("agc_hoe", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemAxe AGC_AXE = new ToolAxe("agc_axe", TBTMats.Tool_TAB, MATERIAL_AGC);
}
