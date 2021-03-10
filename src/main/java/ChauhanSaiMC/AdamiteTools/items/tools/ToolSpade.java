package ChauhanSaiMC.AdamiteTools.items.tools;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade {
    public ToolSpade(ToolMaterial material, String name){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(AdamiteTools.MOD_ID+"."+name);
    }
}
