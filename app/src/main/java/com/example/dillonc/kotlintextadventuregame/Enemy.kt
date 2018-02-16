package com.example.dillonc.kotlintextadventuregame

/**
 * Created by DillonC on 2/3/2018.
 */
open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {
    // Marked as Open so we can inherit from the Enemy class.

    open fun takeDamage(damage: Int) {
        val remainingHitPoints = hitPoints - damage
        if (remainingHitPoints > 0) {
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage and has $hitPoints left.")
        } else {
            lives -= 1
            if (lives > 0) {
                println("$name lost a life!")
            } else {
                println("No lives left, $name is dead!")
            }
        }
    }

    override fun toString(): String {
        return "Name: $name, Hit Points: $hitPoints, Lives: $lives"
    }

}