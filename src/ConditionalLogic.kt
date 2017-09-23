fun main(args: Array<String>) {
    val a = 2
    val b = 3

    if (a == b) {
        println("$a = $b")
    }

    if (a !=b) {
        println("a does not equal b")
    }

    val accountBalance = 100
    val price = 500

    if(accountBalance >= price) {
        println("you can buy this")
    } else {
        print("you cannot buy this")
    }

    println("\n")
    val x = 3

    when (x) {
        1 -> println("x is equal 1")
        2 -> print("x is equal 2")
        else -> println("x does not equal 1 or 2")
    }
}