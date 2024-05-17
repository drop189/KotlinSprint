package org.example.lesson_18

abstract class Dice(private val facets: Int) {
    fun rollDices() {
        print("Бросаем кости")
        repeat(3) {
            print(".")
            Thread.sleep(1000)
        }
        val result = (1..facets).random()
        println("Результат $result")
    }
}

class Dice4 : Dice(4)

class Dice6 : Dice(6)

class Dice8 : Dice(8)

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