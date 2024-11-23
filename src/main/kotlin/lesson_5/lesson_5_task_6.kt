package org.example.lesson_5

import kotlin.math.pow

private const val CENTIMETERS_IN_METERS = 100

fun main() {
    println("Калькулятор ИМТ")
    println("Чтобы произвести расчёты, нам необходимо знать ваш вес в килограммах и ваш рост в сантиметрах.")
    print("Введите ваш вес(кг): ")
    val userWeight = readln().toFloatOrNull() ?: -1F
    print("Введите ваш рост(см): ")
    val userHeight = readln().toFloatOrNull() ?: -1F

    val userHeightMeters = userHeight / CENTIMETERS_IN_METERS
    val indexIMT = userWeight / userHeightMeters.pow(2)

    val category: String
    when {
        indexIMT.isNaN() || indexIMT == Float.POSITIVE_INFINITY || indexIMT < 0 -> {
            println("Были введены не реалистичные данные, программа вынуждена завершить работу.")
            return
        }

        indexIMT < 18.5 -> {
            category = "Недостаточная масса тела"
            println("- ИМТ < 18.5: $category")
        }

        indexIMT >= 18.5 && indexIMT < 25 -> {
            category = "Нормальная масса тела"
            println("- 18.5 ≤ ИМТ < 25: $category")
        }

        indexIMT >= 25 && indexIMT < 30 -> {
            category = "Избыточная масса тела"
            println("- 25 ≤ ИМТ < 30: $category")
        }

        indexIMT >= 30 -> {
            category = "Ожирение"
            println("- ИМТ ≥ 30: $category")
        }

        else -> {
            println("Ошибка, завершение работы.")
            return
        }
    }

    println("Результаты:")
    println("ИМТ - ${String.format("%.2f", indexIMT)}, $category")
}