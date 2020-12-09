package com.example.demomod.util;

import com.example.demomod.entity.EntitySith;
import com.example.demomod.entity.render.SithRender;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(EntitySith.class, new IRenderFactory<EntitySith>() {
            @Override
            public Render<? super EntitySith> createRenderFor(RenderManager manager) {
                //return null;
                return new SithRender(manager);
            }
        });
    }
}
