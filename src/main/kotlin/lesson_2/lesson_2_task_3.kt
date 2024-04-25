package org.example.lesson_2

const val SECONDS_IN_MINUTE = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    val departureHoursInMinutes = departureHour * SECONDS_IN_MINUTE
    val departureTimeInMinutes = departureMinute + departureHoursInMinutes

    val allTimeInMinutes = travelTimeInMinutes + departureTimeInMinutes

    val arrivalTimeInHours = allTimeInMinutes / SECONDS_IN_MINUTE
    val arrivalTimeInMinutes = allTimeInMinutes % SECONDS_IN_MINUTE

    println("$arrivalTimeInHours:$arrivalTimeInMinutes")

}