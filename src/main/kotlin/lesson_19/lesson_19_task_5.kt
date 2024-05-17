package org.example.lesson_19

enum class Gender(val nameOfGender: String) {
    MALE("Мужской"),
    FEMALE("Женский"),
}

class Human(
    val name: String,
    val gender: Gender,
)

fun main() {
    println(
        """Пожалуйста, введите данные о человеке в формате:
        | Имя 
        | Пол 
        |В графу Пол допускается только ввод формата - (Мужской/Женский)
        | """.trimMargin()
    )

    val peopleList = mutableListOf<Human>()


    repeat(5) {
        println("Введите имя и пол человека ${it + 1} ")
        print("Введите имя: ")
        val name = readln()
        print("Введите пол: ")
        var userInput = readln()
        var gender: Gender? = null

        while (gender == null) {

            when (userInput) {
                "Мужской" -> gender = Gender.MALE
                "Женский" -> gender = Gender.FEMALE
                else -> {
                    gender = null
                    println("Неверный ввод")
                    print("Введите пол:")
                    userInput = readln()
                }
            }

        }
        val person = Human(name, gender)

        peopleList.add(person)
    }

    println("\nСписок людей в картотеке:")
    peopleList.forEach { println("Имя: ${it.name}, Пол: ${it.gender.nameOfGender}") }

}