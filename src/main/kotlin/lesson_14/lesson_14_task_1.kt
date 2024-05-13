package org.example.lesson_14

open class Liner(
    private val speed: Int = 1000,
    private val loadCapacity: Int = 500,
    val passengers: Int = 12,
) {
    fun engineOn() {
        println("Двигатели запущенны")
    }

    fun printInfo() {
        println("Скорость: $speed")
        println("Грузоподъемность: $loadCapacity")
        println("Пассажиры: $passengers")
    }

    fun engineOff() {
        println("Двигатели отключенны")
    }
}

class Cargo(
    speed: Int = 700,
    loadCapacity: Int = 1500,
) : Liner(speed, loadCapacity, passengers = 7)

class Icebreaker(
    speed: Int = 500,
    loadCapacity: Int = 300,
) : Liner(speed, loadCapacity, passengers = 5) {

    fun breakIce(){
        println("Ломает лёд")
    }
}


fun main() {
    val ship1 = Liner()
    ship1.engineOn()
    ship1.engineOff()
    ship1.printInfo()

    val ship2 = Cargo()
    ship2.engineOn()
    ship2.engineOff()
    ship2.printInfo()

    val ship3 = Icebreaker()
    ship3.engineOn()
    ship3.engineOff()
    ship3.breakIce()
    ship3.printInfo()
}