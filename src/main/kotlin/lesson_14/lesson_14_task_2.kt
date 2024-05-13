package org.example.lesson_14

open class Liner2(
    private val speed: Int = 1000,
    private val loadCapacity: Int = 500,
    val passengers: Int = 12,
) {
    fun engineOn() {
        println("Двигатели запущенны")
    }

    fun engineOff() {
        println("Двигатели отключенны")
    }

    open fun loading(){
        println("Выдвигает горизонтальный трап со шкафута")
    }

    fun printInfo() {
        println("Скорость: $speed")
        println("Грузоподъемность: $loadCapacity")
        println("Пассажиры: $passengers")
    }
}

class Cargo2(
    speed: Int = 700,
    loadCapacity: Int = 1500,
) : Liner2(speed, loadCapacity, passengers = 7){
    override fun loading(){
        println("Активирует погрузочный кран")
    }
}

class Icebreaker2(
    speed: Int = 500,
    loadCapacity: Int = 300,
) : Liner2(speed, loadCapacity, passengers = 5) {

    fun breakIce(){
        println("Ломает лёд")
    }

    override fun loading() {
        println("Открывает ворота со стороны кормы")
    }
}

fun main() {
    val ship1 = Liner2()
    ship1.loading()
    ship1.printInfo()

    val ship2 = Cargo2()
    ship2.loading()
    ship2.printInfo()

    val ship3 = Icebreaker2()
    ship3.loading()
    ship3.printInfo()





}