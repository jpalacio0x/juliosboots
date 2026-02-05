package com.xtifed.juliosboots

import com.xtifed.juliosboots.datagen.ModModelProvider
import com.xtifed.juliosboots.datagen.ModRecipeProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

class JuliosBootsDataGenerator : DataGeneratorEntrypoint {
  //? if >=1.21.11 {
  /*override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
    val pack = fabricDataGenerator.createPack()
    pack.addProvider(::ModModelProvider)
    pack.addProvider(::ModRecipeProvider)
  }
  *///?} else {
  override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator?) {
    val pack = fabricDataGenerator!!.createPack()
    pack.addProvider(::ModModelProvider)
    pack.addProvider(::ModRecipeProvider)
  }
  //?}
}
