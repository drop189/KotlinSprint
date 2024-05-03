package org.example.lesson_7

fun main(){
    println("Введите количество секунд для таймера:")
    var userInputSeconds = readln().toInt()

    println("Таймер запущен на $userInputSeconds секунд.")

    for (remainSeconds in 1..userInputSeconds){
        println("Осталось секунд: ${userInputSeconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}