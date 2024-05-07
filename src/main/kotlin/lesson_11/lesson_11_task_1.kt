package org.example.lesson_11

class User(
    val token: String,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val firstUser = User("id1","login1","password1","email1")
    val secondUser = User("id2","login2","password2","email2")

    println(firstUser.token)
    println(firstUser.login)
    println(firstUser.password)
    println(firstUser.email)

    println(secondUser.token)
    println(secondUser.login)
    println(secondUser.password)
    println(secondUser.email)
}