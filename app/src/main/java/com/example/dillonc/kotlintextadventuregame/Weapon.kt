package com.example.dillonc.kotlintextadventuregame

/**
 * Created by DillonC on 2/3/2018.
 */
class Weapon(val name: String, var damageInflicted: Int) {
    override fun toString(): String {
        return "$name inflicts $damageInflicted damage."
    }

}