package com.hytale.api.entity;

import java.util.UUID;

import com.hytale.api.inventory.Inventory;

public interface Player extends Entity {
    Inventory getInventory();
    void sendMessage(String message);
    void playSound(String sound, float volume, float pitch);
    void stopSound(String sound);
    
    // UI
    void openUI(String uiId, Object context);
    void closeUI();
    boolean hasUIOpen(String uiId);
    void sendUIUpdate(String elementId, Object data);

    // Notifications
    void sendNotification(String title, String message, String icon);
}