package Basics

// This is a high order function. This function takes two parameters as well as another function as a parameter which returns Int
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y


fun route(path: String, vararg actions: (String, String) -> String) {

}

fun unaryOperation(x: Int, op: (Int) -> Int) {

}

// High order function which takes Database object as well as a function which takes nothing and returns Unit which means returns nothing
fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        fun commit() {}
    }
}

class Database {
    fun commit() {}
}

fun main(args: Array<String>) {
    println(operation(1, 2, ::sum))

    println(operation(1, 2, { x, y -> x + y }))

    println(operation(1, 2, { x: Int, y: Int -> x + y }))

    // val sumLambda = { x, y -> x + y } // This wont work because compiler doesn't know what x and y is

    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }

    val sumLambdaV2: (Int, Int) -> Int
    sumLambdaV2 = { x, y -> x + y }

    println(sumLambdaV2(5, 2))

    // Those below are all the same
    unaryOperation(2, { x -> x * x })
    unaryOperation(2, { it * it })
    unaryOperation(2) { it * it }

    val db = Database()

    transaction(db) {
        // taking this code and running up in the function
        // interact with database
    }

    // anonymous function
    unaryOperation(3, fun(x: Int): Int { return x * x })

}