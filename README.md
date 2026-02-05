# Julio's Boots

A Minecraft Fabric mod that gives you creative-mode flight in survival. Equip the boots, double-jump, and fly.

Based on [WingedSandals](https://github.com/adil192/WingedSandals) by **adil192** — upgraded to Netherite tier with multi-version support via [Stonecutter](https://github.com/AnomalyFi/Stonecutter).

![Crafting Recipe](https://github.com/jpalacio0x/juliosboots/blob/f312ee11488d31da44e7a72986c1a0ea09dd9000/.github/gallery/Crafting.png)

---

## How It Works

1. Craft Julio's Boots by combining **Netherite Boots** + **Elytra** in any crafting grid (shapeless).
2. Equip them in your feet slot.
3. **Double-press Space** to toggle flight — standard creative flight controls apply.

The mod hooks into a server tick event: every tick it checks whether the boots are equipped and sets `allowFlying` on the player accordingly. If the boots break or are unequipped, flight is immediately disabled.

---

## What Changed vs. WingedSandals

| | WingedSandals | Julio's Boots |
|---|---|---|
| Material tier | Gold | Netherite |
| Crafting recipe | Gold Boots + Elytra | Netherite Boots + Elytra |
| Repair ingredient | Gold Ingot | Netherite Ingot |
| Mod loader | Fabric + NeoForge | Fabric |
| Multi-version build | No | Yes (Stonecutter) |

---

## Supported Versions

| Minecraft | Status |
|---|---|
| 1.21.11 (Mounts of Mayhem) | Supported |
| 1.21.5 | Supported |
| 1.21.4 | Supported |
| 1.21.2 | Supported |
| 1.21.1 | Supported |
| 1.20.5 | Supported |
| 1.20.1 | Supported |

---

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/) for your Minecraft version.
2. Install [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api).
3. Download the `.jar` for your version from the [releases page](https://github.com/jpalacio0x/juliosboots/releases).
4. Drop it into `.minecraft/mods/`.

---

## Building From Source

Requires JDK 21 (JDK 17 is used automatically for 1.20.1 builds).

```bash
# Build for all supported versions
./gradlew build

# Build for a single version (e.g. 1.21.4)
./gradlew :1.21.4:build
```

Stonecutter handles the version-specific code preprocessing at build time — no manual changes needed between versions.

---

## Project Structure

```
src/main/kotlin/com/xtifed/juliosboots/
├── JuliosBoots.kt                  # Mod entry point (ModInitializer)
├── JuliosBootsDataGenerator.kt     # Data gen entry point
├── datagen/
│   ├── ModRecipeProvider.kt        # Shapeless crafting recipe
│   └── ModModelProvider.kt         # Item model (GENERATED)
└── item/
    ├── JuliosBootsItem.kt          # Flight logic (inventoryTick)
    ├── ModItems.kt                 # Item registration + server tick listener
    └── ModArmorMaterials.kt        # Netherite-equivalent armor material
```

---

## Customizing Textures

Replace the relevant files under `src/main/resources/`:

| Asset | Path |
|---|---|
| Inventory icon | `assets/juliosboots/textures/item/juliosboots.png` |
| Armor layer (1.21.4+) | `assets/juliosboots/textures/entity/equipment/humanoid/juliosboots.png` |
| Armor layer (< 1.21.4) | `assets/juliosboots/textures/models/armor/juliosboots_layer_1.png` |

---

## License

MIT. See [LICENSE](LICENSE).
