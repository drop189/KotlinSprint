package org.example.lesson_12

const val SCALE_FROM_KELVIN_TO_CELSIUS_IN_INT = 273

class TemperatureAndPrecipitationForDayFromKelvinToCelsius(
    daytimeTemperatureInKelvin: Int,
    nighttimeTemperatureInKelvin: Int,
    presenceOfPrecipitationInKelvin: String,
) {
    private var daytimeTemperatureInCelsius: Int = daytimeTemperatureInKelvin - SCALE_FROM_KELVIN_TO_CELSIUS_IN_INT
    private var nighttimeTemperatureInCelsius: Int = nighttimeTemperatureInKelvin - SCALE_FROM_KELVIN_TO_CELSIUS_IN_INT
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
