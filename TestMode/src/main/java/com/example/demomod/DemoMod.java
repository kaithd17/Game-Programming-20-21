package com.example.demomod;

import com.example.demomod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

@Mod(modid = DemoMod.MODID, name = DemoMod.NAME, version = DemoMod.VERSION)
public class DemoMod
{
    public static final String MODID = "demomod";
    public static final String NAME = "First Mod";
    public static final String VERSION = "1.0";
    @Mod.Instance
    public static DemoMod instance;

    private static Logger logger;

    @SidedProxy(clientSide = "com.example.demomod.proxy.ClientProxy",
                serverSide = "com.example.demomod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);

        //ModItems.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // some example code
        proxy.postInit(event);
    }

}
