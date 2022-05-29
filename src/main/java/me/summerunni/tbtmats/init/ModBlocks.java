package me.summerunni.tbtmats.init;

import me.summerunni.tbtmats.TBTMats;
import me.summerunni.tbtmats.blocks.AGCBlock;
import me.summerunni.tbtmats.blocks.AGCOre;
import me.summerunni.tbtmats.blocks.BXBlock;
import me.summerunni.tbtmats.blocks.BXOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<>();

    //normal blocks
    public static final Block AGC_BLOCK = new AGCBlock("agc_block", Material.IRON, TBTMats.BLOCK_TAB);
    public static final Block AGC_ORE = new AGCOre("agc_ore", Material.ROCK, TBTMats.BLOCK_TAB);

    //tie-in blocks
    public static final Block BX_BLOCK = new BXBlock("bx_block", Material.IRON, TBTMats.TieIn_Tab);
    public static final Block BX_ORE = new BXOre("bx_ore", Material.ROCK, TBTMats.TieIn_Tab);
}
