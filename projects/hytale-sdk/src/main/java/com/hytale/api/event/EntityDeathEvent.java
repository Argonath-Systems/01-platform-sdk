package com.hytale.api.event;

import com.hytale.api.entity.Entity;
import com.hytale.api.entity.Player;

public class EntityDeathEvent extends Event {
    private final Entity entity;
    private final Entity killer;

    public EntityDeathEvent(Entity entity, Entity killer) {
        this.entity = entity;
        this.killer = killer;
    }

    public Entity getEntity() {
        return entity;
    }

    public Entity getKiller() {
        return killer;
    }
}
