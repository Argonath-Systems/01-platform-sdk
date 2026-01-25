# Platform SDK

**Core platform interfaces and abstractions for Lord of the Tales**

Defines the fundamental interfaces and data structures used across all framework and mod components. This is the foundation layer that enables platform-agnostic development.

## Purpose

Provides:
- Core entity interfaces (`Entity`, `Player`, `NPC`)
- Location and world abstractions
- Item and inventory interfaces
- Event system definitions
- Plugin lifecycle interfaces

## Architecture

This SDK follows the **Accessor Pattern** to maintain platform independence:
- Business logic depends only on SDK interfaces
- Platform adapters (e.g., `02-adapter-hytale`) implement these interfaces
- No direct Hytale API imports in this module

## Key Interfaces

### Entity System
```java
public interface Entity {
    UUID getUniqueId();
    String getName();
    Location getLocation();
    World getWorld();
}
```

### Player System
```java
public interface Player extends Entity {
    void sendMessage(String message);
    boolean hasPermission(String permission);
    Inventory getInventory();
}
```

## Usage

Add as a dependency:

```xml
<dependency>
    <groupId>com.argonathsystems</groupId>
    <artifactId>platform-sdk</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

## Building

```bash
mvn clean install
```

Or from the project root:

```bash
just build-all
```

## Testing

This module includes comprehensive unit tests:

```bash
mvn test
```

## Dependencies

- **Parent**: [01-platform-core](https://github.com/Argonath-Systems/01-platform-core)
- **Runtime**: No external dependencies (pure interfaces)

## License

Copyright © 2025 Argonath Systems. All rights reserved.
