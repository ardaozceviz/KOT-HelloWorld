package Basics

fun main(args: Array<String>) {
    // Prints out 1 to 100
    for (a in 1..100) {
        println(a)
    }

    // List of numbers between the range
    val numbers = 1..100

    for (a in numbers) {
        println(a)
    }

    for (a in 100 downTo 1) {
        println(a)
    }

    for (a in 100 downTo 1 step 5 * 5) {
        println(a)
    }

    val capitals = listOf("Bucharest", "Istanbul", "Berlin", "Moscow")
    for (capital in capitals) {
        println(capital)
    }

    var i = 100
    while (i > 0) {
        i--
    }

    var x = 10
    do {
        x--
        println(x)
    } while (x > 0)


    // Prints out the relatively prime (coprime) numbers within the given range
    for (i in 1..10) {
        for (j in 1..10) {
            if (j % i == 0 || i % j == 0) {
                continue
            }
            println("i=$i, j=$j")
        }
    }

    loopTag@ for (i in 1..10) {
        for (j in 1..10) {
            if (j % i == 0) {
                break@loopTag
            }
            println("i=$i, j=$j")
        }
    }
}