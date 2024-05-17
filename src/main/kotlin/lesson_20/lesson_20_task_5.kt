package org.example.lesson_20

class Robot {
    private var randomPhrase = listOf(
        "Приветствую человек", "Ты слишком медленный", "Хороших выходных",
        "Можешь не волноваться на счет ошибок в коде, потом сам исправлю",
        "Воды нет, растительности нет"
    )

    var invertingModifier: (String) -> String = { it: String -> it.reversed() }

    private var modifier: (String) -> String = { it }

    fun say() {
        val phrase = randomPhrase.random()
        val modifiedPhrase = modifier(phrase)
        println(modifiedPhrase)
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier(robot.invertingModifier)
    robot.say()
}