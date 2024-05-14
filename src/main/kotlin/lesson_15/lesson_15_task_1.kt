package org.example.lesson_15

interface Fly {
    fun fly()
}

interface Swim {
    fun swim()
}

interface Walk {
    fun walk()
}


class Crucian() : Swim {
    override fun swim() {
        println("Плавает под водой")
    }
}

class Seagull() : Fly, Walk {
    override fun fly() {
        println("Летает около морей")
    }

    override fun walk() {
        println("Ходит")
    }
}

class Duck() : Fly, Swim {
    override fun fly() {
        println("Летает около озёр")
    }

    override fun swim() {
        println("Плавает над водой")
    }
}


fun main() {
    val crucian = Crucian()
    val duck = Duck()
    val seagull = Seagull()

    crucian.swim()

    duck.fly()
    duck.swim()

    seagull.fly()
    seagull.walk()
}