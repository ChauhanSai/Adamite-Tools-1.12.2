package ChauhanSaiMC.AdamiteTools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AdamiteBlock extends Block {
    public AdamiteBlock() {
        super(Material.IRON);
        setSoundType(SoundType.METAL);
        setHardness(40F);
        setResistance(2500F);
    }
}
