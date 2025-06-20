package com.mythicalitems

import xyz.xenondevs.nova.addon.Addon
import xyz.xenondevs.nova.update.ProjectDistributor

object MythicalItems : Addon() {

    override val projectDistributors = listOf(ProjectDistributor.hangar("mythicalitems/MythicalItems"))

}
