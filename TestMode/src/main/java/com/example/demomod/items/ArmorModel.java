package com.example.demomod.items;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ArmorModel extends ModelBiped {
    public ModelRenderer shaped;

    public ArmorModel(){
        this.textureWidth = 16;
        this.textureHeight = 16;
        this.shaped = new ModelRenderer(this,82,0);
        this.shaped.setRotationPoint(-4.0F,-8.0F,0.0F);
        this.shaped.addBox(-1.0F,-5.0F,-1.0F,18,5,12,8.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
