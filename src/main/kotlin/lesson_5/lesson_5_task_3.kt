package org.example.lesson_5

fun main() {
    println("""Приветствую в нашей лотерее ヽ(͡◕ ͜ʖ ͡◕)ﾉ
        |Давайте я вам расскажу о правилах:
        |1. Нужно угадать два числа от 0 до 42
        |2. Если угадать только одно – вы получите утешительный приз
        |3. Числа разные, если введете одно правильное число дважды – вы получите утешительный приз
        |4. В конце розыгрыша вы сможете узнать какие числа нужны были для победы""".trimMargin())
    Thread.sleep(1000)

    val rightFirstNumber = 7
    val rightSecondNumber = 42

    println("Введите первое число:")

    val userFirstChoice = readln().toInt()

    println("Введите второе число:")

    val userSecondChoice = readln().toInt()

    if (
        ((userFirstChoice == rightFirstNumber || userFirstChoice == rightSecondNumber) && userFirstChoice != userSecondChoice)
        &&
        (userSecondChoice == rightFirstNumber || userSecondChoice == rightSecondNumber)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (
        ((userFirstChoice == rightFirstNumber || userFirstChoice == rightSecondNumber) && userFirstChoice != userSecondChoice)
        ||
        (userSecondChoice == rightFirstNumber || userSecondChoice == rightSecondNumber)
    ) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")

    println("Для победы нужны были числа $rightFirstNumber и $rightSecondNumber")
}









