package org.example.lesson_12

const val KELVIN_TO_CELSIUS_CONVERSION_OFFSET = 273

class TemperatureFromKelvinToCelsiusAndPrecipitation(
    daytimeTemperatureInKelvin: Int,
    nighttimeTemperatureInKelvin: Int,
    presenceOfPrecipitationInKelvin: String,
) {
    private var daytimeTemperatureInCelsius: Int = daytimeTemperatureInKelvin - KELVIN_TO_CELSIUS_CONVERSION_OFFSET

    private var nighttimeTemperatureInCelsius: Int = nighttimeTemperatureInKelvin - KELVIN_TO_CELSIUS_CONVERSION_OFFSET

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