package com.hytale.api.world;

import com.hytale.api.Location;
import com.hytale.api.block.Block;
import com.hytale.api.block.BlockType;
import com.hytale.api.entity.Player;
import com.hytale.api.entity.Entity;
import com.hytale.api.entity.Hologram;
import java.util.Collection;
import java.util.UUID;

public interface World {
    String getName();
    Collection<Player> getPlayers();
    Collection<Entity> getEntities();
    Entity getEntity(UUID uuid);
    Hologram spawnHologram(Location location, String... lines);
    void playSound(Location location, String sound, float volume, float pitch);
    Biome getBiomeAt(int x, int y, int z);
    Zone getZoneAt(int x, int y, int z);
    long getTime();
    boolean isRaining();
    boolean isThundering();
    Block getBlockAt(int x, int y, int z);
    void setBlock(int x, int y, int z, BlockType type);
    Location getSpawnLocation();
    Difficulty getDifficulty();
}
