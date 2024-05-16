package org.example.lesson_20

val randomPhrase = listOf(
    "Приветствую человек", "Ты слишком медленный", "Хороших выходных",
    "Можешь не волноваться на счет ошибок в коде, потом сам исправлю",
    "Воды нет, растительности нет"
).random()

val invertingModifier: (String) -> String = { it: String -> it.reversed()  }

fun say(phrase: String) {
    println(phrase)
}


fun setModifier(modifier: (String) -> String): String {
   return modifier(randomPhrase)
}

fun main() {
    say(randomPhrase)
    val phrase = setModifier(invertingModifier)
    say(phrase)
}