package com.hytale.api;

import com.hytale.api.event.EventBus;
import com.hytale.api.inventory.ItemStack;
import com.hytale.api.scheduler.Scheduler;
import com.hytale.api.world.World;
import com.hytale.api.registry.ItemRegistry;
import com.hytale.api.data.DataStorage;
import java.util.Collection;

public interface Server {
    Logger getLogger();
    EventBus getEventBus();
    Scheduler getScheduler();
    World getWorld(String name);
    World getDefaultWorld();
    Collection<World> getWorlds();
    ItemStack createItemStack(String type, int amount);
    ItemRegistry getItemRegistry();
    DataStorage getDataStorage();
}
