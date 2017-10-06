package Basics

class Service {
    fun evaluate() {}
}

class ServiceProvider {
    fun cratesServices(): Service? {
        return Service()
    }
}

fun createsServiceProvider(): ServiceProvider? = ServiceProvider()

fun main(args: Array<String>) {
    val nullMessage: String? = null
    val inferredNull = null


    if (nullMessage != null) {
        println(nullMessage.length)
    }

    // if the value is not null then invoke the method length on it if its then don't do it
    println(nullMessage?.length)

    // I know what I am doing, let me do my own thing. If I get null pointer exception its my problem
    println(nullMessage!!.length)

    val sp = createsServiceProvider()
    sp?.cratesServices()?.evaluate()

}