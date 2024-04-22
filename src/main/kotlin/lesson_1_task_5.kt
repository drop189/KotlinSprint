package org.example

const val sixty = 60
fun main() {
    val seconds = 6480
    val minutes = seconds / sixty
    val hours = minutes / sixty
    val remainsSeconds = seconds % sixty
    val remainsMinutes = minutes % sixty

    println(
        hours.toString().padStart(2, '0') +
            ":" +
                remainsMinutes.toString().padStart(2, '0') +
                    ":" +
                        remainsSeconds.toString().padStart(2, '0')
    )
}