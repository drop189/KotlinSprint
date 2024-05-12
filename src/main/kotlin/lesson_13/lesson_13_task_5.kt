package org.example.lesson_13

class TelephoneGuideCool(
    private val name: String,
    private val phone: Long,
    private val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name Номер: $phone  Компания: ${company ?: "<не указано>"}")
    }
}
fun main() {
    var phone: Long = 0
    try {
        phone = readln().toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e.message}")
    }
}