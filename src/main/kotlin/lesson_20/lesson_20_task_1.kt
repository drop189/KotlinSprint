package org.example.lesson_20

fun main() {

    val newYearGreeting: (String) -> String = { username ->
        "С наступающим Новым Годом, $username!"
    }

    val username = readln()
    val greetingMessage = newYearGreeting(username)

    println(greetingMessage)
}
