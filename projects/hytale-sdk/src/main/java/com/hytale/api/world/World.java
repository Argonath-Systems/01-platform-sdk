package com.hytale.api.world;

import com.hytale.api.Location;
import com.hytale.api.block.Block;
import com.hytale.api.entity.Player;
import com.hytale.api.entity.Entity;
import java.util.Collection;

public interface World {
    String getName();
    Collection<Player> getPlayers();
    Collection<Entity> getEntities();
    Biome getBiomeAt(int x, int y, int z);
    Zone getZoneAt(int x, int y, int z);
    long getTime();
    boolean isRaining();
    boolean isThundering();
    Block getBlockAt(int x, int y, int z);
    Location getSpawnLocation();
    Difficulty getDifficulty();
}
