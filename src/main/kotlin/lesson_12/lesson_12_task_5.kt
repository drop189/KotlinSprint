package org.example.lesson_12

const val SCALE_FROM_KELVIN_TO_CELSIUS_IN_INT = 273

class TemperatureAndPrecipitationAdvanced(
    daytimeTemperatureInKelvin: Int,
    nighttimeTemperatureInKelvin: Int,
    isThereAnyPrecipitationRandom: Boolean,
) {
    var daytimeTemperatureInCelsius: Int = daytimeTemperatureInKelvin - SCALE_FROM_KELVIN_TO_CELSIUS_IN_INT

    var nighttimeTemperatureInCelsius: Int = nighttimeTemperatureInKelvin - SCALE_FROM_KELVIN_TO_CELSIUS_IN_INT

    var isThereAnyPrecipitation: Boolean = isThereAnyPrecipitationRandom

}

fun main() {
    val listOfDays: MutableList<TemperatureAndPrecipitationAdvanced> = mutableListOf()
    val listOfDayTemperature: MutableList<Int> = mutableListOf()
    val listOfNightTemperature: MutableList<Int> = mutableListOf()
    val listOfDaysWithPrecipitation: MutableList<Boolean> = mutableListOf()

    for (i in 1..30) {
        val day =
            TemperatureAndPrecipitationAdvanced(
                daytimeTemperatureInKelvin = (173..373).random(),
                nighttimeTemperatureInKelvin = (173..373).random(),
                isThereAnyPrecipitationRandom = (1 < (0..2).random())
            )

        listOfDays.add(day)
        listOfDayTemperature.add(day.daytimeTemperatureInCelsius)
        listOfNightTemperature.add(day.nighttimeTemperatureInCelsius)
        listOfDaysWithPrecipitation.add(day.isThereAnyPrecipitation)
    }
    val averageDayTemperature= listOfDayTemperature.average().toInt()
    val averageNightTemperature= listOfNightTemperature.average().toInt()
    val daysWithPrecipitation = listOfDaysWithPrecipitation.count { it }

    println("Среднее значение температуры днём: $averageDayTemperature°C")
    println("Среднее значение температуры ночью: $averageNightTemperature°C")
    println("Количество дней с осадками: $daysWithPrecipitation")
}