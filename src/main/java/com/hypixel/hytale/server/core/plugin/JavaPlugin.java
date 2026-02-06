package com.hypixel.hytale.server.core.plugin;

import com.hypixel.hytale.component.ComponentRegistryProxy;
import com.hypixel.hytale.server.core.event.EventRegistry;
import com.hypixel.hytale.server.core.command.CommandRegistry;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Stub for Hytale SDK JavaPlugin.
 * 
 * <p>Matches real API: JavaPlugin extends PluginBase.
 * PluginBase provides getEntityStoreRegistry(), getEventRegistry(), etc.</p>
 * 
 * <h2>Lifecycle (from PluginBase):</h2>
 * <ol>
 *   <li>Constructor — Plugin instantiated (state = NONE)</li>
 *   <li>{@link #setup0()} / {@link #setup()} — Setup phase (state = SETUP).
 *       Register commands, events, entity stores, and components here.</li>
 *   <li>{@link #start0()} / {@link #start()} — Start phase (state = START → ENABLED)</li>
 *   <li>{@link #shutdown0(boolean)} / {@link #shutdown()} — Shutdown phase (state = SHUTDOWN → DISABLED)</li>
 * </ol>
 * 
 * <p><b>IMPORTANT:</b> There is NO {@code onEnable()} or {@code onDisable()} method
 * in the real Hytale SDK. Use {@code setup()}/{@code start()} and {@code shutdown()} instead.</p>
 * 
 * @see <a href="https://hytalemodding.dev/en/docs">Hytale SDK Documentation</a>
 */
public abstract class JavaPlugin {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final EventRegistry eventRegistry = new EventRegistry() {};
    private final CommandRegistry commandRegistry = new CommandRegistry() {};
    private final ComponentRegistryProxy<EntityStore> entityStoreRegistry = new ComponentRegistryProxy<>();

    public JavaPlugin(JavaPluginInit init) {
    }

    public JavaPlugin() {
    }
    
    // ========== Lifecycle Methods (from PluginBase) ==========
    
    /**
     * Internal setup hook called by the PluginManager.
     * 
     * <p>Override to perform internal setup before the user-facing {@link #setup()} is called.
     * State is SETUP when this is invoked.</p>
     */
    protected void setup0() {
    }
    
    /**
     * Called during plugin setup phase.
     * 
     * <p>Override to register commands, events, entity stores, and components.
     * This is the canonical place for {@code getEventRegistry().registerGlobal()} calls.</p>
     * 
     * <p>State is SETUP when this is invoked. EventRegistry is available.</p>
     */
    protected void setup() {
    }
    
    /**
     * Internal start hook called by the PluginManager.
     * 
     * <p>Called after setup completes. JavaPlugin overrides this from PluginBase.
     * State transitions from START → ENABLED during/after this phase.</p>
     */
    protected void start0() {
    }
    
    /**
     * Called during plugin start phase, after setup is complete.
     * 
     * <p>Override for any initialization that requires the plugin to be fully set up.
     * State is START when this is invoked.</p>
     */
    protected void start() {
    }
    
    /**
     * Internal shutdown hook called by the PluginManager.
     * 
     * <p>State is SHUTDOWN when this is invoked.</p>
     * 
     * @param graceful true if this is a graceful shutdown, false if forced
     */
    protected void shutdown0(boolean graceful) {
    }
    
    /**
     * Called during plugin shutdown phase.
     * 
     * <p>Override to clean up resources, deregister handlers, and save state.
     * State is SHUTDOWN when this is invoked.</p>
     */
    protected void shutdown() {
    }
    
    // ========== Deprecated Methods ==========
    
    /**
     * @deprecated Hytale SDK has NO onEnable() method. Use {@link #setup()} or {@link #start()} instead.
     *             This method is never called by the real Hytale runtime.
     */
    @Deprecated(forRemoval = true)
    public void onEnable() {
    }

    /**
     * @deprecated Hytale SDK has NO onDisable() method. Use {@link #shutdown()} instead.
     *             This method is never called by the real Hytale runtime.
     */
    @Deprecated(forRemoval = true)
    public void onDisable() {
    }
    
    // ========== Accessor Methods ==========
    
    public Logger getLogger() {
        return logger;
    }
    
    public String getName() {
        return getClass().getSimpleName();
    }
    
    /**
     * Get the event registry for registering event handlers.
     */
    public EventRegistry getEventRegistry() {
        return eventRegistry;
    }
    
    /**
     * Get the command registry for registering commands.
     */
    public CommandRegistry getCommandRegistry() {
        return commandRegistry;
    }
    
    /**
     * Get the entity store registry for registering persistent ECS components.
     * 
     * <p>Matches real API: {@code PluginBase.getEntityStoreRegistry()} returns
     * {@code ComponentRegistryProxy<EntityStore>}.
     */
    public ComponentRegistryProxy<EntityStore> getEntityStoreRegistry() {
        return entityStoreRegistry;
    }
}
