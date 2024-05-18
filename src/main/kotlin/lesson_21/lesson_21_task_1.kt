package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = "AEIOUaeiouАЕЁИОУЭЮЯаеёиоуэюя"
    return this.count { it in vowels }
}

fun main(){
    val testString1 = "hello"
    val testString2 = "Привет"

    println(testString1.vowelCount())
    println(testString2.vowelCount())
}