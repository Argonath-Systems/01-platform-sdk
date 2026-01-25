# Platform SDK - Core Platform Interfaces

## 📋 Project Information

**Title:** Platform SDK - Platform-Agnostic API  
**Project Type:** Library / SDK  
**Current Version:** 1.0.0  
**Maven Coordinates:** `com.argonathsystems:platform-sdk:1.0.0-SNAPSHOT`  
**License:** All Rights Reserved

## 🎯 Purpose

The **Platform SDK** provides platform-agnostic interfaces for all core game engine functionality. It enables "Zero Hytale Imports" architecture by defining pure Java interfaces for Entity, Player, World, Item, and Event systems - allowing business logic to remain completely independent of the Hytale API.

This SDK is the contract between your game logic and the underlying platform implementation.

## 📦 What's Included

- **Entity System**: Entity, Player, NPC, LivingEntity interfaces
- **World Management**: World, Location, Chunk, Block interfaces
- **Item System**: Item, ItemStack, Inventory interfaces
- **Event System**: Event, Listener, EventHandler abstractions
- **Plugin API**: Plugin lifecycle and registration interfaces
- **Component System**: Generic component attachment framework

## ✨ Key Features

### Platform Independence

```java
// Business logic uses only SDK interfaces
public interface Entity {
    UUID getUniqueId();
    String getName();
    Location getLocation();
    void teleport(Location location);
}

public interface Player extends Entity {
    void sendMessage(String message);
    boolean hasPermission(String permission);
    Inventory getInventory();
}
```

No `import com.hypixel.hytale.*` anywhere!

### Complete Type System

```java
public interface World {
    String getName();
    Collection<Player> getPlayers();
    void spawnEntity(EntityType type, Location location);
    Block getBlockAt(Location location);
}

public interface Location {
    World getWorld();
    double getX();
    double getY();
    double getZ();
    float getYaw();
    float getPitch();
}
```

### Event-Driven Architecture

```java
public interface Event {
    boolean isCancelled();
    void setCancelled(boolean cancelled);
}

public interface Listener {
    void register();
    void unregister();
}
```

## 🚀 Installation

### Maven Dependency

```xml
<dependency>
    <groupId>com.argonathsystems</groupId>
    <artifactId>platform-sdk</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

### Gradle Dependency

```gradle
dependencies {
    implementation 'com.argonathsystems:platform-sdk:1.0.0-SNAPSHOT'
}
```

## 📖 Usage Examples

### Creating a Teleportation Service

```java
public class TeleportService {
    public void teleportPlayer(Player player, Location destination) {
        // Only uses SDK interfaces - no Hytale imports!
        player.sendMessage("Teleporting...");
        player.teleport(destination);
        player.sendMessage("Teleport complete!");
    }
}
```

### Custom Event System

```java
public class QuestCompleteEvent implements Event {
    private final Player player;
    private final String questId;
    private boolean cancelled = false;
    
    @Override
    public boolean isCancelled() {
        return cancelled;
    }
    
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
```

### Inventory Management

```java
public interface Inventory {
    ItemStack getItem(int slot);
    void setItem(int slot, ItemStack item);
    void addItem(ItemStack item);
    boolean contains(ItemStack item);
}
```

## 🏗️ Architecture

```
[Business Logic]
       ↓
[Platform SDK] ← Pure Java interfaces
       ↓
[Adapter Layer] ← Hytale implementation
       ↓
[Hytale API]
```

Zero Hytale imports above the adapter layer!

## 📸 Screenshots

![Interface Hierarchy](screenshots/interface-hierarchy.png)
*Complete SDK interface hierarchy*

![Class Diagram](screenshots/class-diagram.png)
*UML diagram showing relationships*

![Event System](screenshots/event-system.png)
*Event-driven architecture flow*

## 🏷️ Tags

`platform-sdk` `api` `interfaces` `abstraction-layer` `platform-agnostic` `entity-system` `event-system` `zero-imports` `hytale` `lord-of-the-tales`

## 🔗 Dependencies

**Parent POM:**
- [Platform Core](https://github.com/Argonath-Systems/01-platform-core)

**No runtime dependencies** - pure interfaces only!

## 🔗 Related Projects

- [Framework Accessor](https://github.com/Argonath-Systems/02-framework-accessor) - High-level accessor pattern implementation
- [Hytale Adapter](https://github.com/Argonath-Systems/02-adapter-hytale) - Platform implementation
- [All Frameworks](https://github.com/Argonath-Systems?q=framework) - SDK-based frameworks

## 🌐 Links

- **GitHub**: https://github.com/Argonath-Systems/01-platform-sdk
- **JavaDoc**: https://argonath-systems.github.io/01-platform-sdk/javadoc
- **Issues**: https://github.com/Argonath-Systems/01-platform-sdk/issues
- **Releases**: https://github.com/Argonath-Systems/01-platform-sdk/releases

## 📄 License

Copyright © 2025 Argonath Systems. All rights reserved.

## 👥 Authors & Contributors

- **Argonath Systems Team**
- **HytaleModder AI Agent**

## 📝 Changelog

### Version 1.0.0 (2025-01-25)
- Initial release
- Core entity, player, world, item interfaces
- Event system abstractions
- Plugin API framework
- Component attachment system
- Complete JavaDoc documentation

## 🆘 Support

- **GitHub Issues**: https://github.com/Argonath-Systems/01-platform-sdk/issues
- **Discord**: [LOTT Community Discord]
- **Email**: support@argonathsystems.com

## 🤝 Contributing

See [CONTRIBUTING.md](../CONTRIBUTING.md) for contribution guidelines.
