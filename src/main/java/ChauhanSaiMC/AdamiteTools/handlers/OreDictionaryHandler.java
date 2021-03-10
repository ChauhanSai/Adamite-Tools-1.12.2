package ChauhanSaiMC.AdamiteTools.handlers;

import ChauhanSaiMC.AdamiteTools.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {
    public static void init() {
        OreDictionary.registerOre("ingotAdamite", ModItems.adamite);
    }
}
