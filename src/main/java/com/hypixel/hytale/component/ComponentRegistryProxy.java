package com.hypixel.hytale.component;

import com.hypixel.hytale.codec.builder.BuilderCodec;

import java.util.function.Supplier;

/**
 * Stub for Hytale SDK ComponentRegistryProxy class.
 * 
 * <p>Plugin-facing proxy for component registration. Obtained via 
 * {@code PluginBase.getEntityStoreRegistry()}.
 * 
 * <p>Matches real API: {@code com.hypixel.hytale.component.ComponentRegistryProxy<ECS_TYPE>}
 *
 * @param <ECS_TYPE> The store type (e.g., EntityStore)
 */
public class ComponentRegistryProxy<ECS_TYPE> {
    
    /**
     * Register a transient component type (no persistence).
     *
     * @param componentClass The component class
     * @param supplier Factory for creating default instances
     * @param <T> The component type
     * @return The registered ComponentType
     */
    public <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(
            Class<? super T> componentClass,
            Supplier<T> supplier
    ) {
        throw new UnsupportedOperationException("Stub - real implementation provided by HytaleServer.jar");
    }
    
    /**
     * Register a persistent component type with BSON serialization.
     *
     * @param componentClass The component class
     * @param name Unique name for the component
     * @param codec BuilderCodec for BSON serialization
     * @param <T> The component type
     * @return The registered ComponentType
     */
    public <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(
            Class<? super T> componentClass,
            String name,
            BuilderCodec<T> codec
    ) {
        throw new UnsupportedOperationException("Stub - real implementation provided by HytaleServer.jar");
    }
    
    /**
     * Register a persistent component type with BSON serialization and persistence flag.
     *
     * @param componentClass The component class
     * @param name Unique name for the component
     * @param codec BuilderCodec for BSON serialization
     * @param persistent Whether the component should be persisted
     * @param <T> The component type
     * @return The registered ComponentType
     */
    public <T extends Component<ECS_TYPE>> ComponentType<ECS_TYPE, T> registerComponent(
            Class<? super T> componentClass,
            String name,
            BuilderCodec<T> codec,
            boolean persistent
    ) {
        throw new UnsupportedOperationException("Stub - real implementation provided by HytaleServer.jar");
    }
    
    /**
     * Shutdown and clean up this registry proxy.
     */
    public void shutdown() {
        // Stub
    }
}
