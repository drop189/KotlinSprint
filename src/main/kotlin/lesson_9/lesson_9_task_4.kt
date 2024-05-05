package org.example.lesson_9

fun main() {

    println("Введите 5 ингредиентов перечисленных через “, ” (запятая с пробелом)")
    val listOfIngredients = readln().split(", ", limit = 5)
    val sortedList = listOfIngredients.sorted()
    println(sortedList)

}