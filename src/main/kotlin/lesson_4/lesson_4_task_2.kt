package org.example.lesson_4

const val MIN_WEIGHT_FOR_AVERAGE = 35
const val MAX_WEIGHT_FOR_AVERAGE = 100
const val MAX_VOLUME_FOR_AVERAGE = 100

fun main() {

    val weightOfFirstCargo = 20
    val volumeOfFirstCargo = 80

    val weightOfSecondCargo = 50
    val volumeOfSecondCargo = 100

    println(
        "Груз с весом $weightOfFirstCargo кг и объемом $volumeOfFirstCargo л соответствует категории 'Average':" +
                " ${
                    (MIN_WEIGHT_FOR_AVERAGE <= weightOfFirstCargo)
                            && (MAX_WEIGHT_FOR_AVERAGE >= weightOfFirstCargo)
                            && (MAX_VOLUME_FOR_AVERAGE > volumeOfFirstCargo)
                }"
    )

    println(
        "Груз с весом $weightOfSecondCargo кг и объемом $volumeOfSecondCargo л соответствует категории 'Average':" +
                " ${
                    (MIN_WEIGHT_FOR_AVERAGE <= weightOfSecondCargo)
                            && (MAX_WEIGHT_FOR_AVERAGE >= weightOfSecondCargo)
                            && (MAX_VOLUME_FOR_AVERAGE > volumeOfSecondCargo)
                }"
    )
}