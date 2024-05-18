package org.example.lesson_20

fun main() {
    val listString = listOf(
        "Назад", "Поиск", "Меню", "Настройки", "Сообщения", "Изображение", "Игры", "Новая запись"
    )

    val lambdaList = listString.map { element ->
        { println("Нажат элемент $element") }
    }

    lambdaList.forEachIndexed { index, _ ->  if (index % 2 == 1) lambdaList[index]() }
}