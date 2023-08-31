package kr.vanilage.main

import kr.vanilage.main.abilities.Vampire
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        logger.info("Hello, AbilityCore!")

        Bukkit.getPluginManager().registerEvents(InventoryClickEvent(), this)
        Bukkit.getPluginManager().registerEvents(UseSkillEvent(), this)

        Bukkit.getPluginCommand("abilitycore")?.setExecutor(Cmd())
        Bukkit.getPluginCommand("ac")?.setExecutor(Cmd())

        register(SkillList.VAMPIRE, "§c뱀파이어", "§a근처에 있는 엔티티의 수만큼 회복합니다.", Material.REDSTONE_BLOCK, Vampire())
    }
}