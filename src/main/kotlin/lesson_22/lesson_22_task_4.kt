package org.example.lesson_22

class ViewModel {

    data class MainScreenState(val data: String?, val isLoading: Boolean = false)

    var currentState = MainScreenState(data = null)

    fun loadData(data: String? = null, isLoading: Boolean = false) {
        currentState = MainScreenState(data = data, isLoading = isLoading)
    }
}


fun main() {

    val viewModel = ViewModel()

    println("Текущее состояние: ${viewModel.currentState}")

    viewModel.loadData("Данные", true)

    println("Текущее состояние: ${viewModel.currentState}")

    viewModel.loadData("Данные", false)

    println("Текущее состояние: ${viewModel.currentState}")
}