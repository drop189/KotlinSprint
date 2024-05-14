package org.example.lesson_15

abstract class WeatherStationStats() {
abstract val data: String

}

class Temperature(override val data: String): WeatherStationStats(){

}

class PrecipitationAmount(override val data: String): WeatherStationStats(){

}

class  WeatherServer(){

    fun test(data: String){
        if (data.contains("мм")) println("Количество осадков $data")
        else if (data.contains("°С")) println("Температура в Градусах Цельсия $data")
        else if (data.contains("K")) println("Температура в Кельвинах $data")
        else println("Данные поврежденны")
    }

}

fun main(){
    val data1 = Temperature("18°С")
    val data2 = Temperature("280,15K")
    val data3 = PrecipitationAmount("765 мм рт. ст.")

    val server = WeatherServer()

    server.test(data1.data)
    server.test(data2.data)
    server.test(data3.data)
}