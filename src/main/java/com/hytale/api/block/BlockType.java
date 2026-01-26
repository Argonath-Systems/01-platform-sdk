package com.hytale.api.block;

public interface BlockType {
    String getId();
    boolean isPassable();
    boolean isSolid();

    static BlockType get(String id) {
        return null; // Stub implementation
    }
}
