# Legacy Sodium

An independent performance-mod project targeting **Minecraft Java 1.8.9** with **Legacy Fabric Loader** and **Legacy Fabric API**.

> **Development status:** this repository is currently an early bootstrap. It does not yet contain Sodium's chunk-rendering engine or meaningful rendering optimizations. Builds from this stage are development/test JARs, not a finished Sodium replacement.

## Target environment

| Component | Target |
|---|---|
| Minecraft | 1.8.9 |
| Mod loader | Legacy Fabric Loader |
| API | Legacy Fabric API |
| Runtime compatibility | Java 8 |
| Build tool runtime | Java 17 (Gradle/Loom) |
| Java bytecode target | Java 8 |

## Build

Run:

```sh
./gradlew --no-daemon build
```

The remapped mod JAR is written to `build/libs/`.

The GitHub Actions workflow builds on pushes and pull requests and stores the JAR as a workflow artifact. Pushing a version tag such as `v0.1.0` builds the project and publishes a GitHub Release automatically.

## Roadmap

- [x] Establish the 1.8.9 Legacy Fabric project and dependency setup
- [x] Add automated Java 8-targeted build checks
- [ ] Replace template code with the independent rendering implementation
- [ ] Add configurable performance options
- [ ] Test in a real 1.8.9 client with other Legacy Fabric mods

This project is not affiliated with or endorsed by CaffeineMC.
