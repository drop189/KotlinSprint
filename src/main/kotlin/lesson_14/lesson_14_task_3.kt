package org.example.lesson_14

import java.awt.Color
import kotlin.math.PI

abstract class Figure(val color: Color) {

    abstract fun calculateArea(): Int

    abstract fun calculatePerimeter(): Int
}

class Circle(
    private val radius: Int,
    color: Color
) : Figure(color) {

    override fun calculateArea(): Int {
        return ((radius * radius) * PI).toInt()
    }

    override fun calculatePerimeter(): Int {
        return (2 * PI * radius).toInt()
    }
}

class Rectangle(
    private val width: Int,
    private val height: Int,
    color: Color,
) : Figure(color) {
    override fun calculateArea(): Int {
        return height * width
    }

    override fun calculatePerimeter(): Int {
        return (height + width) * 2
    }
}

fun main() {

    val circle1 = Circle(4, Color.black)
    val circle2 = Circle(8, Color.white)
    val circle3 = Circle(7, Color.black)
    val circle4 = Circle(14, Color.white)
    val circle5 = Circle(5, Color.black)

    val rectangle1 = Rectangle(4, 5, Color.black)
    val rectangle2 = Rectangle(6, 4, Color.white)
    val rectangle3 = Rectangle(1, 8, Color.white)
    val rectangle4 = Rectangle(11, 5, Color.white)
    val rectangle5 = Rectangle(1, 1, Color.black)

    val figures =
        listOf(circle1, circle2, circle3, circle4, circle5, rectangle1, rectangle2, rectangle3, rectangle4, rectangle5)

    val sumBlackPerimeter = figures.filter { it.color == Color.black }.sumOf { it.calculatePerimeter() }

    val sumWhiteArea = figures.filter { it.color == Color.white }.sumOf { it.calculatePerimeter() }

    println(sumBlackPerimeter)
    println(sumWhiteArea)
}