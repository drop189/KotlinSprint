package org.example.lesson_22

data class DataBook(val title: String, val author: String)

class RegularBook(val title: String, val author: String)


fun main() {
    val regularBook1 = RegularBook("Властелин колец", "Толкин")
    val regularBook2 = RegularBook("Властелин колец", "Толкин")
    val dataBook1 = DataBook("Властелин колец", "Толкин")
    val dataBook2 = DataBook("Властелин колец", "Толкин")

    val a = regularBook1 == regularBook2
    val b = dataBook1 == dataBook2

    println("Сравнение RegularBook:")
    println(a)
    println("Сравнение DataBook:")
    println(b)
}
/*
Разница в выводе из-за того, что для обычных классов оператор сравнения сравнивает ссылки на объекты,
а для data классов оператор сравнения сравнивает значения их свойств.
 */