package com.hypixel.hytale.codec.codecs;

import com.hypixel.hytale.codec.Codec;

import java.util.Map;
import java.util.function.Supplier;

/**
 * Stub for Hytale SDK MapCodec class.
 * 
 * <p>Provides serialization for Map types with string keys.
 * The real implementation is provided by HytaleServer.jar at runtime.
 *
 * @param <V> The value type of the map
 */
public class MapCodec<V> implements Codec<Map<String, V>> {
    
    private final Codec<V> valueCodec;
    private final Supplier<Map<String, V>> mapFactory;
    private final boolean allowEmpty;
    
    /**
     * Create a new MapCodec.
     *
     * @param valueCodec Codec for map values
     * @param mapFactory Factory to create new map instances
     * @param allowEmpty Whether empty maps are allowed
     */
    public MapCodec(Codec<V> valueCodec, Supplier<Map<String, V>> mapFactory, boolean allowEmpty) {
        this.valueCodec = valueCodec;
        this.mapFactory = mapFactory;
        this.allowEmpty = allowEmpty;
    }
    
    public Codec<V> getValueCodec() {
        return valueCodec;
    }
    
    public Supplier<Map<String, V>> getMapFactory() {
        return mapFactory;
    }
    
    public boolean isAllowEmpty() {
        return allowEmpty;
    }
}
