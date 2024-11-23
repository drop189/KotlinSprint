package org.example.lesson_5

fun main() {
    println("`Калькулятор топлива`\n" +
            "Для расчета стоимости топлива введите следующие данные\n")

    print("Расстояние поездки (в километрах): ")
    val distance = readln().toFloat()
    print("Расход топлива на 100 км (в литрах): ")
    val fuelConsumption = readln().toFloat()
    print("Текущую цену за литр топлива: ")
    val priceForFuel = readln().toFloat()

    val fuel = (distance * fuelConsumption) / 100
    val totalCost = fuel * priceForFuel

    println("")
    println(
        """Результаты:
        |Общее количество топлива - ${String.format("%.2f", fuel)} литров
        |Итоговая стоимость поездки - ${String.format("%.2f", totalCost)}""".trimMargin()
    )
}