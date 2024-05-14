package org.example.lesson_15

const val MAX_AMOUNT_OF_PASSENGERS_FOR_TRUCKS = 1
const val MAX_AMOUNT_OF_PASSENGERS_FOR_PASSENGERS_CARS = 3
const val MAX_WEIGHT_OF_CARGO_FOR_TRUCKS = 2_000
const val MAX_WEIGHT_OF_CARGO_FOR_PASSENGERS_CARS = 0

interface MovementOfCars {
    fun startEngine() = println("Двигатель запущен")

    fun drive() = println("Машина едет")

    fun turnOffEngine() = println("Двигатель заглушен")
}

interface TransportationOfPassengers {
    fun loadPassengers() = println("Загрузка пассажиров")


    fun checkAmountOfPassengersForTrucks(amount: Int) {
        if (amount <= MAX_AMOUNT_OF_PASSENGERS_FOR_TRUCKS) println("Пассажиров столько сколько надо")
        else println("Пассажиров слишком много")
    }

    fun checkAmountOfPassengersForPassengerCars(amount: Int) {
        if (amount <= MAX_AMOUNT_OF_PASSENGERS_FOR_PASSENGERS_CARS) println("Пассажиров столько сколько надо")
        else println("Пассажиров слишком много")
    }

    fun disembarkationOfPassengers() {
        println("Высадка пассажиров")
    }
}

interface CargoTransportation {
    fun loadCargo() = println("Загрузка груза")


    fun checkWeightOfCargoForTrucks(amount: Int) {
        if (amount <= MAX_WEIGHT_OF_CARGO_FOR_TRUCKS) println("Груза столько сколько надо")
        else println("Груза слишком много")
    }

    fun checkWeightOfCargoForPassengerCars(amount: Int) {
        if (amount <= MAX_WEIGHT_OF_CARGO_FOR_PASSENGERS_CARS) println("Груза столько сколько надо")
        else println("Груза слишком много")
    }

    fun dischargeOfCargo() {
        println("Выгрузка груза")
    }
}

abstract class Car {
    abstract val amountOfPassengers: Int
    abstract val weightOfCargo: Int
}

class Truck(
    override val amountOfPassengers: Int,
    override val weightOfCargo: Int
) : Car(), MovementOfCars, TransportationOfPassengers, CargoTransportation

class PassengerCar(
    override val amountOfPassengers: Int,
    override val weightOfCargo: Int
) : Car(), MovementOfCars, TransportationOfPassengers, CargoTransportation

fun main() {
    val truck = Truck(1, 2000)

    val car1 = PassengerCar(3, 0)
    val car2 = PassengerCar(2, 0)


    truck.loadPassengers()
    truck.checkAmountOfPassengersForTrucks(truck.amountOfPassengers)
    truck.loadCargo()
    truck.checkWeightOfCargoForTrucks(truck.weightOfCargo)
    truck.startEngine()
    truck.drive()
    truck.turnOffEngine()
    truck.disembarkationOfPassengers()
    truck.dischargeOfCargo()

    println("\nПеревезено пасажиров: ${truck.amountOfPassengers}, груза ${truck.weightOfCargo}кг\n")

    car1.loadPassengers()
    car1.checkAmountOfPassengersForPassengerCars(car1.amountOfPassengers)
    car1.loadCargo()
    car1.checkWeightOfCargoForPassengerCars(car1.weightOfCargo)
    car1.startEngine()
    car1.drive()
    car1.turnOffEngine()
    car1.disembarkationOfPassengers()
    car1.dischargeOfCargo()

    println("\nПеревезено пасажиров: ${car1.amountOfPassengers}, груза ${car1.weightOfCargo}кг\n")

    car2.loadPassengers()
    car2.checkAmountOfPassengersForPassengerCars(car2.amountOfPassengers)
    car2.loadCargo()
    car2.checkWeightOfCargoForPassengerCars(car2.weightOfCargo)
    car2.startEngine()
    car2.drive()
    car2.turnOffEngine()
    car2.disembarkationOfPassengers()
    car2.dischargeOfCargo()

    println("\nПеревезено пассажиров: ${car2.amountOfPassengers}, груза ${car2.weightOfCargo}кг\n")
    println("Всего: " +
            "${truck.amountOfPassengers + car1.amountOfPassengers + car2.amountOfPassengers} пассажиров, " +
            "${truck.weightOfCargo + car1.weightOfCargo + car2.weightOfCargo} кг")
}