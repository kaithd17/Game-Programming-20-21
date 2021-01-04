package com.example.demomod.items;

import net.minecraft.creativetab.CreativeTabs;

public class LightSaberRedItem extends net.minecraft.item.ItemSword{
    public LightSaberRedItem(ToolMaterial material, String name){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
    }
}
