package com.hypixel.hytale.codec.codecs;

import com.hypixel.hytale.codec.Codec;

import java.util.List;
import java.util.function.Supplier;

/**
 * Stub for Hytale SDK ListCodec class.
 * 
 * <p>Provides serialization for List types.
 * The real implementation is provided by HytaleServer.jar at runtime.
 *
 * @param <E> The element type of the list
 */
public class ListCodec<E> implements Codec<List<E>> {
    
    private final Codec<E> elementCodec;
    private final Supplier<List<E>> listFactory;
    
    /**
     * Create a new ListCodec.
     *
     * @param elementCodec Codec for list elements
     * @param listFactory Factory to create new list instances
     */
    public ListCodec(Codec<E> elementCodec, Supplier<List<E>> listFactory) {
        this.elementCodec = elementCodec;
        this.listFactory = listFactory;
    }
    
    public Codec<E> getElementCodec() {
        return elementCodec;
    }
    
    public Supplier<List<E>> getListFactory() {
        return listFactory;
    }
}
