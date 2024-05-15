package org.example.lesson_17

class Folder(
    name: String,
    amountOfFiles: Int,
    private val isSecret: Boolean,
) {
    var name = name
        get() {
            return if (isSecret) "“скрытая папка”"
            else field
        }

    var amountOfFiles = amountOfFiles
        get() {
            return if (isSecret) 0
            else field
        }
}

fun main() {
    val folderSecret = Folder("XXXX",56, true)
    val folder = Folder("Учеба",4, false)

    println(folder.name)
    println(folder.amountOfFiles)

    println(folderSecret.name)
    println(folderSecret.amountOfFiles)
}