package org.example.lesson_6

fun main() {
    println("Сколько секунд надо засечь:")

    val userInputSeconds = readln().toInt()
    var secondsCounted  = userInputSeconds

    while (secondsCounted != 0){
        println("Осталось ${secondsCounted--}")
        Thread.sleep(1000)
    }

    println("Прошло $userInputSeconds секунд")
}