package org.example.lesson_7

fun main() {
    println("Введите число:")
    val userInputNumber = readln().toInt()

    for (i in 0..userInputNumber step 2) {
        println("Чётные числа от 0 до $userInputNumber:")
        println(i)
    }

}