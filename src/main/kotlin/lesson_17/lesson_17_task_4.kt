package org.example.lesson_17

class Package(
    number: Int,
    geolocation: String,
) {
    var geolocation = geolocation
        set(value) {
            field = value
            counter++
        }

    var counter = 0
}

fun main() {
    val packageDel = Package(42, "Москва")

    println(packageDel.counter)
    packageDel.geolocation = "Санкт-Петербург"
    println(packageDel.counter)
}