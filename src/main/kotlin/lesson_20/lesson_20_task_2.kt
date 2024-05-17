package org.example.lesson_20

class SimplePlayer(
    name: String,
    var healthPoints: Int,
    maxHP: Int,
)

fun main(){
    val player = SimplePlayer("", 45, 80)

    val healthPotionPower = 5

    val healthPotion: (SimplePlayer) -> Unit = { _: SimplePlayer -> player.healthPoints += healthPotionPower}

    println(player.healthPoints)
    healthPotion(player)
    println(player.healthPoints)
}