package org.example.lesson_12

class TemperatureAndPrecipitationOfOneDay {
    var daytimeTemperature: String = "0°C"
    var nighttimeTemperature: String = "0°C"
    var presenceOfPrecipitation: String = "Осадков нет"

    fun printInfo() {
        println(daytimeTemperature)
        println(nighttimeTemperature)
        println(presenceOfPrecipitation)
    }
}

fun main() {
    val monday = TemperatureAndPrecipitationOfOneDay()
    monday.daytimeTemperature = "-4°C"
    monday.nighttimeTemperature = "-10°C"
    monday.presenceOfPrecipitation = "Снег"
    monday.printInfo()

    println()

    val sunday = TemperatureAndPrecipitationOfOneDay()
    sunday.daytimeTemperature = "22°C"
    sunday.nighttimeTemperature = "14°C"
    sunday.presenceOfPrecipitation = "Дождь"
    sunday.printInfo()
}