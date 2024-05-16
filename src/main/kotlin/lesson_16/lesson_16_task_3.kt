package org.example.lesson_16

class User(
    private val login: String,
    private val password: String,
) {
    fun checkPassword(passwordInput: String) = passwordInput == password
}

fun main() {
    val user = User("login", "password")

    val passwordInput1 = user.checkPassword("")
    val passwordInput2 = user.checkPassword("4")
    val passwordInput3 = user.checkPassword("password")
    println(passwordInput1)
    println(passwordInput2)
    println(passwordInput3)
}