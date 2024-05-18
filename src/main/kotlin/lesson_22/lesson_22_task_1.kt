package org.example.lesson_22

data class DataBook(val title: String, val author: String)

class RegularBook(val title: String, val author: String)


fun main() {
    val regularBook1 = RegularBook("Властелин колец", "Толкин")
    val regularBook2 = RegularBook("Властелин колец", "Толкин")
    val dataBook1 = DataBook("Властелин колец", "Толкин")
    val dataBook2 = DataBook("Властелин колец", "Толкин")

    println("Сравнение RegularBook:")
    println(regularBook1 == regularBook2)
    println("Сравнение DataBook:")
    println(dataBook1 == dataBook2)
}
/*
Разница в выводе из-за того, что для обычных классов оператор сравнения сравнивает ссылки на объекты,
а для data классов оператор сравнения сравнивает значения их свойств.
 */