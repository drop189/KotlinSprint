package org.example.lesson_22

class ViewModel {

    data class MainScreenState(val data: String?, val isLoading: Boolean = false)

    private var currentState = MainScreenState(data = null)

    fun loadData(data: String? = null, isLoading: Boolean = false) {
        currentState = MainScreenState(data = data, isLoading = isLoading)

        println("Текущее состояние: $currentState")

        currentState = MainScreenState(data = "Данные", isLoading = true)

        println("Текущее состояние: $currentState")

        currentState = MainScreenState(data = "Данные", isLoading = false)

        println("Текущее состояние: $currentState")
    }
}


fun main() {

    val viewModel = ViewModel()
    viewModel.loadData()

}