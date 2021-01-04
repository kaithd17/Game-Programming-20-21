package com.example.demomod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlueSaberCrystalItem extends Item {
    public BlueSaberCrystalItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
    }
}
