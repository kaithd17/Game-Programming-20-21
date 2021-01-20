package com.example.demomod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class LightSaberRedItem extends net.minecraft.item.ItemSword {
    public LightSaberRedItem(Item.ToolMaterial material, String name){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        playerIn.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,300,1));
        playerIn.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,300,1));
        playerIn.getCooldownTracker().setCooldown(this,1500);
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
