package com.xtifed.juliosboots.item

import com.xtifed.juliosboots.JuliosBoots
//? if <1.21
import net.minecraft.item.ArmorItem
import net.minecraft.item.Items
import net.minecraft.recipe.Ingredient
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.registry.entry.RegistryEntry
import net.minecraft.sound.SoundEvent
import net.minecraft.util.Identifier
import java.util.*

//? if >=1.21.2 {
/*import net.minecraft.item.equipment.ArmorMaterial
import net.minecraft.item.equipment.ArmorMaterials
//? if >=1.21.4
/^import net.minecraft.item.equipment.EquipmentAssetKeys.REGISTRY_KEY^/
import net.minecraft.item.equipment.EquipmentType
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.ItemTags
*///?} else {
import net.minecraft.item.ArmorMaterial
import net.minecraft.item.ArmorMaterials
//?}

object ModArmorMaterials {
  val juliosBootsMaterial = registerJuliosBootsMaterial()

  //? if >=1.20.5 && <=1.21.1 {
  /*private fun registerJuliosBootsMaterial(): RegistryEntry<ArmorMaterial> {
    return Registry.registerReference(Registries.ARMOR_MATERIAL, JuliosBootsArmorMaterial.id, JuliosBootsArmorMaterial.instance)
  }
  *///?} else {
  private fun registerJuliosBootsMaterial(): ArmorMaterial = JuliosBootsArmorMaterial.instance
  //?}
}

//? if >=1.21.2 {
/*class JuliosBootsArmorMaterial {
  companion object {
    private val gold = ArmorMaterials.NETHERITE
    private val netherite = ArmorMaterials.NETHERITE

    val id = Identifier.of(JuliosBoots.MOD_ID, "juliosboots")!!
    val instance = ArmorMaterial(
      7,
      gold.defense,
      gold.enchantmentValue,
      gold.equipSound,
      gold.toughness,
      netherite.knockbackResistance,
      ItemTags.REPAIRS_NETHERITE_ARMOR,
      //? if >=1.21.4 {
      /^RegistryKey.of(REGISTRY_KEY, id),
      ^///?} else {
      id,
      //?}
    )
  }
}
*///?} else if >=1.20.5 {
/*class JuliosBootsArmorMaterial {
  companion object {
    private val gold = ArmorMaterials.NETHERITE.value()
    private val netherite = ArmorMaterials.NETHERITE.value()

    val id = Identifier.of(JuliosBoots.MOD_ID, "juliosboots")!!
    val instance = ArmorMaterial(
      gold.defense,
      gold.enchantability,
      gold.equipSound,
      { Ingredient.ofItems(Items.NETHERITE_INGOT, ModItems.juliosBoots) },
      listOf(ArmorMaterial.Layer(id)),
      gold.toughness,
      netherite.knockbackResistance,
    )
  }
}
*///?} else {
class JuliosBootsArmorMaterial : ArmorMaterial {
  companion object {
    val id = Identifier.of(JuliosBoots.MOD_ID, "juliosboots")!!
    val instance = JuliosBootsArmorMaterial()
  }

  override fun getDurability(type: ArmorItem.Type?): Int = ArmorMaterials.NETHERITE.getDurability(type)
  override fun getProtection(type: ArmorItem.Type?): Int = ArmorMaterials.NETHERITE.getProtection(type)
  override fun getEnchantability(): Int = ArmorMaterials.NETHERITE.enchantability
  override fun getEquipSound(): SoundEvent? = ArmorMaterials.NETHERITE.equipSound
  override fun getRepairIngredient(): Ingredient? = Ingredient.ofItems(Items.NETHERITE_INGOT, ModItems.juliosBoots)
  override fun getName(): String? = id.path
  override fun getToughness(): Float = ArmorMaterials.NETHERITE.toughness
  override fun getKnockbackResistance(): Float = ArmorMaterials.NETHERITE.knockbackResistance
}
//?}
