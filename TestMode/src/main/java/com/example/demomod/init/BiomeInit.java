package com.example.demomod.init;

import com.example.demomod.DemoMod;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.lang.ref.Reference;

public class BiomeInit {

    public static final Biome DESERT = new BiomeDesert(new Biome.BiomeProperties("Desert").setBaseHeight(0.3F).setHeightVariation(0.07F).setTemperature(2.0F).setRainfall(0.0F).setRainDisabled());
    public static void registerBiomes(){
        initBiome(DESERT,"DESERT_Horwath", BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.HILLS, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.DRY);
        //System.out.println("finsihkdfhldgh");
    }
    private static Biome initBiome(Biome biome,String name, BiomeManager.BiomeType biometype, BiomeDictionary.Type... types){
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        //System.out.println("Init Biome Horwath");
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biometype, new BiomeManager.BiomeEntry(biome,8));
        BiomeManager.addSpawnBiome(biome);
        //System.out.println("Biome assedd");
        return biome;
    }
}
