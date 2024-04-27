package org.example.lesson_5

fun main() {

    val allowedAccess = "Добро пожаловать!"
    val deniedAccess = "Доступ запрещен."

    val firstSummand = (0..10).random()
    val secondSummand = (0..10).random()
    val rightAnswer = firstSummand + secondSummand

    println(
        "Здравствуйте, вы точно человек? " +
                "Подтвердите это, решив простой пример -\n$firstSummand + $secondSummand = ?"
    )

    val userAnswer = readln().toInt()

    if (userAnswer == rightAnswer) println(allowedAccess)
    else println(deniedAccess)
}