package Basics

object Global {
    val pi = 3.141569
}

fun main(args: Array<String>) {
    var localObject = object {
        val pi = 3.14
    }

    println(Global.pi)
    println(localObject.pi)

}