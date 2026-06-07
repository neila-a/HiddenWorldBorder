package top.neila.hiddenworldborder.forge;

import top.neila.hiddenworldborder.HiddenWorldBorder;
import net.minecraftforge.fml.common.Mod;

@Mod(HiddenWorldBorder.MOD_ID)
public final class HiddenWorldBorderForge {
    public HiddenWorldBorderForge() {
        // Run our common setup.
        HiddenWorldBorder.init();
    }
}
