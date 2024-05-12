package org.example.lesson_13

class TelephoneGuideUserInput(
    private val name: String,
    private val phone: Long,
    private val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name Номер: $phone  Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    println("Введите ваше имя:")
    val userName = readln()

    println("Введите номер телефона:")
    var userNumber = readln().toLongOrNull()
    while (userNumber == null) {
        println("Номер некоректный, введите заново")
        userNumber = readln().toLongOrNull()
    }

    println("Введите имя компании или оставте это поле пустым")
    var userCompany = readlnOrNull()

    userCompany = if (userCompany.isNullOrEmpty()) null else userCompany

    val userContact = TelephoneGuideUserInput(userName,userNumber,userCompany)

    userContact.printInfo()
}