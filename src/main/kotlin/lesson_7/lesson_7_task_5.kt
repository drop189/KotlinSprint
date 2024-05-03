package org.example.lesson_7

const val MIN_LENGTH = 6

fun main() {
    println("Введите длину пароля (минимум 6 символов):")
    var userInputLength = readln().toInt()

    while (userInputLength < MIN_LENGTH) {
        println("Некорректная длина пароля. Пожалуйста, введите значение не меньше $MIN_LENGTH.")
        userInputLength = readln().toInt()
    }

    val allowedUpperCaseLetters = 'A'..'Z'
    val allowedLowerCaseLetters = 'a'..'z'
    val allowedNumbers = '0'..'9'
    val allAllowedChars = allowedUpperCaseLetters + allowedLowerCaseLetters + allowedNumbers

    var password = ""

    password += allowedUpperCaseLetters.random()
    password += allowedLowerCaseLetters.random()
    password += allowedNumbers.random()

    for (i in 1..userInputLength - 3) {
        password += allAllowedChars.random()
    }

    password = password.toList().shuffled().joinToString("")

    println("Сгенерированный пароль: $password")
}