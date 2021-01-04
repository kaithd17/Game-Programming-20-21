package com.example.demomod.entity.model;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import com.example.demomod.DemoMod;
import com.example.demomod.items.LightSaberBlueItem;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class ModelSith extends ModelBase {

    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer leftArm;
    private final ModelRenderer rightArm;
    private final ModelRenderer leftLeg;
    private final ModelRenderer rightLeg;




    public ModelSith() {
        textureWidth = 64;
        textureHeight = 64;


        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 0.0F, 0.0F);
        head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, true));

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, true));

        leftArm = new ModelRenderer(this);
        leftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        leftArm.cubeList.add(new ModelBox(leftArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

        rightArm = new ModelRenderer(this);
        rightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        rightArm.cubeList.add(new ModelBox(rightArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        head.render(f5);
        body.render(f5);
        leftArm.render(f5);
        rightArm.render(f5);
        leftLeg.render(f5);
        rightLeg.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F)*1.4F*limbSwingAmount*(-1);
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F)*1.4F*limbSwingAmount;
        this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F)*1.4F*limbSwingAmount*(-1);
        this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F)*1.4F*limbSwingAmount;

        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F;
    }


}
