package org.example.lesson_7

fun main(){
    println("Введите количество секунд для таймера:")
    val userInputSeconds = readln().toInt()

    println("Таймер запущен на $userInputSeconds секунд.")

    for (remainSeconds in 1..userInputSeconds){
        println("Осталось секунд: $remainSeconds")
        Thread.sleep(1000)
    }

    println("Время вышло")
}