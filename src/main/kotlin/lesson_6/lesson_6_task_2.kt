package org.example.lesson_6

fun main() {
    println("Сколько секунд надо засечь:")

    val userInputSeconds = readln().toInt()
    val userInputMilliseconds = (userInputSeconds * 1000).toLong()
    Thread.sleep(userInputMilliseconds)

    println("Прошло $userInputSeconds секунд")
}