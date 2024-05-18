package org.example.lesson_20

class SimplePlayer(
    val name: String,
    var healthPoints: Int,
    val maxHP: Int,
)

fun main() {
    val player = SimplePlayer("Алхимик3000", 45, 80)

    val healthPotionPower = 8

    val healthPotion: (SimplePlayer) -> Unit = { _: SimplePlayer ->
        if (player.healthPoints < player.maxHP) {
            player.healthPoints += healthPotionPower
            println("Игрок ${player.name} использовал зелье лечения")
            if (player.healthPoints > player.maxHP) player.healthPoints = player.maxHP
        } else {
            player.healthPoints = player.maxHP
            println("Достигнуто максимальное значение здоровья")
        }
    }

    println("Здоровье игрока: ${player.healthPoints}")
    healthPotion(player)
    println("Здоровье игрока: ${player.healthPoints}")
    healthPotion(player)
    println("Здоровье игрока: ${player.healthPoints}")
    healthPotion(player)
    println("Здоровье игрока: ${player.healthPoints}")
    healthPotion(player)
    println("Здоровье игрока: ${player.healthPoints}")
    healthPotion(player)
    println("Здоровье игрока: ${player.healthPoints}")
    healthPotion(player)
    println("Здоровье игрока: ${player.healthPoints}")
}