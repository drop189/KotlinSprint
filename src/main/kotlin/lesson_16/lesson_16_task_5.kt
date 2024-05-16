package org.example.lesson_16

class Player(
    val username: String,
    private var healthPoints: Int,
    private var damage: Int,
) {
    private val maxHealth = healthPoints
    private var isAlive = true

    fun getHP() = healthPoints

    fun getDamage(damage: UInt) {
        when (isAlive) {
            true -> {
                if (healthPoints > 0) {
                    println("Получен урон")
                    healthPoints -= damage.toInt()
                    println("Осталось здоровья $healthPoints")
                } else isPlayerDead()
            }

            false -> return
        }
    }

    fun heal(healPoints: Int) {
        if (healthPoints > maxHealth || healthPoints <= 0) return
        else healthPoints += healPoints

        println("Игрок $username использует лечение ")
        println("Осталось здоровья $healthPoints")
    }

    private fun isPlayerDead() {
        if (healthPoints <= 0) death()
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
        player.getDamage(7u)
        player.getDamage(7u)
        player.heal(5)
    }

    println("Игрок ${player.username} отправлен на точку возрождения")

}