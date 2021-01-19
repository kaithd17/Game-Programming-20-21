package com.example.demomod.entity.render;

import com.example.demomod.DemoMod;
import com.example.demomod.entity.EntityRedStormtrooper;
import com.example.demomod.entity.EntitySith;
import com.example.demomod.entity.model.ModelRedStormtrooper;
import com.example.demomod.entity.model.ModelSith;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RedStormtrooperRender extends RenderLiving<EntityRedStormtrooper> {
    public static final ResourceLocation TEXTURES2 = new ResourceLocation(DemoMod.MODID+":textures/entity/redstormtrooper.png");

    public RedStormtrooperRender(RenderManager manager) {
        super(manager, new ModelRedStormtrooper(),0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityRedStormtrooper entity) {
        return TEXTURES2;
    }


    @Override
    protected void applyRotations(EntityRedStormtrooper entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
