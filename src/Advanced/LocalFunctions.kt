package Advanced

fun foo(fooParam: String) {
    val outerFunction = "Value + $fooParam"
    fun bar(barParam: String) {
        println(fooParam)
        println(barParam)
        println(outerFunction)
    }
    bar("Bar")
}

fun main(args: Array<String>) {
    foo("Hello from main()")
}