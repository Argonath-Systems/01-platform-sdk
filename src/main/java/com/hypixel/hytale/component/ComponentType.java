package com.hypixel.hytale.component;

/**
 * Stub for Hytale SDK ComponentType class.
 * 
 * <p>Represents a registered component type that can be attached to entities.
 * 
 * <p>Matches real API: {@code com.hypixel.hytale.component.ComponentType<ECS_TYPE, T>}
 * where T extends Component.
 *
 * @param <ECS_TYPE> The store type (e.g., EntityStore)
 * @param <T> The component type
 */
public class ComponentType<ECS_TYPE, T extends Component<ECS_TYPE>> {
    
    private Class<? super T> typeClass;
    private int index;
    
    public ComponentType() {
        // Default constructor matching real API
    }
    
    public Class<? super T> getTypeClass() {
        return typeClass;
    }
    
    public int getIndex() {
        return index;
    }
}
