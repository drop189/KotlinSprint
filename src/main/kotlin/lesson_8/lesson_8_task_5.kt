package org.example.lesson_8

fun main() {
    println("Количество планируемых ингредиентов:")
    val userInput = readln().toInt()

    val userArrayOfIngredients = Array(userInput) {
        println("Введите название для ингредиента ${it + 1}:")
        readln()
    }

    println("Рецепт: ${userArrayOfIngredients.contentToString()}")
}