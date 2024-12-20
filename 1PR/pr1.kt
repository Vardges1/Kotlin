package pr1

fun main() {
    val expenses1: InfoExpenses = InfoExpenses(
        sum = 1459,
        category = "Интернет",
        date = "8.12.2024",
    )

    val expenses2: InfoExpenses = InfoExpenses(
        sum = 1500,
        category = "Еда",
        date = "9.12.2024",
    )

    val expenses3: InfoExpenses = InfoExpenses(
        sum = 300,
        category = "Моб Связь",
        date = "10.12.2024",

    )

    val expensesNone = InfoExpenses (
        sum = 0,
        category = "none",
        date = "none",
    )

    val expensesPrime: fullExpenses = fullExpenses(
        list = mutableListOf(expensesNone)
    )

    expensesPrime.addNewExpenses(expenses1)
    expensesPrime.addNewExpenses(expenses2)
    expensesPrime.addNewExpenses(expenses3)
    expensesPrime.checkSum(expensesPrime.list, "Еда")
    expensesPrime.checkSum(expensesPrime.list, "Моб Связь")
    expensesPrime.checkSum(expensesPrime.list, "Интернет")



}