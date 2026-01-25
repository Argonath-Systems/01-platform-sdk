package com.hytale.api.block;

public interface BlockType {
    String getId();
    boolean isPassable();
    boolean isSolid();
}
