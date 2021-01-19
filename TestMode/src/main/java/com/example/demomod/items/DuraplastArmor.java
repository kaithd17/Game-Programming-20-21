package com.example.demomod.items;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class DuraplastArmor extends net.minecraft.item.ItemArmor {

    public DuraplastArmor(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn, String name) {
        super(materialIn, 0, equipmentSlotIn);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.MISC);
    }

    @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        ArmorModel model = new ArmorModel();
        model.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;

        model.isChild = _default.isChild;
        model.isRiding = _default.isRiding;
        model.isSneak = _default.isSneak;
        model.rightArmPose = _default.rightArmPose;
        model.leftArmPose = _default.leftArmPose;
        return model;
    }
}
