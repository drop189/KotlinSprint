package org.example.lesson_2

const val PLUS_TWENTY_PERCENT = 1.20
fun main() {
    val extractedCrystals = 7
    val extractedIronOre = 11

    val extractedCrystalsWithBuff= extractedCrystals * PLUS_TWENTY_PERCENT
    val extractedIronOreWithBuff = extractedIronOre * PLUS_TWENTY_PERCENT


    println(extractedCrystalsWithBuff.toInt())
    println(extractedIronOreWithBuff.toInt())
}