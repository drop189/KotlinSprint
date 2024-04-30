package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val rightAnswers = List(3) { Random.nextInt(43) }

    println("Лотерея. Введите три числа")

    val userAnswers = List(3) {
        println("Введите ${it + 1}-е число")
        readln().toInt()
    }

    val numberOfCorrectAnswers = rightAnswers.intersect(userAnswers.toSet()).size

    val prizeMessage = when (numberOfCorrectAnswers) {
        3 -> "Вы угадали все числа. Поздравляю, вы выиграли джекпот!!!"
        2 -> "Вы угадали два числа. Поздравляю, вы выиграли крупный приз!!"
        1 -> "Вы угадали одно число. Поздравляю, вы выиграли утешительный приз!"
        else -> "Вы не угадали ни одного числа. Не отчаивайтесь, попробуйте ещё раз."
    }

    println(prizeMessage)
    println("Правильные числа: ${rightAnswers.joinToString()}")
}