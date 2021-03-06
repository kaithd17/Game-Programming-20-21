package com.example.demomod.util;

import com.example.demomod.DemoMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
    public static SoundEvent SITH_LORD_HURT;
    public static SoundEvent SITH_LORD_DEATH;

    public static void registerSounds(){
        SITH_LORD_HURT = registerSound("entity.sithlord.hurt");
        SITH_LORD_DEATH = registerSound("entity.sithlord.death");

    }

    private static SoundEvent registerSound(String name){
        ResourceLocation location = new ResourceLocation(DemoMod.MODID,name);
        System.out.println(location);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
