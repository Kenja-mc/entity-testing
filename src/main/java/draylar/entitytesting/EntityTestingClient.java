package draylar.entitytesting;

import draylar.entitytesting.client.model.CubeEntityModel;
import draylar.entitytesting.client.renderer.CubeEntityRenderer;
import draylar.entitytesting.entity.CubeEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

@Environment(EnvType.CLIENT)
public class EntityTestingClient implements ClientModInitializer {
    public static final EntityModelLayer CUBE_MODEL_LAYER = new EntityModelLayer(CubeEntity.CUBE_MOB_ID, "main");

    @Override
    public void onInitializeClient() {
        // Register the Renderer
        EntityRendererRegistry.register(EntityTesting.CUBE, CubeEntityRenderer::new);
        // Register the Model
        EntityModelLayerRegistry.registerModelLayer(CUBE_MODEL_LAYER, CubeEntityModel::getTexturedModelData);
    }
}
