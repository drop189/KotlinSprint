package org.example.lesson_19

enum class Ammo(val damage: Int?) {
    NO_AMMO(null),
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(private var ammo: Ammo = Ammo.NO_AMMO) {
    fun shoot() {
        println("Танк произвел выстрел на ${ammo.damage} урона")
    }

    fun changingAmmoBlue() {
        ammo = Ammo.BLUE
    }

    fun changingAmmoGreen() {
        ammo = Ammo.GREEN
    }

    fun changingAmmoRed() {
        ammo = Ammo.RED
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()
    tank.changingAmmoBlue()
    tank.shoot()
    tank.changingAmmoGreen()
    tank.shoot()
    tank.changingAmmoRed()
    tank.shoot()
}