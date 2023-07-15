package com.gyro.gyroswogartifacts.item;

import com.gyro.gyroswogartifacts.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import yesman.epicfight.world.item.GreatswordItem;

import static com.gyro.gyroswogartifacts.GyrosWogArtifacts.ARTIFACTS_TAB;
import static com.gyro.gyroswogartifacts.GyrosWogArtifacts.MODID;
import static net.minecraft.world.item.Tiers.DIAMOND;
import static net.minecraft.world.item.Tiers.NETHERITE;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);


    public static final RegistryObject<GreatswordItem> SOUL_GREATAXE = ITEMS.register("soul_greataxe",
            () -> new GreatswordItem(new Item.Properties()
                    .tab(ARTIFACTS_TAB).fireResistant().setNoRepair(),
                    ArtifactItemTier.GREAT_SOUL));
    public static final RegistryObject<GreatswordItem> SOUL_MACE = ITEMS.register("soul_mace",
            () -> new GreatswordItem(new Item.Properties()
                    .tab(ARTIFACTS_TAB).fireResistant().setNoRepair(),
                    ArtifactItemTier.GREAT_SOUL));
    public static final RegistryObject<SwordItem> SOUL_SCYTHE = ITEMS.register("soul_scythe",
            () -> new SwordItem(ArtifactItemTier.GREAT_SOUL, 0, -1.8F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair()
                    ));
    public static final RegistryObject<GreatswordItem> BLOOD_GREATAXE = ITEMS.register("blood_greataxe",
            () -> new GreatswordItem(new Item.Properties()
                    .tab(ARTIFACTS_TAB).fireResistant().setNoRepair(),
                    ArtifactItemTier.GREAT_SOUL));
    public static final RegistryObject<GreatswordItem> BLOOD_MACE = ITEMS.register("blood_mace",
            () -> new GreatswordItem(new Item.Properties()
                    .tab(ARTIFACTS_TAB).fireResistant().setNoRepair(),
                    ArtifactItemTier.GREAT_SOUL));
    public static final RegistryObject<SwordItem> BLOOD_SCYTHE = ITEMS.register("blood_scythe",
            () -> new SwordItem(ArtifactItemTier.GREAT_SOUL, 0, -1.8F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair()
            ));
    public static final RegistryObject<SwordItem> DEMONIC_SCIMITAR = ITEMS.register("demonic_scimitar",
            () -> new SwordItem(NETHERITE, 3, -2.35F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair()
            ));
    public static final RegistryObject<MorphingSwordItem> DEMONIC_SWORD = ITEMS.register("demonic_sword",
            () -> new MorphingSwordItem(NETHERITE, 3, -2.35F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair().rarity(Rarity.EPIC)
            ));
    public static final RegistryObject<MorphingSwordItem> DEMONIC_LONGSWORD = ITEMS.register("demonic_longsword",
            () -> new MorphingSwordItem(ArtifactItemTier.GREAT_SOUL, 4, -2.8F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair().rarity(Rarity.EPIC)
            ));

    public static final RegistryObject<MorphingSwordItem> BLACKSTONE_SOUL_SWORD = ITEMS.register("blackstone_soul_sword",
            () -> new MorphingSwordItem(NETHERITE, 3, -2.35F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair().rarity(Rarity.EPIC)
            ){
                @Override
                public boolean isFoil(ItemStack stack) {
                    return false;
                }
            });
    public static final RegistryObject<MorphingSwordItem> BLACKSTONE_SOUL_LONGSWORD = ITEMS.register("blackstone_soul_longsword",
            () -> new MorphingSwordItem(ArtifactItemTier.GREAT_SOUL, 4, -2.8F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair().rarity(Rarity.EPIC)
            ){
                @Override
                public boolean isFoil(ItemStack stack) {
                    return false;
                }
            });
    public static final RegistryObject<SwordItem> BROKEN_ANGELIC_GREATSWORD = ITEMS.register("broken_angelic_greatsword",
            () -> new SwordItem(NETHERITE, 3, -2.35F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair().rarity(Rarity.RARE)
            ));
    public static final RegistryObject<SwordItem> EMERALD_BLADE = ITEMS.register("emerald_blade",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4F,
                    new Item.Properties().tab(ARTIFACTS_TAB)
            ));
    public static final RegistryObject<SwordItem> IRON_BLADE = ITEMS.register("iron_blade",
            () -> new SwordItem(Tiers.IRON, 3, -2.4F,
                    new Item.Properties().tab(ARTIFACTS_TAB)
            ));
    public static final RegistryObject<SwordItem> BLOOD_FLAMBERG = ITEMS.register("blood_flamberg",
            () -> new SwordItem(ArtifactItemTier.GREAT_SOUL, 4, -2.8F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair().rarity(Rarity.EPIC)
            ));

    public static final RegistryObject<SwordItem> SABER = ITEMS.register("saber",
            () -> new SwordItem(DIAMOND, 4, -2.8F,
                    new Item.Properties().tab(ARTIFACTS_TAB).setNoRepair().rarity(Rarity.RARE)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

    public static void afterItemRegistered() {
        DEMONIC_LONGSWORD.get().setAlternateItems(DEMONIC_SWORD);
        DEMONIC_SWORD.get().setAlternateItems(DEMONIC_LONGSWORD);
        BLACKSTONE_SOUL_LONGSWORD.get().setAlternateItems(BLACKSTONE_SOUL_SWORD);
        BLACKSTONE_SOUL_SWORD.get().setAlternateItems(BLACKSTONE_SOUL_LONGSWORD);
    }

    public static void afterSoundRegistered() {
        DEMONIC_LONGSWORD.get().setMorphingSoundEvent(ModSounds.DEMONIC_LONGSWORD_SHRING);
        DEMONIC_SWORD.get().setMorphingSoundEvent(ModSounds.DEMONIC_SWORD_GROW);
        BLACKSTONE_SOUL_LONGSWORD.get().setMorphingSoundEvent(ModSounds.DEMONIC_LONGSWORD_SHRING);
        BLACKSTONE_SOUL_SWORD.get().setMorphingSoundEvent(ModSounds.DEMONIC_SWORD_GROW);
    }
}
