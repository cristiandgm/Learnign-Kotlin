import java.util.*

fun main(args: Array<String>) {
    //dateOfWeek()

    // print the same
    //println("${if(args[0].toInt() < 12)"Good Morning, Kotlin" else "Good Night, Kotlin"}")
    //if(args[0].toInt() < 12) println("Good Morning, Kotlin") else println("Good Night, Kotlin")
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