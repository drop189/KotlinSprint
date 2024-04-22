package org.example.lesson_2

const val SALARY_OF_EMPLOYEES = 30000
const val SALARY_OF_INTERNS = 20000
const val NUMBER_OF_EMPLOYEES = 50
const val NUMBER_OF_INTERNS = 30
fun main() {

    val expensesOfEmployees = NUMBER_OF_EMPLOYEES * SALARY_OF_EMPLOYEES
    val expensesOfInterns = NUMBER_OF_INTERNS * SALARY_OF_INTERNS

    val allExpenses = expensesOfInterns + expensesOfEmployees

    val averageSalary = allExpenses / (NUMBER_OF_EMPLOYEES + NUMBER_OF_INTERNS)

    println(expensesOfEmployees)
    println(allExpenses)
    println(averageSalary)

}