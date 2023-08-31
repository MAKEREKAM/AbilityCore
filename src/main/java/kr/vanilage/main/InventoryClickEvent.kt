package kr.vanilage.main

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent

class InventoryClickEvent : Listener {
    @EventHandler
    fun onClickInventory(e : InventoryClickEvent) {
        if (!e.view.title.contains("§c능력 설정")) return

        if (itemAbility.containsKey(e.currentItem)) {
            e.isCancelled = true

            playerAbility[e.whoClicked.uniqueId] = itemAbility[e.currentItem]!!
        }
    }
}