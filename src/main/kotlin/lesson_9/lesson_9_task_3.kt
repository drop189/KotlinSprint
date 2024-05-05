package org.example.lesson_9

fun main() {
    val listNumberOfIngredientsForOneDish = mutableListOf(2, 50, 15)

    println("Количество порций:")
    val userInputNumbersOfDishes = readln().toInt()

    listNumberOfIngredientsForOneDish[0] = listNumberOfIngredientsForOneDish[0] * userInputNumbersOfDishes
    listNumberOfIngredientsForOneDish[1] = listNumberOfIngredientsForOneDish[1] * userInputNumbersOfDishes
    listNumberOfIngredientsForOneDish[2] = listNumberOfIngredientsForOneDish[2] * userInputNumbersOfDishes

    println(
        "На $userInputNumbersOfDishes порций вам понадобится: " +
                "Яиц – ${listNumberOfIngredientsForOneDish[0]}шт., " +
                "Молока – ${listNumberOfIngredientsForOneDish[1]}мл, " +
                "Сливочного масла – ${listNumberOfIngredientsForOneDish[2]}гр."
    )
}