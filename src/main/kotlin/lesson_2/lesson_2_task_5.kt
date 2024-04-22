package org.example.lesson_2

import kotlin.math.pow



fun main() {

    val summa = 70_000
    val percent = 16.7
    val time = 20

    val result = summa * (1 + (percent/100)).pow(time)


    println(String.format("%.3f", result))  // 1536438.428
}