package org.example.lesson_16

import kotlin.math.pow

class Round(private val radius: Double) {

    fun calculateLength() = (2 * PI * radius)

    fun calculateSquare() = (PI * radius.pow(2))

    companion object {
        private const val PI = 3.14
    }
}

fun main() {
    val circle = Round(5.5)

    val length = circle.calculateLength()
    val square = circle.calculateSquare()

    println("Длина окружности: $length")
    println("Площадь круга: $square")
}