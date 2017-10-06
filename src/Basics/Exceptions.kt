package Basics

class NotANumberException(message: String) : Throwable(message)

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Double, Float, Long -> throw NotANumberException("This is not a number")
    }
}

fun main(args: Array<String>) {
    try {
        checkIsNumber("arda")
    } catch (e: IllegalArgumentException) {
        println("Do nothing")
    } catch (e: NotANumberException) {
        // println("It was not a number")
        println("${e.message}")
    } finally { // finally block, if finalises even exception is thrown. anything bad can happen this code will still execute
        println("This is from final part")
    }
}