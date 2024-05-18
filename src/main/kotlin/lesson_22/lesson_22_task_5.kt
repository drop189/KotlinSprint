package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distance: Long,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая к Земле звездная система",
        dateTime = "Неизвестно",
        distance = 39_900_000_000_000
    )

    val (name, description,dateTime, distance) = alphaCentauri
    println(name)
    println(description)
    println(dateTime)
    println("$distance км")

}