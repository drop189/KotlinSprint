package org.example.lesson_17

class Quiz(
    question: String,
    private val _answer: String,
){

    var question = question
        get() = "Вопрос: $field"


    var answer = _answer
        get() = "Введите ответ:"
        set(value) {
            if (value == _answer) {
                println("Ответ правильный!")
            } else {
                println("Ответ неправильный.")
            }
            field = value
        }
}

fun main() {
    val quiz = Quiz("2 + 2 = ?", "4")
    println(quiz.question)
    println(quiz.answer)
    quiz.answer = readln()
}