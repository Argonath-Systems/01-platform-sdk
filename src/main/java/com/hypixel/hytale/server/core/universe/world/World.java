package com.hypixel.hytale.server.core.universe.world;

/**
 * Stub for Hytale SDK World class.
 * 
 * <p>Represents a game world.
 * The real implementation is provided by HytaleServer.jar at runtime.
 */
public interface World {
    
    /**
     * Execute a task on the world thread.
     *
     * @param task The task to execute
     */
    void execute(Runnable task);
    
    /**
     * Get the world's name.
     */
    String getName();
}
