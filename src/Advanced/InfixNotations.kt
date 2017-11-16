package Advanced

// fun String.shouldBeEqualTo(value: String) = this == value

infix fun String.shouldBeEqualTo(value: String) = this == value

fun main(args: Array<String>) {
    val output = "Hello"

    println(output.shouldBeEqualTo("Hello"))

    // Thanks to infix functions we can make it much more readable as shown below.
    println(output shouldBeEqualTo "Hello")
}