package org.example.lesson_20

class PlayerWithInventory(val inventory: MutableList<String> = mutableListOf()){}

val unlockDoor: (PlayerWithInventory) -> Unit = { player ->
    if (player.inventory.contains("Ключ")) println("Дверь открыта")
    else println("Дверь закрыта")
}

fun main() {

    val playerWithKey = PlayerWithInventory(mutableListOf("Ключ"))
    val playerWithoutKey = PlayerWithInventory(mutableListOf("Пусто"))

    unlockDoor(playerWithKey)
    unlockDoor(playerWithoutKey)
}












/**
                        В игре есть запертая дверь. Игрок должен найти ключ. Нужно написать лямбда-функцию, которая будет проверять,
                        есть ли у игрока ключ. Если ключ есть, нужно вывести сообщение, что игрок дверь открыл, иначе – что дверь заперта.
                        Для проверки работы функции нужно написать класс игрока, в котором будет храниться информация о наличии ключа.
*/