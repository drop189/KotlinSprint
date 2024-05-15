package org.example.lesson_16

class Round(private val radius: Int) {
    private val pi = 3.14

    fun calculateLength() = (2 * pi * radius)

    fun calculateSquare() = (pi * radius * radius)
}

fun main() {
    val circle = Round(5)

    val length = circle.calculateLength()
    val square = circle.calculateSquare()

    println(length)
    println(square)
}