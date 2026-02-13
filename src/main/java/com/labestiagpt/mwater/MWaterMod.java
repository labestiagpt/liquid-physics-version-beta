package com.labestiagpt.mwater;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLSetupEvent;

@Mod("mwater")
public class MWaterMod {
    
    public MWaterMod() {
        // Initialize the mod
    }

    @SubscribeEvent
    public void setup(FMLCommonSetupEvent event) {
        // Common setup code
    }

    @SubscribeEvent
    public void clientSetup(FMLClientSetupEvent event) {
        // Client setup code
    }
}