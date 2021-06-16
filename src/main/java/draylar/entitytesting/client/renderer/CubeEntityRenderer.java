package draylar.entitytesting.client.renderer;

import draylar.entitytesting.EntityTesting;
import draylar.entitytesting.EntityTestingClient;
import draylar.entitytesting.client.model.CubeEntityModel;
import draylar.entitytesting.entity.CubeEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

/*
 * A renderer is used to provide an entity model, shadow size, and texture.
 */
@Environment(EnvType.CLIENT)
public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel<CubeEntity>> {

    public CubeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new CubeEntityModel<>(context.getPart(EntityTestingClient.CUBE_MODEL_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return new Identifier("entitytesting", "textures/entity/cube/cube.png");
    }
}
