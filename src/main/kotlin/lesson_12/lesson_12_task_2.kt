package org.example.lesson_12

class TemperatureAndPrecipitationForOneDay(
    private var daytimeTemperature: String,
    private var nighttimeTemperature: String,
    private var presenceOfPrecipitation: String,
) {
    fun printInfoForDay() {
        println(daytimeTemperature)
        println(nighttimeTemperature)
        println(presenceOfPrecipitation)
    }
}

fun main() {
    val saturday = TemperatureAndPrecipitationForOneDay("22°C", "14°C", "Осадков нет")
    saturday.printInfoForDay()
}