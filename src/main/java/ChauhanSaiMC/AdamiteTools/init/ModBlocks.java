package ChauhanSaiMC.AdamiteTools.init;

import ChauhanSaiMC.AdamiteTools.AdamiteTools;
import ChauhanSaiMC.AdamiteTools.blocks.AdamiteBlock;
import ChauhanSaiMC.AdamiteTools.blocks.AdamiteOre;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

import java.util.LinkedList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new LinkedList<>();

    public static Block adamiteBlock;
    public static Block adamiteOre;

    public static void preInit(){
        adamiteBlock = new AdamiteBlock().setRegistryName("adamite_block").setUnlocalizedName(AdamiteTools.MOD_ID+".adamite_block");
        adamiteOre = new AdamiteOre().setRegistryName("adamite_ore").setUnlocalizedName(AdamiteTools.MOD_ID+".adamite_ore");

        add(adamiteBlock);
        add(adamiteOre);
    }

    private static void add(Block block) {
        block.setCreativeTab(AdamiteTools.MOD_TAB);
        BLOCKS.add(block);
        ModItems.ITEMS.add(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
}
