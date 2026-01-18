package com.hytale.api;

import com.hytale.api.event.EventBus;
import com.hytale.api.inventory.ItemStack;
import com.hytale.api.scheduler.Scheduler;
import java.util.Collection;

public interface Server {
    Logger getLogger();
    EventBus getEventBus();
    Scheduler getScheduler();
    World getWorld(String name);
    Collection<World> getWorlds();
    ItemStack createItemStack(String type, int amount);
}