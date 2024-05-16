package org.example.lesson_17

import org.example.lesson_10.LOGIN

class TheUser(
    login: String,
    password: String,
) {
    var login = login
        set(value) {
            field = value
            println("Логин успешно изменён")
        }

    var password = password
        get() = field.map { '*' }.joinToString("")
        set(value) = println("Вы не можете изменить пароль")
}

fun main() {
    val user = TheUser("Tor", "123456789")

    println(user.login)
    println(user.password)

    user.login = LOGIN
    user.password = "987654321123456789"

    println(user.login)
    println(user.password)
}