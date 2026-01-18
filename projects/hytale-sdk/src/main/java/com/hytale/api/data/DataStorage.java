package com.hytale.api.data;

import java.util.Collection;

public interface DataStorage {
    void delete(String key);
    DataContainer getOrCreate(String key);
    DataContainer get(String key);
    Collection<String> getAllKeys();
}
