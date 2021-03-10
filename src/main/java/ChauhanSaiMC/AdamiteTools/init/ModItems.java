package ChauhanSaiMC.AdamiteTools.init;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import ChauhanSaiMC.AdamiteTools.items.AdamiteArmor;
import ChauhanSaiMC.AdamiteTools.items.AdamiteChew;
import ChauhanSaiMC.AdamiteTools.items.tools.*;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.LinkedList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new LinkedList<>();

    public static Item adamite;
    public static Item adamiteAxe;
    public static Item adamiteHoe;
    public static Item adamitePickaxe;
    public static Item adamiteSpade;
    public static Item adamiteSword;
    public static Item adamiteChew;
    public static Item adamiteHelmet;
    public static Item adamiteChestplate;
    public static Item adamiteLeggings;
    public static Item adamiteBoots;


    public static void preInit() {
        adamite = new Item().setUnlocalizedName(AdamiteTools.MOD_ID+".adamite").setRegistryName("adamite");

        Item.ToolMaterial adamiteToolMaterial = EnumHelper.addToolMaterial("adamite",3, 3600, 8.0F, 3.0F, 10);
        adamiteAxe = new ToolAxe(adamiteToolMaterial,5,5,"adamite_axe");
        adamiteHoe = new ToolHoe(adamiteToolMaterial,"adamite_hoe");
        adamitePickaxe = new ToolPickaxe(adamiteToolMaterial,"adamite_pickaxe");
        adamiteSpade = new ToolSpade(adamiteToolMaterial,"adamite_spade");
        adamiteSword = new ToolSword(adamiteToolMaterial,"adamite_sword");

        adamiteChew = new AdamiteChew().setRegistryName("adamite_chew").setUnlocalizedName(AdamiteTools.MOD_ID + ".adamite_chew");

        ItemArmor.ArmorMaterial adamiteArmorMaterial = EnumHelper.addArmorMaterial("adamite",AdamiteTools.MOD_ID+":adamite", 3600,new int[] {3, 6, 8, 3},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1F);
        adamiteHelmet = new AdamiteArmor(adamiteArmorMaterial,1, EntityEquipmentSlot.HEAD).setRegistryName("adamite_helmet").setUnlocalizedName(AdamiteTools.MOD_ID + ".adamite_helmet");
        adamiteChestplate = new AdamiteArmor(adamiteArmorMaterial,1,EntityEquipmentSlot.CHEST).setRegistryName("adamite_chestplate").setUnlocalizedName(AdamiteTools.MOD_ID + ".adamite_chestplate");
        adamiteLeggings = new AdamiteArmor(adamiteArmorMaterial,2,EntityEquipmentSlot.LEGS).setRegistryName("adamite_leggings").setUnlocalizedName(AdamiteTools.MOD_ID + ".adamite_leggings");
        adamiteBoots = new AdamiteArmor(adamiteArmorMaterial,1,EntityEquipmentSlot.FEET).setRegistryName("adamite_boots").setUnlocalizedName(AdamiteTools.MOD_ID + ".adamite_boots");

        add(adamite);
        add(adamiteAxe);
        add(adamiteHoe);
        add(adamitePickaxe);
        add(adamiteSpade);
        add(adamiteSword);
        add(adamiteChew);
        add(adamiteHelmet);
        add(adamiteChestplate);
        add(adamiteLeggings);
        add(adamiteBoots);

    }
    private static void add(Item item){
        item.setCreativeTab(AdamiteTools.MOD_TAB);
        ITEMS.add(item);
    }
}
