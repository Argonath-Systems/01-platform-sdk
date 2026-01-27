package com.hytale.api.entity;

import java.util.UUID;

import com.hytale.api.inventory.Inventory;

/**
 * Stub for Hytale SDK Player interface.
 * 
 * <p>Note: Real Hytale SDK may have different types. This is a placeholder stub.
 * 
 * @version 2.0.0 - Added documentation about type safety
 */
public interface Player extends Entity {
    Inventory getInventory();
    void sendMessage(String message);
    void playSound(String sound, float volume, float pitch);
    void stopSound(String sound);
    
    // UI - Platform SDK uses Object, but our framework uses UIContext/UIUpdateData
    void openUI(String uiId, Object context);
    void closeUI();
    boolean hasUIOpen(String uiId);
    void sendUIUpdate(String elementId, Object data);

    // Notifications
    void sendNotification(String title, String message, String icon);
}