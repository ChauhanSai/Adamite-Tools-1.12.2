package ChauhanSaiMC.AdamiteTools.items.tools;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword {
    public ToolSword(ToolMaterial material, String name){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(AdamiteTools.MOD_ID+"."+name);
    }
}
