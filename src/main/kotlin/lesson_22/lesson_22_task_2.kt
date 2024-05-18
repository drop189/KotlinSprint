package org.example.lesson_22

data class DataBook2(val title: String, val author: String)

class RegularBook2(val title: String, val author: String)



fun main(){
    val regularBook = RegularBook2("Властелин колец", "Толкин")
    val dataBook = DataBook2("Властелин колец", "Толкин")

    println(regularBook)
    println(dataBook)
}
/*
                Разница изза того, что для обычных классов выводится адрес объекта в памяти,
                а для data классов выводится значения его свойств
 */