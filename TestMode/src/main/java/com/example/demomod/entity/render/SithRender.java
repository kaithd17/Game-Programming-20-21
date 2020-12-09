package com.example.demomod.entity.render;

import com.example.demomod.DemoMod;
import com.example.demomod.entity.EntitySith;
import com.example.demomod.entity.model.ModelSith;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBed;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class SithRender extends RenderLiving<EntitySith> {
    public static final ResourceLocation TEXTURES = new ResourceLocation(DemoMod.MODID+":textures/entity/sith.png");

    public SithRender(RenderManager manager){
        super(manager, new ModelSith(),0.5F);
    }


    @Override
    protected ResourceLocation getEntityTexture(EntitySith entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntitySith entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
