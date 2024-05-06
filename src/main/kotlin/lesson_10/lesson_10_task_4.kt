package org.example.lesson_10

fun rollTheDice(): Int {
    return (1..6).random()
}

fun playRound(): Boolean {
    print("Вы бросаете кости")
    repeat(3) {
        print(".")
        Thread.sleep(1000)
    }
    println()

    val userRollDice = rollTheDice()
    println("У вас выпало $userRollDice")

    Thread.sleep(750)

    print("Компьютер бросает кости")
    repeat(3) {
        print(".")
        Thread.sleep(1000)
    }
    println()

    val computerRollDice = rollTheDice()
    println("У компьютера выпало $computerRollDice")

    return userRollDice > computerRollDice
}

fun main() {

    var countOfWins = 0

    if (playRound()) {
        println("Выиграло человечество")
        countOfWins++
    } else println("Выиграла машина")

    println("Хотите бросить кости еще раз? Введите Да или Нет")
    var userInputAnswer = readln()

    while (true) {
        if (userInputAnswer == "Да") {
            if (playRound()) {
                println("Выиграло человечество")
                countOfWins++
            } else println("Выиграла машина")
        } else if (userInputAnswer == "Нет") {
            println("Вы выиграли: $countOfWins раз")
            return
        } else println("Неправильный ввод!")

        println("Хотите бросить кости еще раз? Введите Да или Нет")
        userInputAnswer = readln()
    }

}
