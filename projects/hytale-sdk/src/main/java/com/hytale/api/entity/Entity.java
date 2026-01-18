package com.hytale.api.entity;

import java.util.UUID;
import com.hytale.api.world.World;
import com.hytale.api.Location;

public interface Entity {
    UUID getUniqueId();
    World getWorld();
    Location getLocation();
    String getType();
    String getName();
    double getHealth();
    double getMaxHealth();
    void setHealth(double health);
    <T> T getComponent(Class<T> componentClass);
    void remove();
    void teleport(Location location);
}
