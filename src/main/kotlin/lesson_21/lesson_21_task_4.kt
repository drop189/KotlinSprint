package org.example.lesson_21

import java.io.File

fun File.printWord(text: String) {
    val textInFile = this.readText()

    val newText = text.lowercase() + textInFile

    this.writeText(newText)
}


fun main() {
    val fileName = "test.txt"
    val fileText = "Привет"

    val file = File(fileName)

    file.printWord(fileText)
}