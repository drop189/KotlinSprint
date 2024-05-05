package org.example.lesson_8

fun main() {
    println("Количество планируемых ингредиентов:")
    val userInput = readln().toInt()

    val a = Array(userInput) {
        println("Введите название для ингредиента ${it + 1}:")
        readln()
    }

    println("Рецепт: ${a.contentToString()}")
}