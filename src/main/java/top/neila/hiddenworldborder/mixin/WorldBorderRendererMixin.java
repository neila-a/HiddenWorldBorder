package top.neila.hiddenworldborder.mixin;

import net.minecraft.client.renderer.WorldBorderRenderer;
import net.minecraft.client.renderer.state.level.WorldBorderRenderState;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldBorderRenderer.class)
public class WorldBorderRendererMixin {
    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    public void emptyRender(
        final WorldBorderRenderState state,
        final Vec3 cameraPos,
        final double renderDistance,
        final double depthFar,
        CallbackInfo info
    ) {
        info.cancel();
    }
}
