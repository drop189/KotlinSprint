package org.example.lesson_9

fun main() {
val listOfIngredients = mutableListOf("Вода", "Желатин", "Сахар")

    println("В рецепте есть базовые ингредиенты: $listOfIngredients")
    println("Желаете добавить еще?")
    val userInput = readln()
    if (userInput == "да" || userInput == "Да") println("Какой ингредиент вы хотите добавить?")
    else return

    val userInput2 = readln()
    listOfIngredients.add(userInput2)
    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")

}