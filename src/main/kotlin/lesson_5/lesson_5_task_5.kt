package org.example.lesson_5

fun main() {

    val rightAnswers: MutableList<Int> = mutableListOf()
    val firstRightAnswer = (0..42).random()
    val secondRightAnswer = (0..42).random()
    val thirdRightAnswer = (0..42).random()

    rightAnswers.add(0, firstRightAnswer)
    rightAnswers.add(1, secondRightAnswer)
    rightAnswers.add(2, thirdRightAnswer)

    val userAnswers: MutableList<Int> = mutableListOf()
    val userFirstAnswer = readln().toInt()
    val userSecondAnswer = readln().toInt()
    val userThirdAnswer = readln().toInt()

    userAnswers.add(0, userFirstAnswer)
    userAnswers.add(1, userSecondAnswer)
    userAnswers.add(2, userThirdAnswer)

    val intersectionOfAnswers = rightAnswers.intersect(userAnswers.toSet())

    val sizeOfIntersectionOfAnswers = intersectionOfAnswers.size

    when (sizeOfIntersectionOfAnswers) {
        3 -> println("Вы угадали все числа. Поздравляю вы выиграли джекпот!!!")
        2 -> println("Вы угадали два числа. Поздравляю вы выиграли крупный приз!!")
        1 -> println("Вы угадали одно число. Поздравляю вы выиграли утешительный приз!")
        0 -> println("Вы не угадали ни одного числа. Не отчаивайтесь, попробуйте ещё раз.")
    }

    println("Правильные числа: ${rightAnswers[0]}, ${rightAnswers[1]}, ${rightAnswers[2]}")
}