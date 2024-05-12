package org.example.lesson_13

class TelephoneGuideAdvanced(
    private val name: String,
    private val phone: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name Номер: $phone  Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {

    val a = TelephoneGuideAdvanced("Крис", 34523245342543, "Reddit" )
    val b = TelephoneGuideAdvanced("Лиза", 345234534255, "Nickelodeon" )
    val c = TelephoneGuideAdvanced("Гоша", 5353425345, null )
    val d = TelephoneGuideAdvanced("Катя", 23452355, null )
    val e = TelephoneGuideAdvanced("Влад", 234532, "null" )


    val listOfContacts: List<TelephoneGuideAdvanced> = listOf(a, b, c, d, e)
    val listOfCompanies = listOfContacts.mapNotNull { it.company }.toSet()

    println("Список всех существующих компаний:")
    listOfCompanies.forEach { println(it) }
}