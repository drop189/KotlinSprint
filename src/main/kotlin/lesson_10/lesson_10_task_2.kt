package org.example.lesson_10

fun isLengthLongEnough(length1: Int, length2: Int): Boolean {
    return length1 >= 4 && length2 >= 4
}

fun main() {
    print("Введите логин: ")
    val userInputLogin = readln()

    print("Введите пароль: ")
    val userInputPassword = readln()

    if (isLengthLongEnough(userInputLogin.length, userInputPassword.length)) {
        println("Добро пожаловать, $userInputLogin!")
    }
    else println("Логин или пароль недостаточно длинные")
}
