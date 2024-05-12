package org.example.lesson_13

class TelephoneGuideAdv(
    private val name: String,
    private val phone: Long,
    private val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name Номер: $phone  Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val functioningPerson = TelephoneGuideAdv("Lisa", 15, "\"OOO\"LONg")
    val unemployedPerson = TelephoneGuideAdv("Denis", 15)

    functioningPerson.printInfo()
    unemployedPerson.printInfo()
}
