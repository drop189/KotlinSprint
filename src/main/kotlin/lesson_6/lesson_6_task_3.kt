package org.example.lesson_6

fun main() {
    println("Сколько секунд надо засечь:")

    val userInputSeconds = readln().toInt()
    var secondsCounted = userInputSeconds

    while (secondsCounted != 0) {
        println("Осталось секунд: ${secondsCounted--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
    println("Прошло $userInputSeconds секунд")
}









