package com.example.demomod.proxy;

import com.example.demomod.DemoMod;
import com.example.demomod.blocks.DuraplastBlock;
import com.example.demomod.init.BiomeInit;
import com.example.demomod.init.EntityInit;
import com.example.demomod.items.*;
import com.example.demomod.util.RenderHandler;
import com.example.demomod.util.SoundsHandler;
import com.example.demomod.world.types.WorldTypeDesert;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = DemoMod.MODID)
public class CommonProxy {

    public static final Item.ToolMaterial MATERIAL_LIGHTSABER = EnumHelper.addToolMaterial("material_lightsaber",3,2000, 2.0f,5.0f,4);
    public static final ItemArmor.ArmorMaterial DURAPLAST_MATERIAL = EnumHelper.addArmorMaterial("DURAPLAST",DemoMod.MODID + ":duraplast",17,new int[]{4,7,8,4},11, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,0.0F);
    //Items
    //Swords
    public static ItemSword LightSaberBlue = new LightSaberBlueItem(MATERIAL_LIGHTSABER,"lightsaberjedi");
    public static ItemSword LightSaberGreen = new LightSaberGreenItem(MATERIAL_LIGHTSABER,"lightsaberjedigreen");
    public static ItemSword LightSaberRed = new LightSaberRedItem(MATERIAL_LIGHTSABER,"lightsabersith");
    //Crystals
    public static Item RedSaberCrystal = new StarWarsItem("redsabercrystal");
    public static Item BlueSaberCrystal = new StarWarsItem("bluesabercrystal");
    public static Item GreenSaberCrystal = new StarWarsItem("greensabercrystal");
    //other Items
    public static Item LightSaberStick = new StarWarsItem("lightsaberstick");
    public static Item Duraplast = new StarWarsItem("duraplast");
    //Blocks
    public static Block DuraplastBlock = new DuraplastBlock("duraplastoreblock");
    //Armor
    public static ItemArmor DuraplastChestplate = new DuraplastArmor(CommonProxy.DURAPLAST_MATERIAL, EntityEquipmentSlot.CHEST,"duraplastchestplate");
    public static ItemArmor DuraplastLegs = new DuraplastArmor(CommonProxy.DURAPLAST_MATERIAL, EntityEquipmentSlot.LEGS, "duraplastlegs");
    public static ItemArmor DuraplastHelmet = new DuraplastArmor(CommonProxy.DURAPLAST_MATERIAL,EntityEquipmentSlot.HEAD, "duraplasthelmet");
    public static ItemArmor DuraplastBoots = new DuraplastArmor(CommonProxy.DURAPLAST_MATERIAL,EntityEquipmentSlot.FEET, "duraplastboots");

    public void preInit(FMLPreInitializationEvent evt){
        //ModDimensions.init();
        //GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
        BiomeInit.registerBiomes();
        //
        SoundsHandler.registerSounds();

        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();

        //System.out.println("registerBiomes finished");
    }
    public void init(FMLInitializationEvent evt){
        GameRegistry.addSmelting(DuraplastBlock, new ItemStack(Duraplast), 0.7f);
    }
    public void postInit(FMLPostInitializationEvent evt){
        WorldType STAR_WARS = new WorldTypeDesert();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(DuraplastBlock);
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(LightSaberBlue);
        event.getRegistry().registerAll(RedSaberCrystal);
        event.getRegistry().registerAll(LightSaberStick);
        event.getRegistry().registerAll(BlueSaberCrystal);
        event.getRegistry().registerAll(GreenSaberCrystal);
        event.getRegistry().registerAll(LightSaberGreen);
        event.getRegistry().registerAll(LightSaberRed);
        event.getRegistry().registerAll(Duraplast);
        event.getRegistry().registerAll(DuraplastChestplate);
        event.getRegistry().registerAll(DuraplastBoots);
        event.getRegistry().registerAll(DuraplastHelmet);
        event.getRegistry().registerAll(DuraplastLegs);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event){
        event.getRegistry().register(new ItemBlock(DuraplastBlock).setRegistryName(DuraplastBlock.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        registerRender(LightSaberBlue);
        registerRender(RedSaberCrystal);
        registerRender(LightSaberStick);
        registerRender(BlueSaberCrystal);
        registerRender(GreenSaberCrystal);
        registerRender(LightSaberGreen);
        registerRender(LightSaberRed);
        registerRender(Duraplast);
        registerRender(DuraplastChestplate);
        registerRender(DuraplastLegs);
        registerRender(DuraplastBoots);
        registerRender(DuraplastHelmet);
        registerRender(Item.getItemFromBlock(DuraplastBlock));
    }

    private static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
