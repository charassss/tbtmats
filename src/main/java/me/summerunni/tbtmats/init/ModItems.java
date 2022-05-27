package me.summerunni.tbtmats.init;

import me.summerunni.tbtmats.TBTMats;
import me.summerunni.tbtmats.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();
    public static final Item AGC_INGOT = new ItemBase("agc_ingot", TBTMats.MATERIAL_TAB);
}
