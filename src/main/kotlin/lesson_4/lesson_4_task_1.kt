package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

@Suppress("KotlinConstantConditions")
fun main() {

    val reservedTablesToday = 13
    val reservedTablesTomorrow = 4

    val vacantTablesToday = NUMBER_OF_TABLES != reservedTablesToday
    val vacantTablesTomorrow = NUMBER_OF_TABLES != reservedTablesTomorrow

    println("Доступность столиков на сегодня: $vacantTablesToday\nДоступность столиков на завтра: $vacantTablesTomorrow")
}