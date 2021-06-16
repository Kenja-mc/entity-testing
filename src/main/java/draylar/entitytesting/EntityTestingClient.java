package draylar.entitytesting;

import draylar.entitytesting.EntityTesting;
import draylar.entitytesting.client.model.CubeEntityModel;
import draylar.entitytesting.client.renderer.CubeEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
@SuppressWarnings("deprecation")
public class EntityTestingClient implements ClientModInitializer {
    public static final EntityModelLayer CUBE_MODEL_LAYER = new EntityModelLayer(EntityTesting.CUBE_MOB_ID, "main");

    @Override
    public void onInitializeClient() {

        //Register the model?
        EntityModelLayerRegistry.registerModelLayer(CUBE_MODEL_LAYER,
                () -> CubeEntityModel.createModelData()
                );
        //Register the renderer
        EntityRendererRegistry.INSTANCE.register(EntityTesting.CUBE, CubeEntityRenderer::new);

    }
}
