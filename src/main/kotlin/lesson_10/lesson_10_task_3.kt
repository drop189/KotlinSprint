package org.example.lesson_10

fun generatePassword(length: Int): String {
    var password = ""
    val allowedChars = "!\"#\$%&'()*+,-./ "
    val allowedDigits = '0'..'9'

    while (password.length < length) {
        @Suppress("KotlinConstantConditions")
        if (password.length < length) password += allowedDigits.random()
        if (password.length < length) password += allowedChars.random()
    }

    return password
}

fun main() {
    val userInputLength = readln().toInt()
    val userPassword = generatePassword(userInputLength)
    println(userPassword)
}