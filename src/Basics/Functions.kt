package Basics

fun hello() {
    println("Hello")
}

fun throwingExceptions(): Nothing {
    throw Exception("This function throws an Exception")
}

// Giving a default value to the variable makes it optional to pass
fun add(x: Int, y: Int, z: Int = 0) = x + y + z

fun welcome(name: String) {
    println("Welcome to kotlin $name")
}

fun printDetails(name: String, email: String = "", phone: String) {
    println("name: $name - email: $email - phone: $phone")
}

fun printStrings(vararg strings: String){
//    for (string in strings){
//        print(string)
//    }
//    print("\n")
    printStringsv2(*strings)
}

fun printStringsv2(vararg strings: String){
    for (string in strings){
        println(string)
    }
}

fun main(args: Array<String>) {
    hello()
    //throwingExceptions()
    add(5, 5)
    add(1, 2, 3)
    welcome("arda")
    printDetails("arda", phone = "555-444-3223")
    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3", "kotlin")
}


