package org.example.lesson_19

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(private var ammo: Ammo? = null) {
    fun shoot() {
        when (ammo) {
            null -> println("Танк пуст. Необходимо выбрать снаряд")
            else -> println("Танк произвел выстрел на ${ammo?.damage} урона")
        }
    }

    fun changingAmmo(newAmmo: Ammo) {
        ammo = newAmmo
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()
    tank.changingAmmo(Ammo.BLUE)
    tank.shoot()
    tank.changingAmmo(Ammo.GREEN)
    tank.shoot()
    tank.changingAmmo(Ammo.RED)
    tank.shoot()
}