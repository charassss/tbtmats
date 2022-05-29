package me.summerunni.tbtmats.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class AGCBlock extends BlockBase {

    public AGCBlock(String name, Material material, CreativeTabs tab) {
        super(name, material, tab);

        setSoundType(SoundType.STONE);
        setHardness(50.0F);
        setResistance(55.0F);
        setHarvestLevel("pickaxe", 3);


    }

}
