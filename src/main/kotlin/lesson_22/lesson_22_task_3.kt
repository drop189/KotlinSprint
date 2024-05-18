package org.example.lesson_22

data class Book(val author: String, val title: String, val publisher: String)

fun main() {
    val book = Book("author", "title", "publisher")

    val (author, title, publisher) = book

    println("Автор: $author")
    println("Название: $title")
    println("Издатель: $publisher")
}