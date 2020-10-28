package com.example.demomod.proxy;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(FMLPreInitializationEvent evt) {
        super.preInit(evt);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent evt){

    }
}
