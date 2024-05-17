package org.example.lesson_19

class SpaceShip{
    fun fly(){
        println("Летит")
        //TODO: Нужна информация о дополнительной логике
    }

    fun shoot(){
        TODO("Прописать логику стрельбы")
    }

    fun land(){
        println("Приземляется")
        //TODO: Нужна информация о дополнительной логике
    }
}

fun main(){
    val spaceShip = SpaceShip()
    spaceShip.fly()
    spaceShip.shoot()
    spaceShip.land()
}