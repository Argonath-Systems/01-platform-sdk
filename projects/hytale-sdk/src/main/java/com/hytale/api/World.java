package com.hytale.api;

import com.hytale.api.entity.Entity;
import com.hytale.api.entity.Player;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import com.hytale.api.entity.Hologram;

public interface World {
    String getName();
    Collection<Entity> getEntities();
    Collection<Player> getPlayers();
    Entity getEntity(UUID uuid);
    void playSound(Location location, String sound, float volume, float pitch);
    Hologram spawnHologram(Location location, String... lines);
    void execute(Runnable runnable);
    <T> CompletableFuture<T> execute(java.util.function.Supplier<T> supplier);
}
