package org.example.lesson_16

class Order(
    val numberOfOrder: Int,
    private var readyStatus: String,
) {
    fun changeTheReadinessStatus(sta: String) {
        readyStatus = sta
    }
}

fun sendRequestToTheManager(order: Order, newStatus: String) {
    order.changeTheReadinessStatus(newStatus)
}

fun main(){
    val order = Order(1, "Готовка")

    sendRequestToTheManager(order, "Доставка")
}