package com.example.demomod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DiamondSwordItem extends Item {

    public DiamondSwordItem(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
    }
}
