package org.example.lesson_19

enum class Aquarium( val nameOfFish: String){
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}
fun main() {
    println("Вы можете добавить следующих рыб в свой аквариум:")
    Aquarium.entries.forEach { println("${it.ordinal + 1}. ${ it.nameOfFish }") }
}