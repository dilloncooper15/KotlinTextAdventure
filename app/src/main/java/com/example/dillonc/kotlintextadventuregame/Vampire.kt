package com.example.dillonc.kotlintextadventuregame

/**
 * Created by DillonC on 2/3/2018.
 */
open class Vampire(name: String) : Enemy(name, 20, 3) {
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }
}