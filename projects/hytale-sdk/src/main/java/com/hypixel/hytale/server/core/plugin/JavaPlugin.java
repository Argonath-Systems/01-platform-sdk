package com.hypixel.hytale.server.core.plugin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class JavaPlugin {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public void onEnable() {
    }

    public void onDisable() {
    }
    
    public Logger getLogger() {
        return logger;
    }
}
