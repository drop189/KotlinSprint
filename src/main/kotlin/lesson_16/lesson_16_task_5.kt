package org.example.lesson_16

class Player(
    val username: String,
    private var healthPoints: Int,
    private var damage: Int,
) {
    private val maxHealth = healthPoints

    fun getHP() = healthPoints

    fun getDamage(damage: Int) {
        println("Получен урон")
        healthPoints -= damage

        isPlayerDead()

        println("Осталось здоровья $healthPoints")
    }

    fun heal(healPoints: Int) {
        healthPoints += if (healthPoints > maxHealth || healthPoints <= 0) {
            0
            return
        }
        else healPoints

        println("Игрок $username использует лечение ")
        println("Осталось здоровья $healthPoints")
    }

    private fun isPlayerDead(){
        if (healthPoints <= 0) death()
    }

    private fun death() {
        healthPoints = 0
        damage = 0
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