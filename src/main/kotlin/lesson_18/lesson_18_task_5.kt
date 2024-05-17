package org.example.lesson_18

class Dot(val x: Number, val y: Number)
class Square(val topLeft: Dot, val topRight: Dot, val bottomLeft: Dot, val bottomRight: Dot)
class Lap(val center: Dot, val edge: Dot)

class Screen {
    fun draw(dot: Dot) {
        println("Dot[x=${dot.x}, y=${dot.y}]")
    }

    fun draw(square: Square) {
        println(
            "Square" +
                    "(topLeft=[x=${square.topLeft.x},y=${square.topLeft.y}]," +
                    " topRight=[x=${square.topRight.x},y=${square.topRight.y}]," +
                    " bottomLeft=[x=${square.bottomLeft.x},y=${square.bottomLeft.y}]," +
                    " bottomRight=[x=${square.bottomRight.x},y=${square.bottomRight.y}])"
        )
    }

    fun draw(circle: Lap) {
        println(
            "Circle(center=[x=${circle.center.x},y=${circle.center.y}], edge=[x=${circle.edge.x},y=${circle.edge.y}])"
        )
    }
}

fun main() {
    val screen = Screen()

    val dot = Dot(10, 20)
    screen.draw(dot)

    val square = Square(
        Dot(0, 10),
        Dot(10, 10),
        Dot(0, 0),
        Dot(10, 0)
    )
    screen.draw(square)

    val circle = Lap(
        Dot(5, 5),
        Dot(10, 5)
    )
    screen.draw(circle)
}
