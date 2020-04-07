import java.util.*

fun main(args: Array<String>) {
    dateOfWeek()
}

fun dateOfWeek() {
    println("What day is today?")
    var i: Int = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when(i) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
    }
}