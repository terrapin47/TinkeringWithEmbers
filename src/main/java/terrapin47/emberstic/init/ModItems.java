package terrapin47.emberstic.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import terrapin47.emberstic.item.ItemBase;

public class ModItems {

    @GameRegistry.ObjectHolder("emberstic:stamp_armor_plate")
    public static final ItemBase STAMP_ARMOR_PLATE = new ItemBase("stamp_armor_plate");

    @GameRegistry.ObjectHolder("emberstic:stamp_armor_trim")
    public static final ItemBase STAMP_ARMOR_TRIM = new ItemBase("stamp_armor_trim");

    @GameRegistry.ObjectHolder("emberstic:stamp_arrow_head")
    public static final ItemBase STAMP_ARROW_HEAD = new ItemBase("stamp_arrow_head");

    @GameRegistry.ObjectHolder("emberstic:stamp_arrow_shaft")
    public static final ItemBase STAMP_ARROW_SHAFT = new ItemBase("stamp_arrow_shaft");

    @GameRegistry.ObjectHolder("emberstic:stamp_axe_head")
    public static final ItemBase STAMP_AXE_HEAD = new ItemBase("stamp_axe_head");

    @GameRegistry.ObjectHolder("emberstic:stamp_binding")
    public static final ItemBase STAMP_BINDING = new ItemBase("stamp_binding");

    @GameRegistry.ObjectHolder("emberstic:stamp_boots_core")
    public static final ItemBase STAMP_BOOTS_CORE = new ItemBase("stamp_boots_core");

    @GameRegistry.ObjectHolder("emberstic:stamp_bow_limb")
    public static final ItemBase STAMP_BOW_LIMB = new ItemBase("stamp_bow_limb");

    @GameRegistry.ObjectHolder("emberstic:stamp_bow_string")
    public static final ItemBase STAMP_BOW_STRING = new ItemBase("stamp_bow_string");

    @GameRegistry.ObjectHolder("emberstic:stamp_broad_axe_head")
    public static final ItemBase STAMP_BROAD_AXE_HEAD = new ItemBase("stamp_broad_axe_head");

    @GameRegistry.ObjectHolder("emberstic:stamp_chest_core")
    public static final ItemBase STAMP_CHEST_CORE = new ItemBase("stamp_chest_core");

    @GameRegistry.ObjectHolder("emberstic:stamp_cross_guard")
    public static final ItemBase STAMP_CROSS_GUARD = new ItemBase("stamp_cross_guard");

    @GameRegistry.ObjectHolder("emberstic:stamp_emerald")
    public static final ItemBase STAMP_EMERALD = new ItemBase("stamp_emerald");

    @GameRegistry.ObjectHolder("emberstic:stamp_excavator_head")
    public static final ItemBase STAMP_EXCAVATOR_HEAD = new ItemBase("stamp_excavator_head");

    @GameRegistry.ObjectHolder("emberstic:stamp_fletching")
    public static final ItemBase STAMP_FLETCHING = new ItemBase("stamp_fletching");

    @GameRegistry.ObjectHolder("emberstic:stamp_hammer_head")
    public static final ItemBase STAMP_HAMMER_HEAD = new ItemBase("stamp_hammer_head");

    @GameRegistry.ObjectHolder("emberstic:stamp_hand_guard")
    public static final ItemBase STAMP_HAND_GUARD = new ItemBase("stamp_hand_guard");

    @GameRegistry.ObjectHolder("emberstic:stamp_helmet_core")
    public static final ItemBase STAMP_HELMET_CORE = new ItemBase("stamp_helmet_core");

    @GameRegistry.ObjectHolder("emberstic:stamp_kama_head")
    public static final ItemBase STAMP_KAMA_HEAD = new ItemBase("stamp_kama_head");

    @GameRegistry.ObjectHolder("emberstic:stamp_knife_blade")
    public static final ItemBase STAMP_KNIFE_BLADE = new ItemBase("stamp_knife_blade");

    @GameRegistry.ObjectHolder("emberstic:stamp_large_plate")
    public static final ItemBase STAMP_LARGE_PLATE = new ItemBase("stamp_large_plate");

    @GameRegistry.ObjectHolder("emberstic:stamp_large_sword_blade")
    public static final ItemBase STAMP_LARGE_SWORD_BLADE = new ItemBase("stamp_large_sword_blade");

    @GameRegistry.ObjectHolder("emberstic:stamp_leggings_core")
    public static final ItemBase STAMP_LEGGINGS_CORE = new ItemBase("stamp_leggings_core");

    @GameRegistry.ObjectHolder("emberstic:stamp_pan_head")
    public static final ItemBase STAMP_PAN_HEAD = new ItemBase("stamp_pan_head");

    @GameRegistry.ObjectHolder("emberstic:stamp_pick_head")
    public static final ItemBase STAMP_PICK_HEAD = new ItemBase("stamp_pick_head");

    @GameRegistry.ObjectHolder("emberstic:stamp_polishing_kit")
    public static final ItemBase STAMP_POLISHING_KIT = new ItemBase("stamp_polishing_kit");

    @GameRegistry.ObjectHolder("emberstic:stamp_scythe_head")
    public static final ItemBase STAMP_SCYTHE_HEAD = new ItemBase("stamp_scythe_head");

    @GameRegistry.ObjectHolder("emberstic:stamp_shard")
    public static final ItemBase STAMP_SHARD = new ItemBase("stamp_shard");

    @GameRegistry.ObjectHolder("emberstic:stamp_sharpening_kit")
    public static final ItemBase STAMP_SHARPENING_KIT = new ItemBase("stamp_sharpening_kit");

    @GameRegistry.ObjectHolder("emberstic:stamp_shovel_head")
    public static final ItemBase STAMP_SHOVEL_HEAD = new ItemBase("stamp_shovel_head");

    @GameRegistry.ObjectHolder("emberstic:stamp_sign_head")
    public static final ItemBase STAMP_SIGN_HEAD = new ItemBase("stamp_sign_head");

    @GameRegistry.ObjectHolder("emberstic:stamp_sword_blade")
    public static final ItemBase STAMP_SWORD_BLADE = new ItemBase("stamp_sword_blade");

    @GameRegistry.ObjectHolder("emberstic:stamp_tool_rod")
    public static final ItemBase STAMP_TOOL_ROD = new ItemBase("stamp_tool_rod");

    @GameRegistry.ObjectHolder("emberstic:stamp_tough_binding")
    public static final ItemBase STAMP_TOUGH_BINDING = new ItemBase("stamp_tough_binding");

    @GameRegistry.ObjectHolder("emberstic:stamp_tough_tool_rod")
    public static final ItemBase STAMP_TOUGH_TOOL_ROD = new ItemBase("stamp_tough_tool_rod");

    @GameRegistry.ObjectHolder("emberstic:stamp_wide_guard")
    public static final ItemBase STAMP_WIDE_GUARD = new ItemBase("stamp_wide_guard");

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        STAMP_ARMOR_PLATE.initModel();
        STAMP_ARMOR_TRIM.initModel();
        STAMP_ARROW_HEAD.initModel();
        STAMP_ARROW_SHAFT.initModel();
        STAMP_AXE_HEAD.initModel();
        STAMP_BINDING.initModel();
        STAMP_BOOTS_CORE.initModel();
        STAMP_BOW_LIMB.initModel();
        STAMP_BOW_STRING.initModel();
        STAMP_BROAD_AXE_HEAD.initModel();
        STAMP_CHEST_CORE.initModel();
        STAMP_CROSS_GUARD.initModel();
        STAMP_EMERALD.initModel();
        STAMP_EXCAVATOR_HEAD.initModel();
        STAMP_FLETCHING.initModel();
        STAMP_HAMMER_HEAD.initModel();
        STAMP_HAND_GUARD.initModel();
        STAMP_HELMET_CORE.initModel();
        STAMP_KAMA_HEAD.initModel();
        STAMP_KNIFE_BLADE.initModel();
        STAMP_LARGE_PLATE.initModel();
        STAMP_LARGE_SWORD_BLADE.initModel();
        STAMP_LEGGINGS_CORE.initModel();
        STAMP_PAN_HEAD.initModel();
        STAMP_PICK_HEAD.initModel();
        STAMP_POLISHING_KIT.initModel();
        STAMP_SCYTHE_HEAD.initModel();
        STAMP_SHARD.initModel();
        STAMP_SHARPENING_KIT.initModel();
        STAMP_SHOVEL_HEAD.initModel();
        STAMP_SIGN_HEAD.initModel();
        STAMP_SWORD_BLADE.initModel();
        STAMP_TOOL_ROD.initModel();
        STAMP_TOUGH_BINDING.initModel();
        STAMP_TOUGH_TOOL_ROD.initModel();
        STAMP_WIDE_GUARD.initModel();
    }

    public static void registerItems(RegistryEvent.Register<Item> event) {
        STAMP_ARMOR_PLATE.register(event);
        STAMP_ARMOR_TRIM.register(event);
        STAMP_ARROW_HEAD.register(event);
        STAMP_ARROW_SHAFT.register(event);
        STAMP_AXE_HEAD.register(event);
        STAMP_BINDING.register(event);
        STAMP_BOOTS_CORE.register(event);
        STAMP_BOW_LIMB.register(event);
        STAMP_BOW_STRING.register(event);
        STAMP_BROAD_AXE_HEAD.register(event);
        STAMP_CHEST_CORE.register(event);
        STAMP_CROSS_GUARD.register(event);
        STAMP_EMERALD.register(event);
        STAMP_EXCAVATOR_HEAD.register(event);
        STAMP_FLETCHING.register(event);
        STAMP_HAMMER_HEAD.register(event);
        STAMP_HAND_GUARD.register(event);
        STAMP_HELMET_CORE.register(event);
        STAMP_KAMA_HEAD.register(event);
        STAMP_KNIFE_BLADE.register(event);
        STAMP_LARGE_PLATE.register(event);
        STAMP_LARGE_SWORD_BLADE.register(event);
        STAMP_LEGGINGS_CORE.register(event);
        STAMP_PAN_HEAD.register(event);
        STAMP_PICK_HEAD.register(event);
        STAMP_POLISHING_KIT.register(event);
        STAMP_SCYTHE_HEAD.register(event);
        STAMP_SHARD.register(event);
        STAMP_SHARPENING_KIT.register(event);
        STAMP_SHOVEL_HEAD.register(event);
        STAMP_SIGN_HEAD.register(event);
        STAMP_SWORD_BLADE.register(event);
        STAMP_TOOL_ROD.register(event);
        STAMP_TOUGH_BINDING.register(event);
        STAMP_TOUGH_TOOL_ROD.register(event);
        STAMP_WIDE_GUARD.register(event);
    }

}
