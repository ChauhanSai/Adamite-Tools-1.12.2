package ChauhanSaiMC.AdamiteTools.handlers.proxy;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import ChauhanSaiMC.AdamiteTools.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy implements IProxy{
    @Override
    public void init() {

    }

    @Override
    public void preInit() {

    }
    @Mod.EventBusSubscriber(modid = AdamiteTools.MOD_ID)
    public static class ModelRegistry {
        @SubscribeEvent
        public static void ModelRegister(ModelRegistryEvent event) {
            ModItems.ITEMS.forEach(item -> ModelLoader.setCustomModelResourceLocation(item, 0,new ModelResourceLocation(item.getRegistryName(), "inventory")));
        }
    }
}
