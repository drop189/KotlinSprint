package org.example.lesson_16

class Order(
    private val numberOfOrder: Int,
    private var readyStatus: String,
) {
    private fun changeTheReadinessStatus(newStatusInput: String) {
        readyStatus = newStatusInput
    }

    fun getStatus(){
        println("Нынешний статус: $readyStatus")
    }

    fun sendRequestToTheManager(order: Order, newStatus: String) {
        order.changeTheReadinessStatus(newStatus)
        println("Смена статуса на статус $newStatus")
    }
}

fun main() {
    val order = Order(1, "Готовка")

    order.getStatus()
    order.sendRequestToTheManager(order, "Доставка")
    order.getStatus()
}