package me.summerunni.tbtmats.init;

import me.summerunni.tbtmats.TBTMats;
import me.summerunni.tbtmats.armors.ArmorBase;
import me.summerunni.tbtmats.items.EffectFoodBase;
import me.summerunni.tbtmats.items.FoodBase;
import me.summerunni.tbtmats.items.ItemBase;
import me.summerunni.tbtmats.items.tools.*;
import me.summerunni.tbtmats.util.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();

    //tools materials
    public static final Item.ToolMaterial MATERIAL_AGC = EnumHelper.addToolMaterial("material_agc", 4, 3572, 10.0F, 4.5F, 15);
    public static final Item.ToolMaterial MATERIAL_BX = EnumHelper.addToolMaterial("material_bx", 5, 5623, 15.0F, 6.5F, 25);

    //armors materials
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_AGC = EnumHelper.addArmorMaterial("armor_material_agc", Reference.MODID + ":agc_ingot", 40, new int[]{5, 8, 10, 6}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_BX = EnumHelper.addArmorMaterial("armor_material_bx", Reference.MODID + ":bx_ingot", 45, new int[]{6, 9, 13, 7}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);

    //normal items
    public static final Item AGC_INGOT = new ItemBase("agc_ingot", TBTMats.MATERIAL_TAB);
    public static final Item AGC_STICK = new ItemBase("agc_stick", TBTMats.Misc_TAB);
    public static final Item COMPRESSED_WORKBENCH = new ItemBase("compressed_workbench", TBTMats.Misc_TAB);
    public static final Item SMALL_THREAD = new ItemBase("small_thread", TBTMats.Misc_TAB);
    public static final Item DOUBLE_STICK = new ItemBase("double_stick", TBTMats.Misc_TAB);

    //tools
    public static final ItemSword AGC_SWORD = new ToolSword("agc_sword", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemPickaxe AGC_PICKAXE = new ToolPickaxe("agc_pickaxe", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemSpade AGC_SHOVEL = new ToolSpade("agc_shovel", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemHoe AGC_HOE = new ToolHoe("agc_hoe", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemAxe AGC_AXE = new ToolAxe("agc_axe", TBTMats.Tool_TAB, MATERIAL_AGC);

    //foods
    public static final ItemFood AGC_APPLE = new EffectFoodBase("agc_apple", 12, 0.6F, false, TBTMats.Food_TAB, new PotionEffect(MobEffects.RESISTANCE, 20 * 60 * 2, 2, false, true));
    public static final ItemFood SLIDECHICKEN = new FoodBase("slide_chicken", 20, 1.0F, false, TBTMats.Food_TAB);

    //armors
    public static final Item AGC_HELMET = new ArmorBase("agc_helmet", ARMOR_MATERIAL_AGC, 1, EntityEquipmentSlot.HEAD, TBTMats.Armor_TAB);
    public static final Item AGC_CHESTPLATE = new ArmorBase("agc_chestplate", ARMOR_MATERIAL_AGC, 1, EntityEquipmentSlot.CHEST, TBTMats.Armor_TAB);
    public static final Item AGC_LEGGINGS = new ArmorBase("agc_leggings", ARMOR_MATERIAL_AGC, 2, EntityEquipmentSlot.LEGS, TBTMats.Armor_TAB);
    public static final Item AGC_BOOTS = new ArmorBase("agc_boots", ARMOR_MATERIAL_AGC, 1, EntityEquipmentSlot.FEET, TBTMats.Armor_TAB);


    //tie-in items
    public static final Item BX_INGOT = new ItemBase("bx_ingot", TBTMats.TieIn_Tab);
    public static final Item BX_NUGGET = new ItemBase("bx_nugget", TBTMats.TieIn_Tab);
    public static final Item BX_SWORD = new ToolSword("bx_sword", TBTMats.TieIn_Tab, MATERIAL_BX);
    public static final Item BX_PICKAXE = new ToolPickaxe("bx_pickaxe", TBTMats.TieIn_Tab, MATERIAL_BX);
    public static final Item BX_SHOVEL = new ToolSpade("bx_shovel", TBTMats.TieIn_Tab, MATERIAL_BX);
    public static final Item BX_HOE = new ToolHoe("bx_hoe", TBTMats.TieIn_Tab, MATERIAL_BX);
    public static final Item BX_AXE = new ToolAxe("bx_axe", TBTMats.TieIn_Tab, MATERIAL_BX);
    public static final Item BX_HELMET = new ArmorBase("bx_helmet", ARMOR_MATERIAL_BX, 1, EntityEquipmentSlot.HEAD, TBTMats.TieIn_Tab);
    public static final Item BX_CHESTPLATE = new ArmorBase("bx_chestplate", ARMOR_MATERIAL_BX, 1, EntityEquipmentSlot.CHEST, TBTMats.TieIn_Tab);
    public static final Item BX_LEGGINGS = new ArmorBase("bx_leggings", ARMOR_MATERIAL_BX, 2, EntityEquipmentSlot.LEGS, TBTMats.TieIn_Tab);
    public static final Item BX_BOOTS = new ArmorBase("bx_boots", ARMOR_MATERIAL_BX, 1, EntityEquipmentSlot.FEET, TBTMats.TieIn_Tab);

}
