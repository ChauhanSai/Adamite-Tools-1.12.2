package ChauhanSaiMC.AdamiteTools.items.tools;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe {
    public ToolAxe(ToolMaterial material, float damage, float speed, String name){
        super(material, damage, speed);
        setRegistryName(name);
        setUnlocalizedName(AdamiteTools.MOD_ID+"."+name);
    }
}
