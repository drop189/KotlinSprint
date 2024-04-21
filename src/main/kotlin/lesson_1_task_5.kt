package org.example

fun main() {
    val seconds = 6480
    val minutes = seconds / 60
    val hours = minutes / 60
    val remainsSeconds = seconds % 60
    val remainsMinutes = minutes % 60

    println(
        hours.toString().padStart(2, '0') +
            ":" +
                remainsMinutes.toString().padStart(2, '0') +
                    ":" +
                        remainsSeconds.toString().padStart(2, '0')
    )
}