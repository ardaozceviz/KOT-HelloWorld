package Basics

enum class Priority(val value: Int){
    MINOR(-1){
        override fun toString(): String {
            return "Minor priority"
        }
    },
    NORMAL(0),
    MAJOR(1),
    CRITICAL(5)
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL
    println(priority) // Prints "NORMAL"
    println(priority.value) // Prints "0"
    println(Priority.CRITICAL.value) // Prints "5"
    println(Priority.CRITICAL.ordinal) // Prints "3"

    for (priorityInList in Priority.values()){
        println(priorityInList)
    }

    var p = Priority.valueOf("MAJOR")
    println(p)
}