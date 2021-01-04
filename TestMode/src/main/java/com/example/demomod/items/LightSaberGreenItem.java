package com.example.demomod.items;

import net.minecraft.creativetab.CreativeTabs;

public class LightSaberGreenItem extends net.minecraft.item.ItemSword{
    public LightSaberGreenItem(ToolMaterial material, String name){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
    }
}
