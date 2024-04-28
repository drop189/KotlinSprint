@file:Suppress("KotlinConstantConditions")

package org.example.lesson_4

fun main() {
    val trainingDay = 6

    val isEven = trainingDay % 2 == 0

    println("Упражнения для рук: \t${!isEven}\n" +
            "Упражнения для ног: \t$isEven\n" +
            "Упражнения для спины: \t$isEven\n" +
            "Упражнения для пресса: \t${!isEven}"
    )
}