package org.example.lesson_21

class ExtensionPlayer(
    name: String,
    var healthPoints: Int,
    val maxHP: Int,
)

fun ExtensionPlayer.isHealthy(): Boolean {
    return healthPoints == maxHP
}

fun main() {
    val player1 = ExtensionPlayer("Healthy Player", 80, 80)
    val player2 = ExtensionPlayer("Not Healthy Player", 52, 80)

    println(player1.isHealthy())
    println(player2.isHealthy())
}