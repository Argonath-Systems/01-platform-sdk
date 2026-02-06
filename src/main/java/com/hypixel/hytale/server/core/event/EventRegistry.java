package com.hypixel.hytale.server.core.event;

import java.util.function.Consumer;

/**
 * Stub for Hytale SDK EventRegistry interface.
 * 
 * <p>Provides event registration for player and global events.
 * The real implementation is provided by HytaleServer.jar at runtime.
 */
public interface EventRegistry {
    
    /**
     * Register a global event handler.
     *
     * @param eventClass The event class to listen for
     * @param handler The event handler
     * @param <E> The event type
     */
    default <E> void registerGlobal(Class<E> eventClass, Consumer<E> handler) {
        // Stub implementation
    }
    
    /**
     * Register a player-scoped event handler.
     *
     * @param eventClass The event class to listen for
     * @param handler The event handler
     * @param <E> The event type
     */
    default <E> void registerPlayer(Class<E> eventClass, Consumer<E> handler) {
        // Stub implementation
    }
}
