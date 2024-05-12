package org.example.lesson_10

fun rollingTheDice(): Int {
    return (1..6).random()
}

fun playRound(): Boolean {
    print("Вы бросаете кости")
    repeat(3) {
        print(".")
        Thread.sleep(1000)
    }
    println()

    val userRollDice = rollingTheDice()
    println("У вас выпало $userRollDice")

    Thread.sleep(750)

    print("Компьютер бросает кости")
    repeat(3) {
        print(".")
        Thread.sleep(1000)
    }
    println()

    val computerRollDice = rollingTheDice()
    println("У компьютера выпало $computerRollDice")

    if (userRollDice > computerRollDice) {
        println("Выиграло человечество")
    } else {
        println("Выиграла машина")
    }

    return userRollDice > computerRollDice
}

fun main() {
    var countOfWins = 0
    var userInputAnswer: String

    do {
        if(playRound()) countOfWins++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        userInputAnswer = readln()
    } while (userInputAnswer.equals("Да", true))

    println("Вы выиграли: $countOfWins раз(а)")
}
