package kr.vanilage.main

import org.bukkit.entity.Player

interface Ability {
    fun event(player : Player)
}