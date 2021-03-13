package ChauhanSaiMC.AdamiteTools.integrations.tconstruct;

import ChauhanSaiMC.AdamiteTools.init.ModBlocks;
import ChauhanSaiMC.AdamiteTools.init.ModFluids;
import ChauhanSaiMC.AdamiteTools.init.ModItems;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;

public class SmeltryRecipes {
    public static void init() {
        TinkerRegistry.registerBasinCasting(new ItemStack(ModBlocks.adamiteBlock), ItemStack.EMPTY, ModFluids.moltenAdamite, 1296);
        TinkerRegistry.registerTableCasting(new ItemStack(ModItems.adamite), TinkerSmeltery.castIngot, ModFluids.moltenAdamite, 144);

        TinkerRegistry.registerMelting(ModItems.adamite,ModFluids.moltenAdamite,144);
        TinkerRegistry.registerMelting(ModItems.adamiteAxe,ModFluids.moltenAdamite,144 * 3);
        TinkerRegistry.registerMelting(ModItems.adamitePickaxe,ModFluids.moltenAdamite,144 * 3);
        TinkerRegistry.registerMelting(ModItems.adamiteSpade,ModFluids.moltenAdamite,144);
        TinkerRegistry.registerMelting(ModItems.adamiteSword,ModFluids.moltenAdamite,144 * 2);
        TinkerRegistry.registerMelting(ModItems.adamiteHoe,ModFluids.moltenAdamite,144 * 2);
        TinkerRegistry.registerMelting(ModItems.adamiteHelmet,ModFluids.moltenAdamite,144 * 5);
        TinkerRegistry.registerMelting(ModItems.adamiteChestplate,ModFluids.moltenAdamite,144 * 8);
        TinkerRegistry.registerMelting(ModItems.adamiteLeggings,ModFluids.moltenAdamite,144 * 7);
        TinkerRegistry.registerMelting(ModItems.adamiteBoots,ModFluids.moltenAdamite,144 * 4);
    }
}
