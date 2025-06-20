@file:Suppress("unused")

package com.mythicalitems.registry

import org.bukkit.Sound
import org.bukkit.inventory.EquipmentSlot
import com.mythicalitems.MythicalItems
import com.mythicalitems.registry.Equipment
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.world.item.behavior.*

@Init(stage = InitStage.PRE_PACK)
object Items : ItemRegistry by MythicalItems.registry {

    // 🟢 Emerald Tools
    val EMERALD_SWORD = item("emerald_sword") {
        behaviors(Tool(), Damageable(), Enchantable())
        maxStackSize(1)
    }
    val EMERALD_AXE = item("emerald_axe") {
        behaviors(Tool(), Damageable(), Enchantable(), Stripping)
        maxStackSize(1)
    }
    val EMERALD_PICKAXE = item("emerald_pickaxe") {
        behaviors(Tool(), Damageable(), Enchantable())
        maxStackSize(1)
    }
    val EMERALD_HOE = item("emerald_hoe") {
        behaviors(Tool(), Damageable(), Enchantable(), Tilling)
        maxStackSize(1)
    }
    val EMERALD_SHOVEL = item("emerald_shovel") {
        behaviors(Tool(), Damageable(), Enchantable(), Flattening, Extinguishing)
        maxStackSize(1)
    }

    // 🟢 Emerald Armor
    val EMERALD_HELMET = item("emerald_helmet") {
        behaviors(Equippable(Equipment.EMERALD, EquipmentSlot.HEAD, equipSound = Sounds.ARMOR_EQUIP_CUSTOMARMORS), Damageable(), Enchantable())
        maxStackSize(1)
    }
    val EMERALD_CHESTPLATE = item("emerald_chestplate") {
        behaviors(Equippable(Equipment.EMERALD, EquipmentSlot.CHEST, equipSound = Sounds.ARMOR_EQUIP_CUSTOMARMORS), Damageable(), Enchantable())
        maxStackSize(1)
    }
    val EMERALD_LEGGINGS = item("emerald_leggings") {
        behaviors(Equippable(Equipment.EMERALD, EquipmentSlot.LEGS, equipSound = Sounds.ARMOR_EQUIP_CUSTOMARMORS), Damageable(), Enchantable())
        maxStackSize(1)
    }
    val EMERALD_BOOTS = item("emerald_boots") {
        behaviors(Equippable(Equipment.EMERALD, EquipmentSlot.FEET, equipSound = Sounds.ARMOR_EQUIP_CUSTOMARMORS), Damageable(), Enchantable())
        maxStackSize(1)
    }

    // 🟠 Copper Tools
    val COPPER_SWORD = item("copper_sword") {
        behaviors(Tool(), Damageable(), Enchantable())
        maxStackSize(1)
    }
    val COPPER_AXE = item("copper_axe") {
        behaviors(Tool(), Damageable(), Enchantable(), Stripping)
        maxStackSize(1)
    }
    val COPPER_PICKAXE = item("copper_pickaxe") {
        behaviors(Tool(), Damageable(), Enchantable())
        maxStackSize(1)
    }
    val COPPER_HOE = item("copper_hoe") {
        behaviors(Tool(), Damageable(), Enchantable(), Tilling)
        maxStackSize(1)
    }
    val COPPER_SHOVEL = item("copper_shovel") {
        behaviors(Tool(), Damageable(), Enchantable(), Flattening, Extinguishing)
        maxStackSize(1)
    }

    // 🟠 Copper Armor
    val COPPER_HELMET = item("copper_helmet") {
        behaviors(Equippable(Equipment.COPPER, EquipmentSlot.HEAD, equipSound = Sounds.ARMOR_EQUIP_CUSTOMARMORS), Damageable(), Enchantable())
        maxStackSize(1)
    }
    val COPPER_CHESTPLATE = item("copper_chestplate") {
        behaviors(Equippable(Equipment.COPPER, EquipmentSlot.CHEST, equipSound = Sounds.ARMOR_EQUIP_CUSTOMARMORS), Damageable(), Enchantable())
        maxStackSize(1)
    }
    val COPPER_LEGGINGS = item("copper_leggings") {
        behaviors(Equippable(Equipment.COPPER, EquipmentSlot.LEGS, equipSound = Sounds.ARMOR_EQUIP_CUSTOMARMORS), Damageable(), Enchantable())
        maxStackSize(1)
    }
    val COPPER_BOOTS = item("copper_boots") {
        behaviors(Equippable(Equipment.COPPER, EquipmentSlot.FEET, equipSound = Sounds.ARMOR_EQUIP_CUSTOMARMORS), Damageable(), Enchantable())
        maxStackSize(1)
    }
}
