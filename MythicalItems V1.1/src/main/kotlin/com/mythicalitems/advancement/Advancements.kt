    @file:Suppress("unused")

    package com.mythicalitems.advancement

    import net.kyori.adventure.text.Component
    import net.minecraft.advancements.AdvancementType
    import net.minecraft.advancements.DisplayInfo
    import net.minecraft.advancements.critereon.PlayerTrigger
    import net.minecraft.core.ClientAsset
    import net.minecraft.resources.ResourceLocation
    import xyz.xenondevs.nova.initialize.Init
    import xyz.xenondevs.nova.initialize.InitFun
    import xyz.xenondevs.nova.initialize.InitStage
    import xyz.xenondevs.nova.util.advancement.AdvancementLoader
    import xyz.xenondevs.nova.util.advancement.advancement
    import xyz.xenondevs.nova.util.advancement.obtainNovaItemsAdvancement
    import xyz.xenondevs.nova.util.component.adventure.toNMSComponent
    import xyz.xenondevs.nova.util.unwrap

    import com.mythicalitems.MythicalItems
    import com.mythicalitems.registry.Items
    import java.util.*

    private val ROOT = advancement(MythicalItems, "root") {
        display(DisplayInfo(
            Items.EMERALD_SWORD.clientsideProvider.get().unwrap(),
            Component.translatable("advancement.mythicalitems.root.title").toNMSComponent(),
            Component.translatable("advancement.mythicalitems.root.description").toNMSComponent(),
            Optional.of(ClientAsset(ResourceLocation.withDefaultNamespace("block/emerald_block"))),
            AdvancementType.TASK,
            false, false, false
        ))

        addCriterion("tick", PlayerTrigger.TriggerInstance.tick())
    }

    // 🟢 Emerald Tool Advancements
    private val OBTAIN_ANY_EMERALD_TOOL = obtainNovaItemsAdvancement(
        MythicalItems, "any_emerald_tool", ROOT, listOf(
            Items.EMERALD_PICKAXE, Items.EMERALD_HOE, Items.EMERALD_AXE,
            Items.EMERALD_SWORD, Items.EMERALD_SHOVEL
        ), false
    )

    private val OBTAIN_ALL_EMERALD_TOOLS = obtainNovaItemsAdvancement(
        MythicalItems, "all_emerald_tools", OBTAIN_ANY_EMERALD_TOOL, listOf(
            Items.EMERALD_PICKAXE, Items.EMERALD_HOE, Items.EMERALD_AXE,
            Items.EMERALD_SWORD, Items.EMERALD_SHOVEL
        ), true
    )

    // 🟢 Emerald Armor Advancements
    private val OBTAIN_ANY_EMERALD_ARMOR = obtainNovaItemsAdvancement(
        MythicalItems, "any_emerald_armor", ROOT, listOf(
            Items.EMERALD_HELMET, Items.EMERALD_CHESTPLATE,
            Items.EMERALD_LEGGINGS, Items.EMERALD_BOOTS
        ), false
    )

    private val OBTAIN_ALL_EMERALD_ARMOR = obtainNovaItemsAdvancement(
        MythicalItems, "all_emerald_armor", OBTAIN_ANY_EMERALD_ARMOR, listOf(
            Items.EMERALD_HELMET, Items.EMERALD_CHESTPLATE,
            Items.EMERALD_LEGGINGS, Items.EMERALD_BOOTS
        ), true
    )

    @Init(stage = InitStage.POST_WORLD)
    object Advancements {

        @InitFun
        fun register() {
            AdvancementLoader.registerAdvancements(
                ROOT,
                OBTAIN_ANY_EMERALD_TOOL,
                OBTAIN_ALL_EMERALD_TOOLS,
                OBTAIN_ANY_EMERALD_ARMOR,
                OBTAIN_ALL_EMERALD_ARMOR
            )
        }
    }
