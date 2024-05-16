package org.example.lesson_20

class SimplePlayer(
    name: String,
    var healthPoints: Int,
    maxHP: Int,
)

fun main(){
    val player = SimplePlayer("", 45, 80);

    val healthPotion: (SimplePlayer) -> Unit = { _: SimplePlayer -> player.healthPoints += 5}

    println(player.healthPoints)
    healthPotion(player)
    println(player.healthPoints)
}