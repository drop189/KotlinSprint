package org.example.lesson_12

class TemperatureAndPrecipitationForDayFromKelvinToCelsius(
    daytimeTemperatureInKelvin: Int,
    nighttimeTemperatureInKelvin: Int,
    presenceOfPrecipitationInKelvin: String,
) {
    private var daytimeTemperatureInCelsius: Int = daytimeTemperatureInKelvin - 273
    private var nighttimeTemperatureInCelsius: Int = nighttimeTemperatureInKelvin - 273
    private var presenceOfPrecipitationInCelsius: String = presenceOfPrecipitationInKelvin


    fun printInfoForDay() {
        println("$daytimeTemperatureInCelsius°C")
        println("$nighttimeTemperatureInCelsius°C")
        println(presenceOfPrecipitationInCelsius)
    }
}

fun main() {
    val tuesday = TemperatureAndPrecipitationForDayFromKelvinToCelsius(287, 281, "Дождь")
    tuesday.printInfoForDay()
}
