package org.example.lesson_12

const val KELVIN_CELSIUS_CONVERSION_OFFSET = 273

class TemperatureAndPrecipitationAdvanced(
    daytimeTemperatureInKelvin: Int,
    nighttimeTemperatureInKelvin: Int,
    isThereAnyPrecipitationRandom: Boolean,
) {
    var daytimeTemperatureInCelsius: Int = daytimeTemperatureInKelvin - KELVIN_CELSIUS_CONVERSION_OFFSET

    var nighttimeTemperatureInCelsius: Int = nighttimeTemperatureInKelvin - KELVIN_CELSIUS_CONVERSION_OFFSET

    var isThereAnyPrecipitation: Boolean = isThereAnyPrecipitationRandom

}

fun main() {
    val listOfDays: MutableList<TemperatureAndPrecipitationAdvanced> = mutableListOf()

    for (i in 1..30) {
        val daytimeTemperatureK = (173..373).random()
        val nighttimeTemperatureK = (173..373).random()
        val isThereAnyPrecipitation = (1 < (0..2).random())

        val day = TemperatureAndPrecipitationAdvanced(
            daytimeTemperatureInKelvin = daytimeTemperatureK,
            nighttimeTemperatureInKelvin = nighttimeTemperatureK,
            isThereAnyPrecipitationRandom = isThereAnyPrecipitation
        )

        listOfDays.add(day)
    }

    val dayTemperatures = listOfDays.map { it.daytimeTemperatureInCelsius }
    val nightTemperatures = listOfDays.map { it.nighttimeTemperatureInCelsius }
    val daysWithPrecipitation = listOfDays.filter { it.isThereAnyPrecipitation }

    val averageDayTemperature = dayTemperatures.average().toInt()
    val averageNightTemperature = nightTemperatures.average().toInt()

    println("Среднее значение дневной температуры: $averageDayTemperature°C")
    println("Среднее значение ночной температуры: $averageNightTemperature°C")
    println("Количество дней с осадками: ${daysWithPrecipitation.size}")
}