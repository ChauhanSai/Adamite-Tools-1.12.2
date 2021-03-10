package ChauhanSaiMC.AdamiteTools.items.tools;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe {
    public ToolHoe(ToolMaterial material, String name){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(AdamiteTools.MOD_ID+"."+name);
    }
}
