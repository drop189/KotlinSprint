package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val isThereAnAtmosphere: Boolean,
    val isSuitableForBoarding: Boolean,
)


class Planet(
    name: String,
    isThereAnAtmosphere: Boolean,
    isSuitableForBoarding: Boolean,
    val listOfMoons: List<Moon>,
) : CelestialBody(
    name,
    isThereAnAtmosphere,
    isSuitableForBoarding
)


class Moon(
    name: String,
    isThereAnAtmosphere: Boolean,
    isSuitableForBoarding: Boolean,
) : CelestialBody(
    name,
    isThereAnAtmosphere,
    isSuitableForBoarding
)

fun main() {
    val zeta = Moon("Zeta", isThereAnAtmosphere = false, isSuitableForBoarding = true)
    val beta = Moon("Beta", isThereAnAtmosphere = false, isSuitableForBoarding = false)
    val moonsOfPlanetAlpha = listOf(zeta, beta)
    val planetAlpha = Planet("Alpha",
        isThereAnAtmosphere = true,
        isSuitableForBoarding = true,
        listOfMoons = moonsOfPlanetAlpha
    )

    println(planetAlpha.name)
    planetAlpha.listOfMoons.forEach { println(it.name) }
}