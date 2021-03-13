package ChauhanSaiMC.AdamiteTools.integrations;

import ChauhanSaiMC.AdamiteTools.integrations.tconstruct.SmeltryRecipes;
import ChauhanSaiMC.AdamiteTools.integrations.tconstruct.ToolMaterials;
import net.minecraftforge.fml.common.Loader;

public class Integrations {
    public static void preInit() {
        if (Loader.isModLoaded("tconstruct")) ToolMaterials.preInit();
    }

    public static void Init() {
        if (Loader.isModLoaded("tconstruct")) SmeltryRecipes.init();
    }

}
