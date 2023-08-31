package kr.vanilage.main

import org.bukkit.Bukkit
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.InventoryHolder

val inv = Bukkit.createInventory(InventoryGenerator(), 54, "§c능력 설정")

class InventoryGenerator : InventoryHolder{
    override fun getInventory(): Inventory {
        return inv
    }
}