package com.xtifed.juliosboots

import com.xtifed.juliosboots.item.ModItems
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object JuliosBoots : ModInitializer {
  const val MOD_ID = "juliosboots"
  val logger = LoggerFactory.getLogger(MOD_ID)!!

  override fun onInitialize() {
    logger.info("Hello Fabric world!")
    ModItems.registerItems()
  }
}
