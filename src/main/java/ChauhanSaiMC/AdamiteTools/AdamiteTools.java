package ChauhanSaiMC.AdamiteTools;

import ChauhanSaiMC.AdamiteTools.handlers.FurnaceRecipesHandler;
import ChauhanSaiMC.AdamiteTools.handlers.OreDictionaryHandler;
import ChauhanSaiMC.AdamiteTools.handlers.proxy.IProxy;
import ChauhanSaiMC.AdamiteTools.init.ModBlocks;
import ChauhanSaiMC.AdamiteTools.init.ModItems;
import ChauhanSaiMC.AdamiteTools.worldgen.OreGeneration;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = AdamiteTools.MOD_ID, name = "Adamite Tools", version = "1.0.0", acceptedMinecraftVersions = "1.12.2")
public class AdamiteTools {
    public static final String MOD_ID = "adamitetools";

    public static final CreativeTabs MOD_TAB = new CreativeTabs(MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.adamite);
        }
    };

    @Mod.Instance
    public static AdamiteTools instance;

    @SidedProxy(clientSide = "ChauhanSaiMC.AdamiteTools.handlers.proxy.ClientProxy",serverSide = "ChauhanSaiMC.AdamiteTools.handlers.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.preInit();
        ModBlocks.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        OreDictionaryHandler.init();
        FurnaceRecipesHandler.init();
        GameRegistry.registerWorldGenerator(new OreGeneration(),2);
    }
}