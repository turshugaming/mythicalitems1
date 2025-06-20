package com.mythicalitems.registry

import com.mythicalitems.MythicalItems
import xyz.xenondevs.nova.addon.registry.EquipmentRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.resources.builder.layout.equipment.InterpolationMode
import java.awt.Color

@Init(stage = InitStage.PRE_PACK)
object Equipment : EquipmentRegistry by MythicalItems.registry {

    val EXAMPLE = animatedEquipment("example") {
        humanoid {
            layer {
                texture(5, InterpolationMode.NONE, "frame_1", "frame_2", "frame_3")
            }
        }

        /* ... */
    }

    // Amber Setleri
    val EMERALD = equipment("emerald") {
        humanoid {
            layer {
                texture("emerald")
                dyeable(Color.WHITE)
            }
        }
        humanoidLeggings {
            layer {
                texture("emerald")
            }
        }
    }

    //Copper Setleri
    val COPPER = equipment("copper") {
        humanoid {
            layer {
                texture("copper")
                dyeable(Color.WHITE)
            }
        }
        humanoidLeggings {
            layer {
                texture("copper")
            }
        }
    }
}