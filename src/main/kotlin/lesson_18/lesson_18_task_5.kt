package org.example.lesson_18

class Dot(val x: Number, val y: Number)
class Square(val topLeft: Dot, val topRight: Dot, val bottomLeft: Dot, val bottomRight: Dot)
class Lap(val center: Dot, val edge: Dot)

class Screen {
    fun draw(dot: Dot) {
        println("Dot(x=${dot.x}, y=${dot.y})")
    }

    fun draw(square: Square) {
        "Square" +
                "(topLeft=${square.topLeft}," +
                " topRight=${square.topRight}," +
                " bottomLeft=${square.bottomLeft}," +
                " bottomRight=${square.bottomRight})"
    }

    fun draw(circle: Lap) {
        println("Circle(center=${circle.center}, edge=${circle.edge})")
    }
}