package org.example.lesson_10

const val LOGIN = "drop189"
const val PASSWORD = "HeartOfGold42"

fun main() {
    contentsOfTheShoppingCart(authorization())
}

fun authorization(): String? {
    println("Введите логин")
    val userInputLogin = readln()

    println("Введите пароль")
    val userInputPassword = readln()

    val allChars = ('0'..'9') + ('A'..'Z') + ('a'..'z')

    var token = ""
    repeat(32) {
        token += allChars.random()
    }

    return if (userInputLogin == LOGIN && userInputPassword == PASSWORD) token
    else null
}

fun contentsOfTheShoppingCart(input: String?) {
    val shoppingCart = listOf(
        "микроволновая печь", "тостер",
        "электроплита", "духовка электрическая", "мясорубка электрическая",
        "телевизор", "электрический чайник", "кофеварка", "кофемолка", "миксер", "блендер"
    )

    if (input == null) println("Неверный логин или пароль")
    else println(shoppingCart)
}