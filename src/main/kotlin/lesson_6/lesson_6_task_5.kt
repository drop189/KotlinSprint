package org.example.lesson_6

fun main() {
    println("Подтвердите, что вы не робот")

    var numberOfAttempts = 3
    var num1 = (0..9).random()
    var num2 = (0..9).random()
    var result = num1 + num2

    println("Решите простейший математический пример: $num1 + $num2 = ?")
    var userResult = readln().toInt()

    while (result != userResult) {
        --numberOfAttempts
        if (numberOfAttempts == 0) {
            println("Доступ запрещен")
            return
        } else {
            num1 = (0..9).random()
            num2 = (0..9).random()
            result = num1 + num2
            println("Попробуйте ещё раз: $num1 + $num2 = ?")
            userResult = readln().toInt()
        }

    }
    println("Добро пожаловать!")
}