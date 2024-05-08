package org.example.lesson_10

const val MIN_LENGTH_OF_INPUT = 4

fun checkTheLength(length: Int): Boolean {
    return length >= MIN_LENGTH_OF_INPUT
}

fun main() {
    print("Введите логин: ")
    val userInputLogin = readln()

    print("Введите пароль: ")
    val userInputPassword = readln()

    if (checkTheLength(userInputLogin.length) && checkTheLength(userInputPassword.length)) {
        println("Добро пожаловать, $userInputLogin!")
    }
    else println("Логин или пароль недостаточно длинные")
}
