package org.example.lesson_7

fun main() {
    val allowedChars = "abcdefghijklmnopqrstuvwxyz1234567890"
    val length = 6
    val password = (1..length)
        .map { allowedChars.random() }
        .joinToString("")

    println(password)
}