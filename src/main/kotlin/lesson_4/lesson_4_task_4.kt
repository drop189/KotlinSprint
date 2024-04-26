@file:Suppress("KotlinConstantConditions")

package org.example.lesson_4

fun main() {
    val trainingDay = 5

    val dayOfExercisesForArmsAndAbs = trainingDay % 2 != 0
    val dayOfExercisesForLegsAndBack = trainingDay % 2 == 0

    println("Упражнения для рук: \t$dayOfExercisesForArmsAndAbs\n" +
            "Упражнения для ног: \t$dayOfExercisesForLegsAndBack\n" +
            "Упражнения для спины: \t$dayOfExercisesForLegsAndBack\n" +
            "Упражнения для пресса: \t$dayOfExercisesForArmsAndAbs")
}