package org.example.lesson_16

import kotlin.math.abs

class Player(
    val username: String,
    private var healthPoints: Int,
    private var damage: Int,
) {
    private val maxHealth = healthPoints
    private var isAlive = true

    fun getHP() = healthPoints

    fun getDamage(damage: Int) {
        when (isAlive) {
            true -> {
                println("Получен урон")
                healthPoints -= abs(damage)

                if (healthPoints > 0) {
                    println("Осталось здоровья $healthPoints")
                } else isAlive = false
            }

            false -> isPlayerDead()
        }
    }

    fun heal(healPoints: Int) {
        if (healthPoints > maxHealth || healthPoints <= 0) return
        else healthPoints += healPoints

        println("Игрок $username использует лечение ")
        println("Осталось здоровья $healthPoints")
    }

     private fun isPlayerDead() {
        if (!isAlive) death()
    }

    private fun death() {
        healthPoints = 0
        damage = 0
        isAlive = false
    }

}

fun main() {

    val player = Player("NooBMasteR228", 80, 14)

    println("Игрок ${player.username} вступает в бой с Противник Слизень")

    while (player.getHP() > 0) {
        player.getDamage(7)
        player.getDamage(7)
        player.heal(5)
    }

    println("Игрок ${player.username} отправлен на точку возрождения")

}