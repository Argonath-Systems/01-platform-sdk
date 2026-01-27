package com.hytale.api.data;

import java.util.Collection;

/**
 * Stub for Hytale SDK DataContainer interface.
 * 
 * <p>Note: Real Hytale SDK may have different types. This is a placeholder stub.
 * In the future, consider using DataValue for type safety.
 * 
 * @version 2.0.0 - Added documentation about DataValue alternative
 */
public interface DataContainer {
    void clear();
    void set(String key, Object value);
    void save();
    Collection<String> getKeys();
    Object get(String key);
}
