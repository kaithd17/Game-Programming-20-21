package com.example.demomod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelRedStormtrooper extends ModelBase {
    private final ModelRenderer Stormtrooper;
    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer leftArm;
    private final ModelRenderer TrooperWeapon;
    private final ModelRenderer rightArm;
    private final ModelRenderer leftLeg;
    private final ModelRenderer rightLeg;

    public ModelRedStormtrooper() {
        textureWidth = 64;
        textureHeight = 64;

        Stormtrooper = new ModelRenderer(this);
        Stormtrooper.setRotationPoint(0.0F, 24.0F, 0.0F);


        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -24.0F, 0.0F);
        Stormtrooper.addChild(head);
        head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, true));

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, -24.0F, 0.0F);
        Stormtrooper.addChild(body);
        body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, true));

        leftArm = new ModelRenderer(this);
        leftArm.setRotationPoint(-5.0F, -22.0F, 0.0F);
        Stormtrooper.addChild(leftArm);
        leftArm.cubeList.add(new ModelBox(leftArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));


        rightArm = new ModelRenderer(this);
        rightArm.setRotationPoint(5.0F, -22.0F, 0.0F);
        Stormtrooper.addChild(rightArm);
        rightArm.cubeList.add(new ModelBox(rightArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(-1.9F, -12.0F, 0.0F);
        Stormtrooper.addChild(leftLeg);
        leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(1.9F, -12.0F, 0.0F);

        Stormtrooper.addChild(rightLeg);
        rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

        TrooperWeapon = new ModelRenderer(this);
        TrooperWeapon.setRotationPoint(-7.0F, 11.0F, -17.0F);
        leftArm.addChild(TrooperWeapon);
        setRotationAngle(TrooperWeapon, -1.4399F, 0.0F, -3.1416F);
        TrooperWeapon.cubeList.add(new ModelBox(TrooperWeapon, 26, 0, -6.0F, -14.0F, 3.0F, 1, 1, 4, 0.0F, false));
        TrooperWeapon.cubeList.add(new ModelBox(TrooperWeapon, 26, 0, -6.0F, -14.0F, -1.0F, 1, 1, 4, 0.0F, false));
        TrooperWeapon.cubeList.add(new ModelBox(TrooperWeapon, 26, 0, -6.0F, -14.0F, -5.0F, 1, 1, 4, 0.0F, false));
        TrooperWeapon.cubeList.add(new ModelBox(TrooperWeapon, 30, 0, -6.0F, -18.0F, 4.0F, 1, 4, 1, 0.0F, false));
        TrooperWeapon.cubeList.add(new ModelBox(TrooperWeapon, 26, 0, -6.0F, -15.0F, -9.0F, 1, 1, 5, 0.0F, false));
        TrooperWeapon.cubeList.add(new ModelBox(TrooperWeapon, 26, 0, -6.0F, -13.0F, -9.0F, 1, 1, 5, 0.0F, false));

    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        Stormtrooper.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6661F)*1.4F*limbSwingAmount*(-1);
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6661F)*1.4F*limbSwingAmount;
        this.leftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6661F)*1.4F*limbSwingAmount*(-1);
        this.rightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6661F)*1.4F*limbSwingAmount;

        this.head.rotateAngleY = netHeadYaw * 0.017453291F;
        this.head.rotateAngleX = headPitch * 0.017453291F;
    }
}
