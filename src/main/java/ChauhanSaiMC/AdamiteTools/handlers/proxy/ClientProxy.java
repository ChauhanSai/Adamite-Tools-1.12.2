package ChauhanSaiMC.AdamiteTools.handlers.proxy;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import ChauhanSaiMC.AdamiteTools.init.ModFluids;
import ChauhanSaiMC.AdamiteTools.init.ModItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy implements IProxy{
    @Override
    public void init() {

    }

    @Override
    public void preInit() {

    }
    private static void registerFluidTexture(Fluid fluid) {
        ModelResourceLocation loc = new ModelResourceLocation(AdamiteTools.MOD_ID + ":" + fluid.getName(), "fluid");
        ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(fluid.getBlock()), stack -> loc);
        ModelLoader.setCustomStateMapper(fluid.getBlock(), new StateMapperBase() {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
                return loc;
            }
        });
    }

    @Mod.EventBusSubscriber(modid = AdamiteTools.MOD_ID)
    public static class ModelRegistry {
        @SubscribeEvent
        public static void ModelRegister(ModelRegistryEvent event) {
            ModItems.ITEMS.forEach(item -> ModelLoader.setCustomModelResourceLocation(item, 0,new ModelResourceLocation(item.getRegistryName(), "inventory")));
            ModFluids.FLUIDS.forEach(ClientProxy::registerFluidTexture);
        }
    }
}
