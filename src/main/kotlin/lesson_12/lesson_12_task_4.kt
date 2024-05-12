package org.example.lesson_12

const val SCALE_FROM_KELVIN_TO_CELSIUS_IN_INT = 273

class TemperatureFromKelvinToCelsiusAndPrecipitation(
    daytimeTemperatureInKelvin: Int,
    nighttimeTemperatureInKelvin: Int,
    presenceOfPrecipitationInKelvin: String,
) {
    private var daytimeTemperatureInCelsius: Int = daytimeTemperatureInKelvin - SCALE_FROM_KELVIN_TO_CELSIUS_IN_INT

    private var nighttimeTemperatureInCelsius: Int = nighttimeTemperatureInKelvin - SCALE_FROM_KELVIN_TO_CELSIUS_IN_INT

    private var presenceOfPrecipitationInCelsius: String = presenceOfPrecipitationInKelvin

    init {
        println("$daytimeTemperatureInCelsius°C")
        println("$nighttimeTemperatureInCelsius°C")
        println(presenceOfPrecipitationInCelsius)
    }
}

fun main() {
    val tuesday = TemperatureFromKelvinToCelsiusAndPrecipitation(274, 271, "Град")
}