package com.hytale.api.plugin;

import com.hytale.api.Server;

public interface Plugin {
    void onEnable(Server server);
    void onDisable();
}