package com.gyro.gyroswogartifacts;

import com.gyro.gyroswogartifacts.item.ModItems;
import com.gyro.gyroswogartifacts.sound.ModSounds;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.gyro.gyroswogartifacts.GyrosWogArtifacts.MODID;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MODID)
public class GyrosWogArtifacts {
    // Directly reference a slf4j logger
    public static final String MODID = "gyroswogartifacts";

    public static final ArtifactsTab ARTIFACTS_TAB = new ArtifactsTab();
    private static final Logger LOGGER = LogUtils.getLogger();

    public GyrosWogArtifacts() {
        // Register the setup method for modloading
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModSounds.register(modEventBus);

        modEventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

}