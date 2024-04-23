package org.example.lesson_1

const val SECONDS_IN_HOUR = 60

fun main() {
    val seconds = 6480
    val minutes = seconds / SECONDS_IN_HOUR
    val hours = minutes / SECONDS_IN_HOUR
    val remainsSeconds = seconds % SECONDS_IN_HOUR
    val remainsMinutes = minutes % SECONDS_IN_HOUR

    println("%02d:%02d:%02d".format(hours, remainsMinutes, remainsSeconds))
}