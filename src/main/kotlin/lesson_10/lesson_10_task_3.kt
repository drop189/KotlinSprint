package org.example.lesson_10

fun generatePassword(length: Int): String {
    var password = ""
    val allowedChars = ' '..'/'
    val allowedDigits = '0'..'9'

    while (password.length < length) {
        password += if (password.length % 2 == 0) allowedChars.random()
        else allowedDigits.random()
    }
    return password
}

fun main() {
    val userInputLength = readln().toInt()
    val userPassword = generatePassword(userInputLength)
    println(userPassword)
}