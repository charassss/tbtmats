package me.summerunni.tbtmats.init;

import me.summerunni.tbtmats.TBTMats;
import me.summerunni.tbtmats.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block AGC_BLOCK = new BlockBase("agc_block", Material.IRON, TBTMats.BLOCK_TAB);
    public static final Block AGC_ORE = new BlockBase("agc_ore", Material.ROCK, TBTMats.BLOCK_TAB);
}
