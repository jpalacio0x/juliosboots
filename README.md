# Julio's Boots

**Julio's Boots** is a Minecraft Fabric mod that introduces powerful endgame flight mechanics. Based on the original [WingedSandals](https://github.com/adil192/WingedSandals) mod by **adil192**, this version features significant upgrades to durability, protection, and modern Minecraft version support.

## Features

- **Creative Flight in Survival:** Double-jump to fly, just like in Creative mode.
- **Netherite Tier:** Unlike the original version which matches Gold, **Julio's Boots** possess the durability, protection, and toughness of **Netherite Boots**.
- **Balanced Endgame Crafting:** Requires **Netherite Boots** and an **Elytra**, making it a high-tier achievement.
- **Multi-Version Support:** Built for modern Minecraft, including the latest **1.21.11 (Mounts of Mayhem)** update.

## Credits

This mod is a fork of [WingedSandals](https://github.com/adil192/WingedSandals) by **adil192**. We would like to thank the original author for the foundation of the flight mechanics. 

**Key Changes in this version:**
- Refactored codebase and unique identity.
- Upgraded material properties from Gold to Netherite.
- Updated crafting recipe to require Netherite gear.
- Added compatibility for Minecraft 1.21.4 through 1.21.11.

## Supported Versions

Currently supporting:
- **1.21.x**: 1.21.1, 1.21.2, 1.21.4, 1.21.5, **1.21.11**
- **1.20.x**: 1.20.1, 1.20.5

## Installation

1. Install [Minecraft Fabric Loader](https://fabricmc.net/use/installer/).
2. Download the `.jar` file for your specific Minecraft version from the releases page.
3. Place the file into your `.minecraft/mods` folder.
4. Ensure you have the [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api) installed.

## Crafting & Usage

### Crafting
Combine **Netherite Boots** and an **Elytra** in any crafting grid.

![Crafting Recipe](https://github.com/adil192/WingedSandals/raw/main/.github/gallery/crafting_recipe.png)
*(Recipe now uses Netherite instead of Gold)*

### Usage
1. Equip **Julio's Boots** in your feet slot.
2. **Double-jump** (Space twice) to toggle flight.
3. Use standard creative flight controls.

---

## Customizing Textures (For Developers)

If you wish to change the boot textures, replace the following in `src/main/resources/`:

- **Inventory Icon:** `assets/juliosboots/textures/item/juliosboots.png`
- **Armor Model (1.21.4+):** `assets/juliosboots/textures/entity/equipment/humanoid/juliosboots.png`
- **Armor Model (< 1.21.4):** `assets/juliosboots/textures/models/armor/juliosboots_layer_1.png`

## License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.