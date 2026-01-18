package com.hytale.api;

import com.hytale.api.event.EventBus;

public interface Server {
    Logger getLogger();
    EventBus getEventBus();
}