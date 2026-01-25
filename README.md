# Platform SDK

> **Core platform interfaces and abstractions for Argonath Systems**

[![GitHub](https://img.shields.io/badge/GitHub-Argonath--Systems-181717?logo=github)](https://github.com/Argonath-Systems/01-platform-sdk)
[![Maven](https://img.shields.io/badge/Maven-Central-C71A36?logo=apache-maven)](https://maven.apache.org/)
[![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)](https://openjdk.org/)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](../LICENSE)
[![Website](https://img.shields.io/badge/Docs-argonath--systems.github.io-blue)](https://argonath-systems.github.io/00-Argonath-Wiki)

---

## 📋 Overview

Defines the **fundamental interfaces and data structures** used across all framework and mod components. This is the foundation layer that enables platform-agnostic development in the Argonath Systems ecosystem.

## 🎯 Purpose

### Core Abstractions Provided

- 👤 **Core entity interfaces** - `Entity`, `Player`, `NPC`
- 🌍 **Location and world abstractions** - `Location`, `World`, `Dimension`
- 🏟 **Item and inventory interfaces** - `Item`, `ItemStack`, `Inventory`
- ⚡ **Event system definitions** - `GameEvent`, `EventListener`, `EventBus`
- 🔌 **Plugin lifecycle interfaces** - `Plugin`, `PluginContext`, `PluginLifecycle`
- 📊 **Data structures** - Common DTOs and value objects

## 🏛️ Architecture

This SDK follows the **Accessor Pattern** to maintain platform independence:

```
┌───────────────────────────────────────┐
│        YOUR BUSINESS LOGIC                │
│    (Frameworks, Mods, Plugins)            │
└────────────────┬───────────────────────┘
                 │ depends on
┌────────────────┴───────────────────────┐
│       PLATFORM SDK (THIS MODULE)         │
│      (Interfaces & DTOs Only)            │
└────────────────┬───────────────────────┘
                 │ implemented by
┌────────────────┴───────────────────────┐
│         PLATFORM ADAPTERS                 │
│  (Hytale, Bukkit, Fabric, etc.)         │
└───────────────────────────────────────┘
```

### Key Principles

- ✅ **Business logic depends only on SDK interfaces**
- ✅ **Platform adapters implement these interfaces**
- ✅ **No direct Hytale API imports in this module**
- ✅ **Pure Java - zero game engine coupling**

## 📑 Key Interfaces

### Entity System

```java
public interface Entity {
    UUID getUniqueId();
    String getName();
    Location getLocation();
    World getWorld();
    void teleport(Location location);
}
```

### Player System

```java
public interface Player extends Entity {
    void sendMessage(String message);
    boolean hasPermission(String permission);
    Inventory getInventory();
    int getLevel();
    void giveExperience(int amount);
}
```

### Inventory System

```java
public interface Inventory {
    ItemStack[] getContents();
    void addItem(ItemStack item);
    boolean hasItem(String itemId, int count);
    void removeItem(String itemId, int count);
    boolean hasSpace();
}
```

## 💻 Usage

### Maven Dependency

Add to your `pom.xml`:

```xml
<dependency>
    <groupId>com.argonathsystems</groupId>
    <artifactId>platform-sdk</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

### Example: Using Entity Interfaces

```java
import com.argonathsystems.platform.entity.Player;
import com.argonathsystems.platform.world.Location;

public class MyMod {
    public void teleportPlayer(Player player, Location destination) {
        // Platform-agnostic code - no Hytale imports!
        player.teleport(destination);
        player.sendMessage("Teleported to: " + destination.toString());
    }
}
```

### Example: Working with Inventories

```java
import com.argonathsystems.platform.inventory.Inventory;
import com.argonathsystems.platform.item.ItemStack;

public void giveRewards(Player player) {
    Inventory inv = player.getInventory();
    
    if (inv.hasSpace()) {
        ItemStack reward = ItemStack.of("gold_coin", 100);
        inv.addItem(reward);
    }
}
```

## 🔨 Building

```bash
# From this directory
mvn clean install

# Or from workspace root with justfile
just build-all

# Build without tests
mvn clean install -DskipTests
```

## 🧪 Testing

This module includes comprehensive unit tests:

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=EntityTest

# Run with coverage
mvn clean verify
```

## 🔗 Dependencies

### Build Time
- **Parent**: [01-platform-core](https://github.com/Argonath-Systems/01-platform-core) - Root POM configuration

### Runtime
- **None** - This is a pure interface module with zero external dependencies

### Test Time
- JUnit 5 - Unit testing
- AssertJ - Fluent assertions
- Mockito - Mocking (when needed)

## 📚 Documentation

- 🌐 [**Documentation Website**](https://argonath-systems.github.io/00-Argonath-Wiki)
- 📖 [**SDK API Reference**](https://argonath-systems.github.io/00-Argonath-Wiki/docs/api/platform-sdk.html)
- 🏗️ [**Architecture Guide**](https://argonath-systems.github.io/00-Argonath-Wiki/docs/architecture/overview.html)

## 🤝 Contributing

See [CONTRIBUTING.md](../CONTRIBUTING.md) for development guidelines.

## 💬 Community

- 💬 [**Discord**](https://discord.gg/RK3MtpyH) - Chat and support
- 🐛 [**Issues**](https://github.com/orgs/Argonath-Systems/issues) - Bug reports
- 📖 [**Discussions**](https://github.com/orgs/Argonath-Systems/discussions) - Q&A

## 📄 License

MIT License - Copyright © 2025 Argonath Systems. See [LICENSE](../LICENSE) for details.

---

<div align="center">

Part of the [**Argonath Systems**](https://github.com/orgs/Argonath-Systems/) ecosystem

[Documentation](https://argonath-systems.github.io/00-Argonath-Wiki) • [Discord](https://discord.gg/RK3MtpyH) • [GitHub](https://github.com/orgs/Argonath-Systems/)

</div>
