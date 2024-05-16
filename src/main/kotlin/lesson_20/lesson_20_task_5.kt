package org.example.lesson_20

class Robot {
    val randomPhrase = listOf(
        "Приветствую человек", "Ты слишком медленный", "Хороших выходных",
        "Можешь не волноваться на счет ошибок в коде, потом сам исправлю",
        "Воды нет, растительности нет"
    ).random()

    val invertingModifier: (String) -> String = { it: String -> it.reversed() }

    fun say(phrase: String) {
        println(phrase)
    }

    fun setModifier(modifier: (String) -> String): String {
        return modifier(randomPhrase)
    }
}

fun main() {
    val robot = Robot()
    robot.say(robot.randomPhrase)
    val phrase = robot.setModifier(robot.invertingModifier)
    robot.say(phrase)
}