package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("Финики", "Арахисовая паста", "Орехи", "Шоколад", "Соль")

    println("Введите название ингредиента который хотите найти:")

    val userInput = readln()
    var isContains = false

    for (elements in arrayOfIngredients){
        if (elements == userInput)  isContains = true
    }

    if (isContains) println("Ингредиент $userInput в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}