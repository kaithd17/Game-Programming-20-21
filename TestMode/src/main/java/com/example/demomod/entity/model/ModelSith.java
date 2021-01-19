package com.example.demomod.entity.model;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


import com.example.demomod.DemoMod;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;


public class ModelSith extends ModelBase {
    private final ModelRenderer sith;
    private final ModelRenderer rightLeg;
    private final ModelRenderer leftLeg;
    private final ModelRenderer rightArm;
    private final ModelRenderer leftArm;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer Sithsword;

    public ModelSith() {
        textureWidth = 64;
        textureHeight = 64;

        sith = new ModelRenderer(this);
        sith.setRotationPoint(-7.0F, 24.0F, 0.0F);


        rightLeg = new ModelRenderer(this);
        rightLeg.setRotationPoint(1.9F, -12.0F, 0.0F);
        sith.addChild(rightLeg);
        rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

        leftLeg = new ModelRenderer(this);
        leftLeg.setRotationPoint(-1.9F, -12.0F, 0.0F);
        sith.addChild(leftLeg);
        leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

        rightArm = new ModelRenderer(this);
        rightArm.setRotationPoint(5.0F, -22.0F, 0.0F);
        sith.addChild(rightArm);
        rightArm.cubeList.add(new ModelBox(rightArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

        leftArm = new ModelRenderer(this);
        leftArm.setRotationPoint(-5.0F, -22.0F, 0.0F);
        sith.addChild(leftArm);
        leftArm.cubeList.add(new ModelBox(leftArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, -24.0F, 0.0F);
        sith.addChild(body);
        body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, true));

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -24.0F, 0.0F);
        sith.addChild(head);
        head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, true));

        Sithsword = new ModelRenderer(this);
        Sithsword.setRotationPoint(-9.0F, 19.0F, -10.0F);
        leftArm.addChild(Sithsword);
        setRotationAngle(Sithsword, 0.0F, 0.7418F, -1.5708F);
        Sithsword.cubeList.add(new ModelBox(Sithsword, 9, 4, 20.8615F, 6.8255F, -3.8716F, 1, 1, 1, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 24, 19.8615F, 6.8255F, -3.8716F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 18.8615F, 6.8255F, -2.8716F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 17.8615F, 6.8255F, -1.8716F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 16.8615F, 6.8255F, -0.8716F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 15.8615F, 6.8255F, 0.1284F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 14.8615F, 6.8255F, 1.1284F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 13.8615F, 6.8255F, 2.1284F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 12.8577F, 7.0F, 3.1284F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 11.8577F, 7.0F, 4.1284F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 10.8577F, 7.0F, 5.1284F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 9.8577F, 7.0F, 6.1284F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 8.8577F, 7.0F, 7.1284F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 7, 25, 7.8577F, 7.0F, 8.1284F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 9, 4, 6.8577F, 7.0F, 9.1284F, 1, 1, 2, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 14, 5, 5.8577F, 7.0F, 10.1284F, 1, 1, 3, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 15, 5, 4.8577F, 7.0F, 11.1284F, 1, 1, 3, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 14, 4, 3.8577F, 7.0F, 11.1284F, 1, 1, 4, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 14, 3, 2.8577F, 7.0F, 12.1284F, 1, 1, 4, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 9, 4, 1.6428F, 7.0F, 12.234F, 1, 1, 4, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 9, 4, 0.6428F, 7.0F, 13.234F, 1, 1, 3, 0.0F, false));
        Sithsword.cubeList.add(new ModelBox(Sithsword, 9, 4, -0.3572F, 7.0F, 14.234F, 1, 1, 2, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        sith.render(f5);
        //Sithsword.render(f5);
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
        //this.Sithsword.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F)*1.4F*limbSwingAmount;

        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F;
    }
}
