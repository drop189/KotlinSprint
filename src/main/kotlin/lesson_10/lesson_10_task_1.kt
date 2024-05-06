package org.example.lesson_10

fun rollTheDice(): Int {
    return (1..6).random()
}

fun main() {
    println("Давай сыграем в игру!")
    println("Правила просты:")
    println("Мы с тобой поочередно бросаем кости, у кого больше тот и выиграл")
    println("Ну что сыграем?")
    val userInput: String = readln()


    if (userInput == "да" || userInput == "Да" || userInput == "Yes" || userInput == "yes") println("Отлично, давай начнем!")
    else {
        println("Жаль, прощай")
        return
    }


    println("Ты бросаешь кости")
    val userRoll = rollTheDice()
    repeat(3) {
        print(".")
        Thread.sleep(1000)
    }
    println("\nТебе выпало - $userRoll")
    Thread.sleep(500)

    println("\nКомпьютер бросает кости")
    val computerRoll = rollTheDice()
    repeat(3) {
        print(".")
        Thread.sleep(1000)
    }
    println("Компьютер выбросил - $computerRoll\n")

    if (userRoll > computerRoll) println("Победило человечество")
    else println("Победила машина")
}

