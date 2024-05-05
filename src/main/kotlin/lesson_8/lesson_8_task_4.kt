package org.example.lesson_8

fun main() {
    val arrayOfIngredients =
        arrayOf("Творог", "Яйцо", "Пшеничная мука", "Сахар", "Подсолнечное масло", "Ягоды", "Сметана")

    for (element in arrayOfIngredients) println("${arrayOfIngredients.indexOf(element) + 1}. $element")

    println("Какой ингредиент вы хотите заменить")

    var userInput = readln()

    while (!arrayOfIngredients.contains(userInput)) {
        println("Вы ввели ингредиент, которого нет в списке")
        println("Введите ингредиент из списка, который вы хотите заменить:")
        userInput = readln()
    }

    println("Введите ингредиент который вы хотите добавить:")
    val userInput2 = readln()
    arrayOfIngredients[arrayOfIngredients.indexOf(userInput)] = userInput2

    println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.contentToString()}.")
}