package org.example.lesson_17

class ShipMobile(
    _name: String,
    val averageSpeed: Int,
    val homePort: String,
){
    var name: String = _name
        set(value) {
            println("Имя корабля менять нельзя")
        }
}
fun main (){
    val shipMobile = ShipMobile("Bobbi",4500,"Iceland")
    shipMobile.name = "НЕ Bobbi"
    println(shipMobile.name)
}