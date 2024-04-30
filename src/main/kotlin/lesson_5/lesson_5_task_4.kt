package org.example.lesson_5

fun main() {
    println(
        """ |Внимание, пассажир. 
            |Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold". 
            |[вздыхает...] 
            |Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
            |Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. 
            |[вздыхает ещё глубже...] 
            |Да, вперед, пожалуйста, вводите свои данные...
    """.trimMargin()
    )

    println()

    val registerUserName = "Zaphod"
    val registerUserPassword = "PanGalactic"

    println("Введите логин:")

    val enteredUserName = readln()

    if (enteredUserName != registerUserName) {
        println("Данного пользователя нет в базе данных. Прошу пройти регистрацию")
        return
    }

    println("Введите пароль:")

    val enteredUserPassword = readln()

    if (enteredUserPassword != registerUserPassword) {
        println("Пароль неверен. Доступ запрещён")
        return
    } else println("Пароль верен")

    println()

    println(
        """  |[вздыхает...]
             |Ваши данные проверены, и о, чудо, они верны... 
             |Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". 
             |Хотя мне всё равно... 
             |Ну вперед, войдите... 
             |Если вам так уж надо, в конце концов... 
             |[меланхолический вздох...] 
             |Надеюсь, вам понравится пребывание здесь больше, чем мне.
        
    """.trimMargin()
    )

}