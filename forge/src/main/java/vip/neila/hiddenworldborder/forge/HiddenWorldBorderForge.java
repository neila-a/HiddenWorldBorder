package vip.neila.hiddenworldborder.forge;

import vip.neila.hiddenworldborder.HiddenWorldBorder;
import net.minecraftforge.fml.common.Mod;

@Mod(HiddenWorldBorder.MOD_ID)
public final class HiddenWorldBorderForge {
    public HiddenWorldBorderForge() {
        // Run our common setup.
        HiddenWorldBorder.init();
    }
}
