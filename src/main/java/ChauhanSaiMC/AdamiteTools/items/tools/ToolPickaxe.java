package ChauhanSaiMC.AdamiteTools.items.tools;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe {
    public ToolPickaxe(ToolMaterial material, String name){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(AdamiteTools.MOD_ID+"."+name);
    }
}
