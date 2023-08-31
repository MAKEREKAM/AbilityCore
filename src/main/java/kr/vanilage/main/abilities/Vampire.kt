package kr.vanilage.main.abilities

import kr.vanilage.main.Ability
import org.bukkit.Color
import org.bukkit.Location
import org.bukkit.Particle
import org.bukkit.entity.Player
import kotlin.math.cos
import kotlin.math.sin

class Vampire : Ability {
    override fun event(player: Player) {
        val health = player.getNearbyEntities(5.0, 5.0, 5.0).size

        if ((player.health + health) > 20) player.health = 20.0
        else player.health += health

        player.damage(0.0)
        var n = 0.0
        while (n < Math.PI * 2) {
            val x = cos(n) * player.boundingBox.widthX
            val z = sin(n) * player.boundingBox.widthZ
            val particleLocation: Location = player.location.clone().add(x, 1.0, z)
            player.world.spawnParticle<Particle.DustOptions>(
                Particle.REDSTONE, particleLocation, 5, Particle.DustOptions(Color.RED, 1f)
            )
            n += Math.PI / 8
        }
    }
}