package com.example.demomod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class LightSaberStickItem extends Item {

    public LightSaberStickItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
    }
}
