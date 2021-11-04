package draylar.entitytesting.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

/*
 * Our Cube Entity extends MobEntityWithAi, which extends MobEntity, which extends LivingEntity.
 *
 * LivingEntity has health and can deal damage.
 * MobEntity has movement controls and AI capabilities.
 * MobEntityWithAi has pathfinding favor and slightly tweaked leash behavior.
 */
public class CubeEntity extends PathAwareEntity {
    public static Identifier CUBE_MOB_ID = new Identifier("entitytesting", "cube");

    public CubeEntity(EntityType<? extends PathAwareEntity> entityType, World world) {

        super(entityType, world);
    }
}
