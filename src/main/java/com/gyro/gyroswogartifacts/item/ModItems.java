package com.gyro.gyroswogartifacts.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import yesman.epicfight.world.item.GreatswordItem;
import yesman.epicfight.world.item.LongswordItem;

import static com.gyro.gyroswogartifacts.GyrosWogArtifacts.ARTIFACTS_TAB;
import static com.gyro.gyroswogartifacts.GyrosWogArtifacts.MODID;

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
    /*
    public static final RegistryObject<SwordItem> SOUL_SCYTHE = ITEMS.register("soul_scythe",
            () -> new SwordItem(ArtifactItemTier.GREAT_SOUL, 0, -1.8F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair()
                    ));
     */
    public static final RegistryObject<SwordItem> DEMONIC_SWORD = ITEMS.register("demonic_sword",
            () -> new SwordItem(Tiers.NETHERITE, 3, -2.35F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair()
            ));
    /*
    public static final RegistryObject<LongswordItem> DEMONIC_LONGSWORD = ITEMS.register("demonic_longsword",
            () -> new LongswordItem(new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair(),
                    ArtifactItemTier.GREAT_SOUL
            ));
     */
    public static final RegistryObject<SwordItem> DEMONIC_LONGSWORD = ITEMS.register("demonic_longsword",
            () -> new SwordItem(Tiers.NETHERITE, 3, -2.35F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair()
            ));
    public static final RegistryObject<SwordItem> BROKEN_ANGELIC_GREATSWORD = ITEMS.register("broken_angelic_greatsword",
            () -> new SwordItem(Tiers.NETHERITE, 3, -2.35F,
                    new Item.Properties().tab(ARTIFACTS_TAB).fireResistant().setNoRepair()
            ));
    public static final RegistryObject<SwordItem> EMERALD_BLADE = ITEMS.register("emerald_blade",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.5F,
                    new Item.Properties().tab(ARTIFACTS_TAB)
            ));

    public static final RegistryObject<SwordItem> IRON_BLADE = ITEMS.register("iron_blade",
            () -> new SwordItem(Tiers.IRON, 3, -2.5F,
                    new Item.Properties().tab(ARTIFACTS_TAB)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
