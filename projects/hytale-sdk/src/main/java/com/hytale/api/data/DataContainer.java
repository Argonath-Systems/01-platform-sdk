package com.hytale.api.data;

import java.util.Collection;

public interface DataContainer {
    void clear();
    void set(String key, Object value);
    void save();
    Collection<String> getKeys();
    Object get(String key);
}
