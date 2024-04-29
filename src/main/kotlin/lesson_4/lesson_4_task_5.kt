@file:Suppress("KotlinConstantConditions")

package org.example.lesson_4

const val MIN_COMPOSITION_OF_THE_CREW = 55
const val MAX_COMPOSITION_OF_THE_CREW = 70
const val MIN_NUMBER_OF_BOXES_OF_PROVISIONS = 50
const val FAVORABLE_WEATHER_CONDITIONS = true
const val HAS_DAMAGE = true

fun main() {

    println("Имеет ли корабль повреждения?")
    val hasDamage = readln().toBoolean()

    println("Сколько на борту экипажа?")
    val compositionOfTheCrew = readln().toInt()

    println("Сколько на борту ящиков провизии?")
    val numberOfBoxesOfProvisions = readln().toInt()

    println("Благоприятные ли условия погоды?")
    val isFavorableWeatherConditions = readln().toBoolean()

    val longTermSwimmingComparison =
        (hasDamage != HAS_DAMAGE
                && compositionOfTheCrew in (MIN_COMPOSITION_OF_THE_CREW..MAX_COMPOSITION_OF_THE_CREW)
                && numberOfBoxesOfProvisions > MIN_NUMBER_OF_BOXES_OF_PROVISIONS)
                ||
                (hasDamage == HAS_DAMAGE
                        && compositionOfTheCrew == MAX_COMPOSITION_OF_THE_CREW
                        && numberOfBoxesOfProvisions >= MIN_NUMBER_OF_BOXES_OF_PROVISIONS
                        && isFavorableWeatherConditions == FAVORABLE_WEATHER_CONDITIONS)

    println("Дано ли разрешение спустить корабль на воду - $longTermSwimmingComparison")
}