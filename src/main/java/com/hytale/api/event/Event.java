package com.hytale.api.event;

public abstract class Event {
    private boolean cancelled = false;
    
    public String getEventName() {
        return getClass().getSimpleName();
    }
}