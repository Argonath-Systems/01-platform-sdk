package com.hypixel.hytale.server.core.command;

/**
 * Stub for Hytale SDK CommandRegistry interface.
 * 
 * <p>Provides command registration for plugin commands.
 * The real implementation is provided by HytaleServer.jar at runtime.
 */
public interface CommandRegistry {
    
    /**
     * Register a command.
     *
     * @param command The command to register
     */
    default void registerCommand(Object command) {
        // Stub implementation
    }
}
