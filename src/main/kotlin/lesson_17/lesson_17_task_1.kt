package org.example.lesson_17

class Quiz{

    var question = "100?"
        get() = "2 + 2 = ?"


    var answer = "100!"
        get() = "Введите ответ:"
        set(value) {
            field = value
            if (value == "4") {
                println("Ответ правильный!")
            } else {
                println("Ответ неправильный.")
            }
        }
}

fun main() {
    val quiz = Quiz()
    println(quiz.question)
    println(quiz.answer)
    quiz.answer = readln()
}