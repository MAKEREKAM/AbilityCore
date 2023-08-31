package kr.vanilage.main

import org.bukkit.GameMode
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent

class UseSkillEvent : Listener {
    @EventHandler
    fun onInteract(e : PlayerInteractEvent) {
        if (!e.action.isLeftClick) return
        if (!playerAbility.containsKey(e.player.uniqueId)) return

        val ability = playerAbility[e.player.uniqueId]

        if (wands[ability] != e.player.inventory.itemInMainHand.type) return

        classAbility[ability]?.event(e.player)

        if (e.player.gameMode != GameMode.CREATIVE) e.player.inventory.itemInMainHand.amount--

        e.isCancelled = true
    }
}