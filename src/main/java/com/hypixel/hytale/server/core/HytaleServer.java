package com.hypixel.hytale.server.core;

import com.hytale.api.Server;
import com.hytale.api.Logger;
import com.hytale.api.event.EventBus;
import com.hytale.api.scheduler.Scheduler;
import com.hytale.api.world.World;
import com.hytale.api.inventory.ItemStack;
import com.hytale.api.registry.ItemRegistry;
import com.hytale.api.data.DataStorage;
import java.util.Collection;
import java.util.Collections;

public class HytaleServer implements Server {
    private static HytaleServer instance;

    public static HytaleServer get() {
        if (instance == null) {
            instance = new HytaleServer();
        }
        return instance;
    }

    @Override
    public Logger getLogger() { return null; }
    @Override
    public EventBus getEventBus() { return null; }
    @Override
    public Scheduler getScheduler() { return null; }
    @Override
    public World getWorld(String name) { return null; }
    @Override
    public World getDefaultWorld() { return null; }
    @Override
    public Collection<World> getWorlds() { return Collections.emptyList(); }
    @Override
    public ItemStack createItemStack(String type, int amount) { return null; }
    @Override
    public ItemRegistry getItemRegistry() { return null; }
    @Override
    public DataStorage getDataStorage() { return null; }
}
