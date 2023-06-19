package com.gyro.gyroswogartifacts.event;

import com.gyro.gyroswogartifacts.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "gyroswogartifacts", bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        ModItems.afterItemRegistered();
    }

    @SubscribeEvent
    public static void onRegisterSounds(RegistryEvent.Register<SoundEvent> event) {
        ModItems.afterSoundRegistered();
    }

}