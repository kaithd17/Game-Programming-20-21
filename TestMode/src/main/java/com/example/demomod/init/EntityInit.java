package com.example.demomod.init;

import com.example.demomod.DemoMod;
import com.example.demomod.entity.EntitySith;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
    public static void registerEntities(){
        registerEntity("Sithlord", EntitySith.class,120,50,999191,000000);
    }
    private static void registerEntity(String name, Class<EntitySith> entity, int id, int range , int color1, int color2){
        EntityRegistry.registerModEntity(new ResourceLocation(DemoMod.MODID+":"+name),entity,name,id, DemoMod.instance, range, 1,true, color1, color2);
    }
}
