package org.example.lesson_18

open class Parcel() {
    open fun calculateAreaOfSurface() {
        print("Площадь поверхности посылки: ")
    }
}

class RectangleParcel(private val length: Int, private val width: Int, private val height: Int) : Parcel() {
    override fun calculateAreaOfSurface() {
        super.calculateAreaOfSurface()
        val result = (2 * ((length * width) + (width * height) + (height * length)))
        println("$result")
    }
}

class CubeParcel(private val length: Int) : Parcel() {
    override fun calculateAreaOfSurface() {
        super.calculateAreaOfSurface()
        val result = (6 * length * length)
        println("$result")
    }
}

fun main() {
    val cubeParcel = CubeParcel(4)
    val rectangleParcel = RectangleParcel(3, 4, 5)

    cubeParcel.calculateAreaOfSurface()
    rectangleParcel.calculateAreaOfSurface()
}