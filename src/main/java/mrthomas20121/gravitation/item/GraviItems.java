package mrthomas20121.gravitation.item;

import com.aetherteam.aether.item.combat.DartItem;
import mrthomas20121.gravitation.Gravitation;
import mrthomas20121.gravitation.entity.GraviEntityTypes;
import mrthomas20121.gravitation.item.tools.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GraviItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gravitation.MOD_ID);

    public static RegistryObject<Item> NEPTUNE_AXE = ITEMS.register("neptune_axe", NeptuneAxeItem::new);
    public static RegistryObject<Item> NEPTUNE_BATTLEAXE = ITEMS.register("neptune_battleaxe", NeptuneBattleAxeItem::new);
    public static RegistryObject<Item> NEPTUNE_CUTLASS = ITEMS.register("neptune_cutlass", NeptuneCutlassItem::new);
    public static RegistryObject<Item> NEPTUNE_PICKAXE = ITEMS.register("neptune_pickaxe", NeptunePickaxeItem::new);
    public static RegistryObject<Item> NEPTUNE_SHOVEL = ITEMS.register("neptune_shovel", NeptuneAxeItem::new);

    public static RegistryObject<Item> ZANITE_BATTLEAXE = ITEMS.register("zanite_battleaxe", ZaniteBattleAxeItem::new);
    public static RegistryObject<Item> GRAVITITE_BATTLEAXE = ITEMS.register("gravitite_battleaxe", GravititeBattleAxeItem::new);
    public static RegistryObject<Item> VALKYRIE_BATTLEAXE = ITEMS.register("valkyrie_battleaxe", ValkyrieBattleAxeItem::new);

    public static RegistryObject<Item> PHOENIX_DART = ITEMS.register("phoenix_dart", () -> {
        return new DartItem(GraviEntityTypes.PHOENIX_DART, new Item.Properties());
    });
}