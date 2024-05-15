package org.example.lesson_16

class Player(
    val username: String,
    private var healthPoints: Int,
    private var damage: Int,
) {

    fun getHP() = healthPoints

    fun getDamage() {
        println("Получен урон")
        healthPoints -= 7

        if (healthPoints <= 0)  death()

        println("Осталось здоровья $healthPoints")
    }

    fun heal() {
        if (healthPoints <= 0) {
            death()
            return
        } else healthPoints += 5

        println("Игрок $username использует лечение ")
        println("Осталось здоровья $healthPoints")
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
        player.getDamage()
        player.getDamage()
        player.heal()
    }

    println("Игрок ${player.username} отправлен на точку возрождения")

}