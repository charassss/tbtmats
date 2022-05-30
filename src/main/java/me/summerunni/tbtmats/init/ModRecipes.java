package me.summerunni.tbtmats.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        //register recipes
        GameRegistry.addSmelting(ModBlocks.AGC_ORE, new ItemStack(ModItems.AGC_INGOT), 1.0f);
        GameRegistry.addSmelting(ModBlocks.BX_ORE, new ItemStack(ModItems.BX_INGOT), 1.0f);
        //delete recipes

    }

}
