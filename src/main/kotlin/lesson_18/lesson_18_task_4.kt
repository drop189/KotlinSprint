package org.example.lesson_18

import kotlin.math.pow

open class Parcel() {
    open fun calculateAreaOfSurface(): Double {

        return 0.0
    }
}

class RectangleParcel(private val length: Double, private val width: Double, private val height: Double) : Parcel() {
    override fun calculateAreaOfSurface(): Double {

        val result = (2 * ((length * width) + (width * height) + (height * length)))
        return result
    }
}

class CubeParcel(private val length: Double) : Parcel() {
    override fun calculateAreaOfSurface(): Double {

        val result = (6 * length.pow(2))
        return result
    }
}

fun main() {
    val cubeParcel = CubeParcel(4.5)
    val rectangleParcel = RectangleParcel(3.5, 4.5, 5.5)

    print("Площадь поверхности посылки: ")
    println(cubeParcel.calculateAreaOfSurface())
    print("Площадь поверхности посылки: ")
    println(rectangleParcel.calculateAreaOfSurface())
}