package org.example.lesson_7

fun main() {
    println("Для продолжения работы введите код из смс")
    var code = (1000..9999).random()
    println("Ваш код авторизации: $code")

    println("Введите получные цифры:")
    var userInput = readln().toInt()

    while (code != userInput) {
        println("Код введен не верно!")
        println("Код отправлен повторно:")
        code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        println("Введите получные цифры:")
        userInput = readln().toInt()
    }

    println("Добро пожаловать")
}