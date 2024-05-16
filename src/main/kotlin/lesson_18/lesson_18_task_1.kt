package org.example.lesson_18

class OrderCRM {
    fun printOrderInfo(products: String) {
        println("Заказан товар: $products")
    }

    fun printOrderInfo(products: List<String>) {
        println("Заказаны следующие товары: $products")
    }
}

fun main() {
    val order1 = OrderCRM()
    val order2 = OrderCRM()


    order1.printOrderInfo("Футболка")
    order2.printOrderInfo(listOf("Футболка", "Джинсы", "Обувь"))
}