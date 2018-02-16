package com.example.dillonc.kotlintextadventuregame

/**
 * Created by DillonC on 2/3/2018.
 */
enum class LootType {
    POTION, RING, ARMOR
}

class Loot(val name: String, val type: LootType, val value: Double) {
    override fun toString(): String {
        return "'$name', is of Type '$type', and has a Value of '$value'."
    }

}