package org.example.lesson_5

import java.util.*

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Введите год рождения:")

    val userYearOfBirth = readln().toInt()
    val getCalendarInfo = Calendar.getInstance()
    val thisYear = getCalendarInfo[Calendar.YEAR]
    val userAge = thisYear - userYearOfBirth

    if (userAge >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
}