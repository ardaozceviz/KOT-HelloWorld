package Basics

// This is a high order function. This function takes two parameters as well as another function as a parameter which returns Int
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y


fun route(path: String, vararg actions: (String, String) -> String){

}

fun main(args: Array<String>) {
    println(operation(1, 2, ::sum))
}