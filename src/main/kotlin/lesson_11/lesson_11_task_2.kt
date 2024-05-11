package org.example.lesson_11

class User2(
    private val token: String,
    private val login: String,
    private var password: String,
    private val email: String,
    private var bio: String = "",
) {

    fun printUserInfo() {
        println("id = $token")
        println("login = $login")
        println("password = $password")
        println("email = $email")
        println("bio = $bio")
    }

    fun addBio() {
        println("Расскажите о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите старый пароль")

        var userInput: String = readln()

        while (userInput != password) {
            println("Пароль неверный")
            println("Повторите попытку")
            userInput = readln()
        }

        println("Введите новый пароль")
        password = readln()
        println("Пароль изменен")
    }
}

fun main() {
    val user = User2("id1", "login1", "password1", "email1")
    user.addBio()
    user.changePassword()
    user.printUserInfo()
}