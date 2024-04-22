package org.example.lesson_2

const val SIXTY = 60
fun main() {
    val departureHour = 9
    val departureMinute = 39
    val timeInMinutes = 437

    val travelTimeInHours = timeInMinutes / SIXTY
    val travelTimeInMinutes = timeInMinutes % SIXTY

    val arrivalTimeInHours = departureHour + travelTimeInHours
    val arrivalTimeInMinutes = departureMinute + travelTimeInMinutes

    println("$arrivalTimeInHours:$arrivalTimeInMinutes")
}