@file:Suppress("KotlinConstantConditions")

package org.example.lesson_4

const val MIN_COMPOSITION_OF_THE_CREW = 55
const val MAX_COMPOSITION_OF_THE_CREW = 70
const val MIN_NUMBER_OF_BOXES_OF_PROVISIONS = 50

fun main() {

    val damageToHull = readln().toBoolean()
    val compositionOfTheCrew = readln().toInt()
    val numberOfBoxesOfProvisions = readln().toInt()
    val favorableWeatherConditions = readln().toBoolean()

    val longTermSwimmingComparison = (!damageToHull
            && compositionOfTheCrew in (MIN_COMPOSITION_OF_THE_CREW..MAX_COMPOSITION_OF_THE_CREW)
            && numberOfBoxesOfProvisions > MIN_NUMBER_OF_BOXES_OF_PROVISIONS)
            ||
            (damageToHull
                    && compositionOfTheCrew == MAX_COMPOSITION_OF_THE_CREW
                    && numberOfBoxesOfProvisions >= MIN_NUMBER_OF_BOXES_OF_PROVISIONS
                    && favorableWeatherConditions)

    println(longTermSwimmingComparison)
}