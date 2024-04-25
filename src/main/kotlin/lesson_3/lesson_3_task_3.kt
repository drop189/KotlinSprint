package org.example.lesson_3

const val ZERO = 0
const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val FIVE = 5
const val SIX = 6
const val SEVEN = 7
const val EIGHT = 8
const val NINE = 9
const val TEN = 10

fun main() {
    val userNumber = readln().toInt()

    println("""
        $userNumber x $ZERO = ${userNumber.times(ZERO)}
        $userNumber x $ONE = ${userNumber * ONE}
        $userNumber x $TWO = ${userNumber * TWO}
        $userNumber x $THREE = ${userNumber * THREE}
        $userNumber x $FOUR = ${userNumber * FOUR}
        $userNumber x $FIVE = ${userNumber * FIVE}
        $userNumber x $SIX = ${userNumber * SIX}
        $userNumber x $SEVEN = ${userNumber * SEVEN}
        $userNumber x $EIGHT = ${userNumber * EIGHT}
        $userNumber x $NINE = ${userNumber * NINE}
        $userNumber x $TEN = ${userNumber * TEN}
    """.trimIndent())
}