package com.hypixel.hytale.component;

/**
 * Stub for Hytale SDK Ref class.
 * 
 * <p>Reference to an entity within a Store.
 * 
 * <p>Matches real API: {@code com.hypixel.hytale.component.Ref<ECS_TYPE>}
 *
 * @param <ECS_TYPE> The store type (typically EntityStore)
 */
public class Ref<ECS_TYPE> {
    
    private final Store<ECS_TYPE> store;
    private volatile int index;
    
    public Ref(Store<ECS_TYPE> store) {
        this.store = store;
        this.index = -1;
    }
    
    public Ref(Store<ECS_TYPE> store, int index) {
        this.store = store;
        this.index = index;
    }
    
    /**
     * Get the store this reference belongs to.
     */
    public Store<ECS_TYPE> getStore() {
        return store;
    }
    
    /**
     * Get the entity index.
     */
    public int getIndex() {
        return index;
    }
    
    /**
     * Check if this reference is still valid.
     */
    public boolean isValid() {
        return index >= 0;
    }
}
