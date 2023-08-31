package kr.vanilage.main.abilities

import kr.vanilage.main.Ability
import org.bukkit.entity.Player

class Vampire : Ability {
    override fun event(player: Player) {
        player.sendMessage("Hello")
    }
}