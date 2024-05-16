package org.example.lesson_16

class Dice(
    private val result: Int = (1..6).random()
) {
    fun roll() {
        println(result)
    }
}

fun main() {
    val dice = Dice()
    dice.roll()
}