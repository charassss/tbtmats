package me.summerunni.tbtmats.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BXOre extends BlockBase {

    public BXOre(String name, Material material, CreativeTabs tab) {
        super(name, material, tab);

        setSoundType(SoundType.STONE);
        setHardness(60.0F);
        setResistance(45.0F);
        setHarvestLevel("pickaxe", 4);
    }
}
