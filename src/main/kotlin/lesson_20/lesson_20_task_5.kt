package org.example.lesson_20

class Robot {
    private var randomPhrase = listOf(
        "Приветствую человек", "Ты слишком медленный", "Хороших выходных",
        "Можешь не волноваться на счет ошибок в коде, потом сам исправлю",
        "Воды нет, растительности нет"
    ).random()

    val invertingModifier: (String) -> String = { it: String -> it.reversed() }

    fun say() {
        println(randomPhrase)
    }

    fun setModifier(modifier: (String) -> String) {
        randomPhrase = modifier(randomPhrase)
    }
}

fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier(robot.invertingModifier)
    robot.say()
}