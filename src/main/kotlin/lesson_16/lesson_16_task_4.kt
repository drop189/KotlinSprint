package org.example.lesson_16

class Order(
    private val numberOfOrder: Int,
    private var readyStatus: String,
) {
    private fun changeTheReadinessStatus(newStatusInput: String) {
        readyStatus = newStatusInput
    }
    fun sendRequestToTheManager(order: Order, newStatus: String) {
        println("Нынешний статус: $readyStatus")
        order.changeTheReadinessStatus(newStatus)
        println("Новый статус: $readyStatus")
    }
}

fun main(){
    val order = Order(1, "Готовка")
    order.sendRequestToTheManager(order, "Доставка")
}