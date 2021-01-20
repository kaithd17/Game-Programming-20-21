package com.example.demomod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StarWarsItem extends Item {

    public StarWarsItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
    }
}
