package org.example.lesson_4

const val FAVORABLE_SUN_WEATHER = true
const val FAVORABLE_OUTDOOR_AWNING = true
const val FAVORABLE_AIR_HUMIDITY = 20
const val NON_FAVORABLE_CURRENT_SEASON = "зима"

@Suppress("KotlinConstantConditions")
fun main() {

    val sunWeather = true
    val outdoorAwning = true
    val airHumidity = 20
    val currentSeason = "зима"


    val analysisOfConditions =
                    (FAVORABLE_SUN_WEATHER == sunWeather)
                &&  (FAVORABLE_OUTDOOR_AWNING == outdoorAwning)
                &&  (FAVORABLE_AIR_HUMIDITY == airHumidity)
                &&  (NON_FAVORABLE_CURRENT_SEASON != currentSeason)

    println("Благоприятные ли условия сейчас для роста бобовых? $analysisOfConditions")
}