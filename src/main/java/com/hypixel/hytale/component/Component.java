package com.hypixel.hytale.component;

/**
 * Stub for Hytale SDK Component interface.
 * 
 * <p>Base interface for all ECS components. Components are attached to entities
 * and managed by the ECS Store system.
 * 
 * <p>Matches real API: {@code com.hypixel.hytale.component.Component<ECS_TYPE>}
 * 
 * @param <ECS_TYPE> The store type (e.g., EntityStore, ChunkStore)
 */
public interface Component<ECS_TYPE> extends Cloneable {
    
    /**
     * Clone this component.
     * 
     * @return A clone of this component
     */
    Component<ECS_TYPE> clone();
}
