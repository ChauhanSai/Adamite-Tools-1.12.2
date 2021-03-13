package ChauhanSaiMC.AdamiteTools.init;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import net.minecraft.block.material.Material;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class ModFluids {
    public static final List<Fluid> FLUIDS = new LinkedList<>();

    public static Fluid moltenAdamite;

    public static void preInit() {
        moltenAdamite = new Fluid("moltenadamite",new ResourceLocation(AdamiteTools.MOD_ID,"blocks/adamite_still"),new ResourceLocation(AdamiteTools.MOD_ID,"blocks/adamite_flow"),new Color(9,165,68)).setViscosity(2000).setTemperature(1000).setLuminosity(3000);

        add(moltenAdamite);
    }
    private static void add(Fluid fluid) {
        FluidRegistry.registerFluid(fluid);
        FluidRegistry.addBucketForFluid(fluid);
        FLUIDS.add(fluid);
        ModBlocks.BLOCKS.add(new BlockFluidClassic(fluid, Material.LAVA).setRegistryName(fluid.getName()+"_block"));
    }
}
