package com.hytale.api.event;

import com.hytale.api.entity.Player;

public class PlayerQuitEvent extends Event {
    private final Player player;

    public PlayerQuitEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}