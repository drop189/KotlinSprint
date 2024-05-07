package org.example.lesson_9

fun main() {
val listOfIngredients = mutableListOf("Вода", "Желатин", "Сахар")

    println("В рецепте есть базовые ингредиенты: $listOfIngredients")
    println("Желаете добавить еще?")

    if (readln().equals("да", ignoreCase = true)) println("Какой ингредиент вы хотите добавить?")
    else return

    listOfIngredients.add(readln())
    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
}