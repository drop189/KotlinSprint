package org.example.lesson_2

const val NUMBER_OF_STUDENTS = 4.0
const val GRADE_OF_PETYA = 3.0
const val GRADE_OF_IVAN = 4.0
const val GRADE_OF_ANYA = 3.0
const val GRADE_OF_DIANA = 5.0
fun main() {

    val result = ((GRADE_OF_PETYA + GRADE_OF_IVAN + GRADE_OF_ANYA + GRADE_OF_DIANA) / NUMBER_OF_STUDENTS)

    println(result)
}