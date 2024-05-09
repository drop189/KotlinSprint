package org.example.lesson_9

fun main() {
    val listNumberOfIngredientsForOneDish = listOf(2, 50, 15)

    println("Количество порций:")
    val userInputNumbersOfDishes = readln().toInt()

    val indexZero = 0
    val indexOne = 1
    val indexTwo = 2

    val updatedListOfIngredients = listNumberOfIngredientsForOneDish.map {
        it * userInputNumbersOfDishes
    }

    println(
        "На $userInputNumbersOfDishes порций вам понадобится: " +
                "Яиц – ${updatedListOfIngredients[indexZero]}шт., " +
                "Молока – ${updatedListOfIngredients[indexOne]}мл, " +
                "Сливочного масла – ${updatedListOfIngredients[indexTwo]}гр."
    )
}