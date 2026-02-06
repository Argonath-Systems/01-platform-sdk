# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Initial project structure
- Core functionality implementation

### Changed - Real Hytale API Alignment (2026-02-05)

- **BuilderCodec**: Rewrote with `builder(Class<T>, Supplier<T>)` static factory, `Builder<T>` inner class with `append()`, `addField()`, `afterDecode()`, `versioned()`, `documentation()`, and `build()` methods
- **KeyedCodec**: Changed from `<T, V>` to single `<FieldType>` type parameter matching real API; added `of()` static factory method
- **Codec**: Replaced `UUID` constant with `UUID_BINARY` (`UUIDBinaryCodec`) and `UUID_STRING` (`FunctionCodec<String, UUID>`) matching real API field names

### Removed - Real Hytale API Alignment (2026-02-05)

- **`server.plugin.component` package**: Deleted `Component.java` and `ComponentType.java` — these were fabricated and don't exist in the real Hytale API. Real types live in `com.hypixel.hytale.component.*`
- **`server.plugin.EntityStoreRegistry`**: Deleted — doesn't exist in real API. Use `ComponentRegistryProxy` instead
- **`BuilderCodec.create()`**: Removed incorrect static factory; real API uses `BuilderCodec.builder(Class, Supplier)`

### Fixed

## [1.0.0] - 2026-01-25

### Added
- Initial release
- Core functionality implemented
- Documentation and examples
- Build system configured

[Unreleased]: https://github.com/Argonath-Systems/01-platform-sdk/compare/v1.0.0...HEAD
[1.0.0]: https://github.com/Argonath-Systems/01-platform-sdk/releases/tag/v1.0.0
