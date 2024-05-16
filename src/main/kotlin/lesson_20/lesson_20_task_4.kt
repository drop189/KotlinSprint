package org.example.lesson_20

fun main() {
    val listString = listOf(
        "Назад", "Поиск", "Меню", "Настройки", "Сообщения", "Изображение", "Игры", "Новая запись"
    )

    val lambdaList = listString.map { element ->
        { println("Нажат элемент $element") }
    }

    var count = 0
    for (i in lambdaList) {
        if (count % 2 == 1) i()
        count += 1
    }

}