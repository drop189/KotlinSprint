package org.example.lesson_1

const val sixty = 60
const val seconds = 6480
fun main() {

    val minutes = seconds / sixty
    val hours = minutes / sixty
    val remainsSeconds = seconds % sixty
    val remainsMinutes = minutes % sixty

    println("%02d:%02d:%02d".format(hours, remainsMinutes, remainsSeconds))
}