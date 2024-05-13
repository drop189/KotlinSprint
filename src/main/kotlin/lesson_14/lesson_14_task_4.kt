package org.example.lesson_14

open class CelestialBodies(
    val name: String,
    val isThereAnAtmosphere: Boolean,
    val isSuitableForBoarding: Boolean,
)


class Planets(
    name: String,
    isThereAnAtmosphere: Boolean,
    isSuitableForBoarding: Boolean,
    val listOfMoons: List<Moons>,
) : CelestialBodies(
    name,
    isThereAnAtmosphere,
    isSuitableForBoarding
)


class Moons(
    name: String,
    isThereAnAtmosphere: Boolean,
    isSuitableForBoarding: Boolean,
) : CelestialBodies(
    name,
    isThereAnAtmosphere,
    isSuitableForBoarding
)

fun main() {
    val zeta = Moons("Zeta", isThereAnAtmosphere = false, isSuitableForBoarding = true)
    val beta = Moons("Beta", isThereAnAtmosphere = false, isSuitableForBoarding = false)
    val moonsOfPlanetAlpha = listOf(zeta, beta)
    val planetAlpha = Planets("Alpha",
        isThereAnAtmosphere = true,
        isSuitableForBoarding = true,
        listOfMoons = moonsOfPlanetAlpha
    )

    println(planetAlpha.name)
    planetAlpha.listOfMoons.forEach { println(it.name) }
}