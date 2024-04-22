package org.example.lesson_1

fun main() {

    var numberOfEmployees: Int = 2000
    val numberOfOrders: Int = 75
    val textCustomerMakePurchase: String =
        "Спасибо, что выбрали нас! Мы стремимся предлагать вам самые лучшие товары. Если у вас есть какие-либо вопросы, не стесняйтесь обращаться к нам."


    println("Количество заказов: $numberOfOrders")
    println(textCustomerMakePurchase)
//    println(numberOfEmployees)

    numberOfEmployees -= 1 //1 уволился

    println("Количество работников: $numberOfEmployees")
}