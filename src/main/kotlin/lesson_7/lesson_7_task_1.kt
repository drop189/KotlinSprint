package org.example.lesson_7

fun main() {
    val allowedChars = 'a'..'z'
    val allowedDigits = '0'..'9'
    val length = 6
    var password = ""

    for (i in 0 until length step 2){
        password += allowedChars.random()
        password += allowedDigits.random()
    }

    println(password)
}