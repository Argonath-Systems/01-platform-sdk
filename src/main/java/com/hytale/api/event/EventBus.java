package com.hytale.api.event;

public interface EventBus {
    void register(EventListener listener);
    void unregister(EventListener listener);
    void callEvent(Event event);
}