package org.example.lesson_9

import java.util.*

fun main() {
    val setOfIngredients = mutableSetOf<String>()

    println("Введите пять ингредиентов")
    for (i in 1..5) {
        print("Введите ингредиент №$i: ")
        setOfIngredients.add(readln())
    }

    val sortedList = setOfIngredients.sorted().joinToString(", ")
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

    println("Ваши ингредиенты: $sortedList")
}