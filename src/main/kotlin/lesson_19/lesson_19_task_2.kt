package org.example.lesson_19

enum class Category(private val nameOfCategory: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канцелярские товары"),
    MISCELLANEA("Разное");

    fun getNameOfCategory() = println("Категория: $nameOfCategory")
}

class Product(
    private val nameOfProduct: String,
    private val id : Int,
    private val category: Category,
) {
    fun getInfoOfProduct() {
        println("Товар: $nameOfProduct")
        println("ID: $id")
        category.getNameOfCategory()
        println()
    }
}

fun main() {
    val product1 = Product("Ручка", 145, Category.STATIONERY)
    val product2 = Product("Футболка", 456, Category.CLOTHES)
    val product3 = Product("Книга", 1, Category.MISCELLANEA)

    product1.getInfoOfProduct()
    product2.getInfoOfProduct()
    product3.getInfoOfProduct()
}