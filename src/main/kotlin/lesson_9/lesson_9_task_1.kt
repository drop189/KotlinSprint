package org.example.lesson_9

fun main() {
    val listOfIngredients = listOf("Авокадо", "Хлеб", "Лимон", "Оливковое масло", "Хлопья чили", "Крупная соль")

    println("В рецепте есть следующие ингредиенты: $listOfIngredients")
    for (elements in listOfIngredients) println(elements)
}