package ChauhanSaiMC.AdamiteTools.integrations.tconstruct;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import ChauhanSaiMC.AdamiteTools.init.ModFluids;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.*;
import slimeknights.tconstruct.library.utils.HarvestLevels;

public class ToolMaterials {
    public static void preInit() {
        Material adamite = new Material(AdamiteTools.MOD_ID+".adamite",0x09A544);
        adamite.addItemIngot("ingotAdamite");
        adamite.setFluid(ModFluids.moltenAdamite);
        adamite.setCastable(true);
        adamite.setCraftable(false);
        TinkerRegistry.addMaterialStats(adamite, new HeadMaterialStats(3600, 8.25F, 6.03F, HarvestLevels.COBALT), new HandleMaterialStats(1.35F, 400), new ExtraMaterialStats(300), new BowMaterialStats(1.33F, 2.35F, 2.32F));
        TinkerRegistry.integrate(adamite).preInit();
    }
}
