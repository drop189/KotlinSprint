package org.example.lesson_9

import java.util.*

fun main() {
    val listOfIngredients = mutableSetOf<String>()

    println("Введите 5 ингредиентов")
    for (i in 1..5) {
        println("Введите ингредиент №$i:")
        val userInput = readln()
        listOfIngredients.add(userInput)
    }

    val sortedList = listOfIngredients.sorted().toList().joinToString(", ")
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println("Ваши ингредиенты: $sortedList")
}