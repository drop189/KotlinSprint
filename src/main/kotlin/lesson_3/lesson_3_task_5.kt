package org.example.lesson_3

fun main() {

    val stringFromServer = "D2-D4;0"

    val dataOfStringFromServer = stringFromServer.split("-", ";")

    val startMotion = dataOfStringFromServer[0]
    val endMotion = dataOfStringFromServer[1]
    val motionNumber = dataOfStringFromServer[2]

//    println(p)
    println(startMotion)
    println(endMotion)
    println(motionNumber)
}