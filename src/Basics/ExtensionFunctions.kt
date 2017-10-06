package Basics

fun String.hello() {
    println("It's me")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

fun String.toTitleCaseWithPrefix(prefix: String): String {
    return this.split(" ").joinToString(" ") { "$prefix-${it.capitalize()}" }
}

fun main(args: Array<String>) {
    "Hello".hello()
    println("this is the string that i want to have title case".toTitleCase())
    println("this is the string that i want to have title case with prefix".toTitleCaseWithPrefix("X"))
}
