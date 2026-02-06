package com.hypixel.hytale.codec.builder;

import com.hypixel.hytale.codec.Codec;
import com.hypixel.hytale.codec.KeyedCodec;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Stub for Hytale SDK BuilderCodec class.
 * 
 * <p>Provides a builder-pattern based codec for component serialization.
 * The real implementation is provided by HytaleServer.jar at runtime.
 * 
 * <p>Real API pattern:
 * <pre>{@code
 * BuilderCodec.builder(MyComponent.class, MyComponent::new)
 *     .addField(KeyedCodec.of("fieldName", Codec.STRING), setter, getter)
 *     .addField(...)
 *     .build();
 * }</pre>
 *
 * @param <T> The type being encoded/decoded
 */
public class BuilderCodec<T> implements Codec<T> {
    
    private BuilderCodec() {
        // Use builder() factory method
    }
    
    /**
     * Create a new builder for this codec type.
     * 
     * <p>Matches real API: {@code BuilderCodec.builder(Class<T>, Supplier<T>)}
     *
     * @param clazz The class being encoded
     * @param factory Factory to create new instances
     * @param <T> The type being encoded/decoded
     * @return A new Builder for configuring fields
     */
    public static <T> Builder<T> builder(Class<T> clazz, Supplier<T> factory) {
        return new Builder<>(clazz, factory);
    }
    
    /**
     * Builder for constructing a BuilderCodec.
     * 
     * <p>Matches real API inner class: {@code BuilderCodec.Builder<T>}
     * which extends {@code BuilderCodec.BuilderBase<T, Builder<T>>}.
     *
     * @param <T> The type being encoded/decoded
     */
    public static class Builder<T> {
        
        private final Class<T> clazz;
        private final Supplier<T> factory;
        
        Builder(Class<T> clazz, Supplier<T> factory) {
            this.clazz = clazz;
            this.factory = factory;
        }
        
        /**
         * Append a field to the codec and return self for chaining.
         * 
         * <p>In the real API, append() returns a FieldBuilder that requires .add() 
         * to return to the Builder. This stub simplifies by returning the Builder 
         * directly, so both patterns work:
         * <ul>
         *   <li>{@code .append(kc, setter, getter)} — simplified (stub-compatible)</li>
         *   <li>{@code .addField(kc, setter, getter)} — matches real API shorthand</li>
         * </ul>
         *
         * @param keyedCodec The keyed codec for the field
         * @param setter BiConsumer to set the field value on the object
         * @param getter Function to get the field value from the object
         * @param <FieldType> The field value type
         * @return This builder for chaining
         */
        public <FieldType> Builder<T> append(
                KeyedCodec<FieldType> keyedCodec,
                BiConsumer<T, FieldType> setter,
                Function<T, FieldType> getter
        ) {
            return this;
        }
        
        /**
         * Add a field to the codec (shorthand that doesn't require .add()).
         * 
         * <p>Matches real API: {@code BuilderBase.addField(KeyedCodec, BiConsumer, Function)}
         * which returns the Builder directly.
         *
         * @param keyedCodec The keyed codec for the field
         * @param setter BiConsumer to set the field value on the object
         * @param getter Function to get the field value from the object
         * @param <FieldType> The field value type
         * @return This builder for chaining
         */
        public <FieldType> Builder<T> addField(
                KeyedCodec<FieldType> keyedCodec,
                BiConsumer<T, FieldType> setter,
                Function<T, FieldType> getter
        ) {
            return this;
        }
        
        /**
         * Set a callback to run after decoding.
         * 
         * @param afterDecode Consumer to run after decoding
         * @return This builder for chaining
         */
        public Builder<T> afterDecode(java.util.function.Consumer<T> afterDecode) {
            return this;
        }
        
        /**
         * Add versioning information.
         * 
         * @param version The version number
         * @return This builder for chaining
         */
        public Builder<T> versioned(int version) {
            return this;
        }
        
        /**
         * Add documentation.
         * 
         * @param doc The documentation string
         * @return This builder for chaining
         */
        public Builder<T> documentation(String doc) {
            return this;
        }
        
        /**
         * Build the final BuilderCodec.
         * 
         * @return The built BuilderCodec
         */
        public BuilderCodec<T> build() {
            return new BuilderCodec<>();
        }
    }
}
