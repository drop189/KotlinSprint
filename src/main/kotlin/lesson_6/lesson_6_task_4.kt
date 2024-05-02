package org.example.lesson_6

fun main() {
    var numberOfAttempts = 5
    val randomPrizeNumber = (0..9).random()

    println("Давай сыграем в игру!")
    println("Тебе нужно угадать число в промежутке от 1 до 9")
    println("У тебя есть только $numberOfAttempts попыток. Удачи.")

    println("И так это твоя ${6 - numberOfAttempts}-ая попытка:")
    var userInputNumber = readln().toInt()

    while (numberOfAttempts != 1) {
        if (userInputNumber == randomPrizeNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Ухх... Кажется сегодня не твой день")
            println("Попыток осталось: ${--numberOfAttempts}")
            println("И так это твоя ${6 - numberOfAttempts}-ая попытка:")
            userInputNumber = readln().toInt()
        }
    }

    println("Было загадано число $randomPrizeNumber")
}