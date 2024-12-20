package pr1

class InfoExpenses(
    val sum: Int,
    val category: String,
    val date: String,
) {
    fun show() {
        println("Сумма расхода - $sum₽\nКатегория - $category\nДата - $date\nОписание - без описания")
    }

    constructor(sum: Int, category: String) : this(sum, category, "не указана") {
        println("Создан объект с суммой $sum и категорией $category, дата не указана.")
    }
}
