package com.hypixel.hytale.codec;

/**
 * Stub for Hytale SDK Codec interface.
 * 
 * <p>Provides serialization/deserialization for component data.
 * The real implementation is provided by HytaleServer.jar at runtime.
 */
public interface Codec<T> {
    
    // Common codec instances
    Codec<String> STRING = new Codec<>() {};
    Codec<Integer> INTEGER = new Codec<>() {};
    Codec<Long> LONG = new Codec<>() {};
    Codec<Double> DOUBLE = new Codec<>() {};
    Codec<Float> FLOAT = new Codec<>() {};
    Codec<Boolean> BOOLEAN = new Codec<>() {};
    Codec<java.util.UUID> UUID_BINARY = new Codec<>() {};
    Codec<java.util.UUID> UUID_STRING = new Codec<>() {};
    
    /**
     * Create a list codec.
     */
    static <E> Codec<java.util.List<E>> list(Codec<E> elementCodec) {
        return new Codec<>() {};
    }
}
