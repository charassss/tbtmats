package me.summerunni.tbtmats;

import me.summerunni.tbtmats.init.ModRecipes;
import me.summerunni.tbtmats.proxy.CommonProxy;
import me.summerunni.tbtmats.tabs.*;
import me.summerunni.tbtmats.util.Reference;
import me.summerunni.tbtmats.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TBTMats {

    @Mod.Instance
    public static TBTMats instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    public static CreativeTabs BLOCK_TAB = new BlockTab();
    public static CreativeTabs MATERIAL_TAB = new MaterialTab();
    public static CreativeTabs Tool_TAB = new ToolTab();
    public static CreativeTabs Armor_TAB = new ArmorTab();
    public static CreativeTabs Food_TAB = new FoodTab();
    public static CreativeTabs Misc_TAB = new MiscTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        RegistryHandler.preInitRegistries();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}
