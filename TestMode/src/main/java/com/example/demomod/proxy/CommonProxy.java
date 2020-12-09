package com.example.demomod.proxy;

import com.example.demomod.DemoMod;
import com.example.demomod.init.BiomeInit;
import com.example.demomod.init.EntityInit;
import com.example.demomod.items.DiamondSwordItem;
import com.example.demomod.items.LightSaberBlueItem;
import com.example.demomod.items.LightSaberStickItem;
import com.example.demomod.items.RedSaberCrystalItem;
import com.example.demomod.util.RenderHandler;
import com.example.demomod.util.SoundHandler;
import com.example.demomod.world.types.WorldTypeDesert;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber(modid = DemoMod.MODID)
public class CommonProxy {

    public static Item DiamondSword = new DiamondSwordItem("diamondsword");
    public static Item LightSaberBlue = new LightSaberBlueItem("lightsaberjedi");
    public static Item RedSaberCrystal = new RedSaberCrystalItem("redsabercrystal");
    public static Item LightSaberStick = new LightSaberStickItem("lightsaberstick");

    public void preInit(FMLPreInitializationEvent evt){
        //ModDimensions.init();
        //GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
        BiomeInit.registerBiomes();
        //
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
        SoundHandler.registerSounds();
        //System.out.println("registerBiomes finished");
    }
    public void init(FMLInitializationEvent evt){ }
    public void postInit(FMLPostInitializationEvent evt){
        WorldType STAR_WARS = new WorldTypeDesert();
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){

    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(DiamondSword);
        event.getRegistry().registerAll(LightSaberBlue);
        event.getRegistry().registerAll(RedSaberCrystal);
        event.getRegistry().registerAll(LightSaberStick);
        //BiomeInit.registerBiomes();
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event){
        registerRender(DiamondSword);
        registerRender(LightSaberBlue);
        registerRender(RedSaberCrystal);
        registerRender(LightSaberStick);
    }

    private static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
