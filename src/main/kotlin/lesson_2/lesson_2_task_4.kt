package org.example.lesson_2

fun main() {
    val percent = 20
    val plusPercent= ((1 + (percent.toDouble()/100)))

    val extractedCrystals = 7
    val extractedIronOre = 11

    val extractedCrystalsWithBuff= extractedCrystals * plusPercent
    val extractedIronOreWithBuff = extractedIronOre * plusPercent


    println(extractedCrystalsWithBuff.toInt())
    println(extractedIronOreWithBuff.toInt())
}