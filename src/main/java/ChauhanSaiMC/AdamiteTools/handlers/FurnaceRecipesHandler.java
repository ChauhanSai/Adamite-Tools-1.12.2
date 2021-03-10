package ChauhanSaiMC.AdamiteTools.handlers;

import ChauhanSaiMC.AdamiteTools.init.ModBlocks;
import ChauhanSaiMC.AdamiteTools.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipesHandler {
    public static void init() {
        GameRegistry.addSmelting(ModBlocks.adamiteOre,new ItemStack(ModItems.adamite),1f);
    }
}
