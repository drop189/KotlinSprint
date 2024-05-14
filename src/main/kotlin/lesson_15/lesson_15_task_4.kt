package org.example.lesson_15

abstract class Warehouse {
    abstract val name: String
    abstract val numberOfUnits: Int
}

class Tools(override val name: String, override val numberOfUnits: Int) : Warehouse(), Search

class Accessories(override val name: String, override val numberOfUnits: Int) : Warehouse()

interface Search {
    fun searchOfAccessories() {
        print("Выполняется поиск")
        repeat(3){
            print(".")
            Thread.sleep(1000)
        }
    }
}