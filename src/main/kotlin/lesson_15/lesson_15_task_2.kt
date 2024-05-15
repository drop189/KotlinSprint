package org.example.lesson_15

abstract class WeatherStationStats() {
abstract val data: String

}

class Temperature(override val data: String): WeatherStationStats(){

}

class PrecipitationAmount(override val data: String): WeatherStationStats(){

}

class  WeatherServer(){

    fun test(data: WeatherStationStats){
        if (data::class == Temperature::class) println("Передача данных: Температура")
        else if (data::class == PrecipitationAmount::class) println("Передача данных: Осадки")
        else println("Неверные данные")
    }

}

fun main(){
    val data1 = Temperature("18°С")
    val data2 = Temperature("280,15K")
    val data3 = PrecipitationAmount("765 мм рт. ст.")

    val server = WeatherServer()

    server.test(data1)
    server.test(data2)
    server.test(data3)
}