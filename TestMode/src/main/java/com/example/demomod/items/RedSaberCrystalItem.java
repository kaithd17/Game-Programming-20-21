package com.example.demomod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RedSaberCrystalItem extends Item {
    public RedSaberCrystalItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
    }
}
