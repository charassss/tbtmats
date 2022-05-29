package me.summerunni.tbtmats.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BXBlock extends BlockBase {

    public BXBlock(String name, Material material, CreativeTabs tab) {
        super(name, material, tab);

        setSoundType(SoundType.STONE);
        setHardness(35.0F);
        setResistance(55.0F);
        setHarvestLevel("pickaxe", 3);
    }
}
