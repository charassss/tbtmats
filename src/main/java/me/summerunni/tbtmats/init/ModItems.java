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
    public static final Item.ToolMaterial MATERIAL_AGC = EnumHelper.addToolMaterial("material_agc", 3, 3500, 10.0F, 4.5F, 15);

    //armors materials
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_AGC = EnumHelper.addArmorMaterial("armor_material_agc", Reference.MODID + ":agc_ingot", 40, new int[] {5,8,10,6}, 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    //normal items
    public static final Item AGC_INGOT = new ItemBase("agc_ingot", TBTMats.MATERIAL_TAB);

    //tools
    public static final ItemSword AGC_SWORD = new ToolSword("agc_sword", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemPickaxe AGC_PICKAXE = new ToolPickaxe("agc_pickaxe", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemSpade AGC_SHOVEL = new ToolSpade("agc_shovel", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemHoe AGC_HOE = new ToolHoe("agc_hoe", TBTMats.Tool_TAB, MATERIAL_AGC);
    public static final ItemAxe AGC_AXE = new ToolAxe("agc_axe", TBTMats.Tool_TAB, MATERIAL_AGC);

    //foods
    public static final ItemFood AGC_APPLE = new EffectFoodBase("agc_apple", 12, 0.6F, false, TBTMats.Food_TAB, new PotionEffect(MobEffects.RESISTANCE, 20*60*2, 2));
    public static final ItemFood SLIDECHICKEN = new FoodBase("slide_chicken", 15, 0.7F, false, TBTMats.Food_TAB);

    //armors
    public static final Item AGC_HELMET = new ArmorBase("agc_helmet", ARMOR_MATERIAL_AGC, 1, EntityEquipmentSlot.HEAD, TBTMats.Armor_TAB);
    public static final Item AGC_CHESTPLATE = new ArmorBase("agc_chestplate", ARMOR_MATERIAL_AGC, 1, EntityEquipmentSlot.CHEST, TBTMats.Armor_TAB);
    public static final Item AGC_LEGGINGS = new ArmorBase("agc_leggings", ARMOR_MATERIAL_AGC, 2, EntityEquipmentSlot.LEGS, TBTMats.Armor_TAB);
    public static final Item AGC_BOOTS = new ArmorBase("agc_boots", ARMOR_MATERIAL_AGC, 1, EntityEquipmentSlot.FEET, TBTMats.Armor_TAB);
}
