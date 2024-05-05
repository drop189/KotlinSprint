package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("Финики", "Арахисовая паста", "Орехи", "Шоколад", "Соль")

    println("Введите название ингредиента который хотите найти:")

    val userInput = readln()

    if (arrayOfIngredients.contains(userInput)) println("Ингредиент $userInput в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}