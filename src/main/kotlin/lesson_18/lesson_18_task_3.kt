package org.example.lesson_18

open class Tamagotchi(open val name: String) {
    open fun printFoodInfo() {
        print("[$name] -> ") // [действие]
    }
}

class Fox(override val name: String, private val food: String = "Ягоды") : Tamagotchi("") {
    override fun printFoodInfo() {
        super.printFoodInfo()
        println("[$food]")
    }
}

class Dog(override val name: String, private val food: String = "Кости") : Tamagotchi("") {
    override fun printFoodInfo() {
        super.printFoodInfo()
        println("[$food]")
    }
}

class Cat(override val name: String, private val food: String = "Рыба") : Tamagotchi("") {
    override fun printFoodInfo() {
        super.printFoodInfo()
        println("[$food]")
    }
}

fun main() {
    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val list: List<Tamagotchi> = listOf(fox, dog, cat)

    for (element in list) {
        element.printFoodInfo()
    }
}