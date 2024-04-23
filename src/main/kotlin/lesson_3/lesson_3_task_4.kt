package org.example.lesson_3

fun main() {

    var startMotion = "E2"
    var endMotion = "E4"
    var motionNumber = "0"

    var stringToServer = "[$startMotion - $endMotion;$motionNumber]"

    println(stringToServer)

    startMotion = "D2"
    endMotion = "D3"
    motionNumber = "2"

    stringToServer = "[$startMotion - $endMotion;$motionNumber]"

    println(stringToServer)
}