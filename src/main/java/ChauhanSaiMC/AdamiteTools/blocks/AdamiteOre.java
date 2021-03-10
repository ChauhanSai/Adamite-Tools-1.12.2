package ChauhanSaiMC.AdamiteTools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AdamiteOre extends Block {
    public AdamiteOre() {
        super(Material.ROCK);
        setSoundType(SoundType.STONE);
        setHardness(10F);
        setResistance(20F);
    }
}
