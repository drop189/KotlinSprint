package org.example.lesson_2

const val SIXTY = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val timeInMinutes = 457

    val travelTimeInHours = timeInMinutes / SIXTY
    val travelTimeInMinutes = timeInMinutes % SIXTY

    var arrivalTimeInHours = departureHour + travelTimeInHours
    var arrivalTimeInMinutes = departureMinute + travelTimeInMinutes

    if (arrivalTimeInMinutes > 60) {
        arrivalTimeInMinutes -= 60
        arrivalTimeInHours += 1
    }

    println("$arrivalTimeInHours:$arrivalTimeInMinutes")
}