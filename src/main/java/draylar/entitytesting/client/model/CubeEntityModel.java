package draylar.entitytesting.client.model;

import draylar.entitytesting.entity.CubeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class CubeEntityModel<T extends Entity> extends EntityModel<T> {

    private final ModelPart base;

    public CubeEntityModel(ModelPart root) {
        this.base = root.getChild("base");
    }

    public static TexturedModelData createModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild("base", ModelPartBuilder.create()
                .cuboid(-6, -6, -6, 12, 12, 12),
                ModelTransform.pivot(0, 0, 0)
        );

        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        // translate model down
        matrices.translate(0, 1.125, 0);

        // render cube
        base.render(matrices, vertices, light, overlay);
    }
}
