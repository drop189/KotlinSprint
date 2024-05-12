package org.example.lesson_13

class TelephoneGuide(
    val name: String,
    val phone: Long,
    val company: String?,
) {}

fun main() {
    val functioningPerson = TelephoneGuide("Lisa",15,"OOO LONg")
    val unemployedPerson = TelephoneGuide("Denis",15,null)

    println(functioningPerson.name)
    println(functioningPerson.phone)
    println(functioningPerson.company)
    println(unemployedPerson.name)
    println(unemployedPerson.phone)
    println(unemployedPerson.company)
}