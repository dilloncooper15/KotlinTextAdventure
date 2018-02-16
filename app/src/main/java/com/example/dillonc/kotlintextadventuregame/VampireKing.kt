package com.example.dillonc.kotlintextadventuregame

import java.util.*

/**
 * Created by DillonC on 2/3/2018.
 */
class VampireKing(name: String) : Vampire(name) {
    init {
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        // half the damage of a regular vampire and a quarter of the damage an enemy takes.
        super.takeDamage(damage / 2)
    }

    fun runAway(): Boolean {
        return lives < 2
    }

    fun dodges(): Boolean {
        val rand = Random()
        val chance = rand.nextInt(6)
        if (chance > 3 ) {
            println("Dracula dodges")
            return true
        }
        return false
    }
}