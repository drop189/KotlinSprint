package org.example

const val sixty = 60
fun main() {
    val seconds = 6480
    val minutes = seconds / sixty
    val hours = minutes / sixty
    val remainsSeconds = seconds % sixty
    val remainsMinutes = minutes % sixty

    println("%02d:%02d:%02d".format(hours, remainsMinutes, remainsSeconds))
}