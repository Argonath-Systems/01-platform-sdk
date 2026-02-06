package com.hypixel.hytale.codec;

/**
 * Stub for Hytale SDK KeyedCodec class.
 * 
 * <p>Provides key-based encoding/decoding for component fields.
 * The real implementation is provided by HytaleServer.jar at runtime.
 * 
 * <p>Matches real API: {@code com.hypixel.hytale.codec.KeyedCodec<FieldType>}
 *
 * @param <FieldType> The type of the field being encoded/decoded
 */
public class KeyedCodec<FieldType> {
    
    private final String key;
    private final Codec<FieldType> codec;
    
    /**
     * Create a new KeyedCodec with the given key name and codec.
     *
     * @param key The field key name for serialization
     * @param codec The codec for the field value
     */
    public KeyedCodec(String key, Codec<FieldType> codec) {
        this.key = key;
        this.codec = codec;
    }
    
    /**
     * Static factory method for creating a KeyedCodec.
     * 
     * @param key The field key name
     * @param codec The codec for the field value
     * @param <FieldType> The type of the field
     * @return A new KeyedCodec
     */
    public static <FieldType> KeyedCodec<FieldType> of(String key, Codec<FieldType> codec) {
        return new KeyedCodec<>(key, codec);
    }
    
    public String getKey() {
        return key;
    }
    
    public Codec<FieldType> getCodec() {
        return codec;
    }
}
