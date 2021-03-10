package ChauhanSaiMC.AdamiteTools.handlers;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import ChauhanSaiMC.AdamiteTools.init.ModBlocks;
import ChauhanSaiMC.AdamiteTools.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = AdamiteTools.MOD_ID)
public class RegistryHandler {
    @SubscribeEvent
    public static void itemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void blockRegister(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }
}
