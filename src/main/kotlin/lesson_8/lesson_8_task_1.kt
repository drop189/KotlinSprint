package org.example.lesson_8

fun main() {

    val arrayOfViews = intArrayOf(0,0,0,0,0,0,0)

    val mondayViews = 5464
    val tuesdayViews = 5410
    val wednesdayViews = 5954
    val thursdayViews = 5728
    val fridayViews = 7065
    val saturdayViews = 10111
    val sundayViews = 2630

    arrayOfViews[0] = mondayViews
    arrayOfViews[1] = tuesdayViews
    arrayOfViews[2] = wednesdayViews
    arrayOfViews[3] = thursdayViews
    arrayOfViews[4] = fridayViews
    arrayOfViews[5] = saturdayViews
    arrayOfViews[6] = sundayViews

    var sumOfViews = 0

    for (element in arrayOfViews) sumOfViews += element

    println(sumOfViews)
}