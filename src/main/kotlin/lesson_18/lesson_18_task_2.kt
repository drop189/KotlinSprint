package org.example.lesson_18

open class Dice {
    open fun rollDices() {
        print("Бросаем кости")
        repeat(3) {
            print(".")
            Thread.sleep(1000)
        }
    }
}

class Dice4(private val facets: Int = 4) : Dice() {
    override fun rollDices() {
        super.rollDices()
        val result = (1..facets).random()
        println("Результат $result")
    }
}

class Dice6(private val facets: Int = 6) : Dice() {
    override fun rollDices() {
        super.rollDices()
        val result = (1..facets).random()
        println("Результат $result")
    }
}

class Dice8(private val facets: Int = 8) : Dice() {
    override fun rollDices() {
        super.rollDices()
        val result = (1..facets).random()
        println("Результат $result")
    }
}

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()

    val listOfDice: List<Dice> = listOf(dice4, dice6, dice8)

    val dicesIterator = listOfDice.iterator()
    while (dicesIterator.hasNext()) {
        dicesIterator.next().rollDices()
    }
}