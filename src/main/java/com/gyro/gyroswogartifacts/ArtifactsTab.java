package com.gyro.gyroswogartifacts;

import com.gyro.gyroswogartifacts.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ArtifactsTab extends CreativeModeTab {
    public ArtifactsTab() {
        super("artifacts_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.DEMONIC_SWORD.get());
    }
}
