package kr.vanilage.main

import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

val playerAbility : HashMap<UUID, SkillList> = HashMap()
val wands : HashMap<SkillList, Material> = HashMap()
val classAbility : HashMap<SkillList, Ability> = HashMap()
val itemAbility : HashMap<ItemStack, SkillList> = HashMap()
val coolAbility : HashMap<SkillList, Int> = HashMap()

fun register(name : SkillList, displayName : String, lore : String, wand : Material, eventListener : Ability, cool : Int) {
    val item = ItemStack(wand)
    val meta = item.itemMeta
    meta.setDisplayName(displayName)
    val loreList : ArrayList<String> = ArrayList()
    loreList.add(lore)
    meta.lore = loreList
    item.itemMeta = meta

    wands[name] = wand
    classAbility[name] = eventListener
    itemAbility[item] = name
    coolAbility[name] = cool
    inv.addItem(item)
}