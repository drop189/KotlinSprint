package org.example.lesson_14

open class Liner2(
    private val speed: Int = 1000,
    private val loadCapacity: Int = 500,
    val passengers: Int = 12,
) {
    fun turnOnTheEngine() {
        println("Двигатели запущенны")
    }

    fun turnOffTheEngine() {
        println("Двигатели отключенны")
    }

    open fun uploadTo(){
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
    override fun uploadTo(){
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

    override fun uploadTo() {
        println("Открывает ворота со стороны кормы")
    }
}

fun main() {
    val ship1 = Liner2()
    ship1.uploadTo()
    ship1.printInfo()

    val ship2 = Cargo2()
    ship2.uploadTo()
    ship2.printInfo()

    val ship3 = Icebreaker2()
    ship3.uploadTo()
    ship3.printInfo()
}