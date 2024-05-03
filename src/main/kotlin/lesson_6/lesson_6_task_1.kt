package org.example.lesson_6

fun main() {

    println("Вы у нас впервые, добро пожаловать. Для создания аккаунта пройдите процедуру регистрации")

    println("Создайте свой логин:")
    val registerLogin = readln()

    println("Создайте свой пароль")
    val registerPassword = readln()

    println("Вы создали аккаунт. Поздравляю. Для продолжения работы войдите в аккаунт.")

    println("Введите логин")
    var userInputLogin = readln()

    while (registerLogin != userInputLogin) {
        println("Такого пользователя не существует. Введите верный логин:")
        userInputLogin = readln()
    }

    println("Привет, $userInputLogin")

    println("Введите пароль")
    var userInputPassword = readln()

    while (registerPassword != userInputPassword) {
        println("Пароль введен не верно. Попробуйте ещё раз:")
        userInputPassword = readln()
    }

    println("Пароль принят")
    println("Авторизация прошла успешно")
}