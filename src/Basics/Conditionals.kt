package Basics

fun main(args: Array<String>) {
    /*
    val myString = "arda"

    val myResult = if (myString != "") {
        "failed"
    } else {
        "success"
    }

    val n = "fook"
    val name = if (n == "foo") "arda" else "atakan"
    println(name)

    println(myResult)
    */

    val myValue = "atakan"
    when (myValue) {
        "arda" -> println("its Arda")
        is String -> {
            println("my result is String")
            println("another line")
        }
    }

    val whenValue = when (myValue) {
        "arda" -> {
            println("I can even tell you the name")
            "his name is arda"
        }
        is String -> {
            println("wow I am so smart")
            "this is string"
        }
        else -> {
            println("thats bad")
            "I dont know what it is"
        }
    }

    println(whenValue)

}