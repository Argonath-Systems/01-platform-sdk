package com.hytale.api.entity;

import java.util.UUID;

public interface Player {
    UUID getUniqueId();
    String getName();
    int getHealth();
    int getMaxHealth();
}