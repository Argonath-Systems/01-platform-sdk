package com.hypixel.hytale.component;

/**
 * Stub for Hytale SDK Store class.
 * 
 * <p>The ECS entity store. Manages entities and their components within a world.
 * 
 * <p>Matches real API: {@code com.hypixel.hytale.component.Store<ECS_TYPE>}
 *
 * @param <ECS_TYPE> The store type (typically EntityStore)
 */
public class Store<ECS_TYPE> {
    
    private final ECS_TYPE externalData;
    
    public Store(ECS_TYPE externalData) {
        this.externalData = externalData;
    }
    
    /**
     * Get external data (e.g., the EntityStore/World context).
     */
    public ECS_TYPE getExternalData() {
        return externalData;
    }
    
    /**
     * Get a component from an entity.
     *
     * @param ref Reference to the entity
     * @param componentType The component type
     * @param <T> The component type
     * @return The component, or null if not present
     */
    public <T extends Component<ECS_TYPE>> T getComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE, T> componentType) {
        throw new UnsupportedOperationException("Stub - real implementation provided by HytaleServer.jar");
    }
    
    /**
     * Get or create a component for an entity.
     *
     * @param ref Reference to the entity
     * @param componentType The component type
     * @param <T> The component type
     * @return The existing or newly created component
     */
    public <T extends Component<ECS_TYPE>> T ensureAndGetComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE, T> componentType) {
        throw new UnsupportedOperationException("Stub - real implementation provided by HytaleServer.jar");
    }
    
    /**
     * Add a component to an entity.
     *
     * @param ref Reference to the entity
     * @param componentType The component type
     * @param <T> The component type
     * @return The added component
     */
    public <T extends Component<ECS_TYPE>> T addComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE, T> componentType) {
        throw new UnsupportedOperationException("Stub - real implementation provided by HytaleServer.jar");
    }
    
    /**
     * Remove a component from an entity.
     *
     * @param ref Reference to the entity
     * @param componentType The component type
     * @param <T> The component type
     */
    public <T extends Component<ECS_TYPE>> void removeComponent(Ref<ECS_TYPE> ref, ComponentType<ECS_TYPE, T> componentType) {
        throw new UnsupportedOperationException("Stub - real implementation provided by HytaleServer.jar");
    }
}
