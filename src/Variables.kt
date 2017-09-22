fun main(args: Array<String>) {
    //String
    var name = "ArdaO" // var variables can be changed later in the code
    val surname = "Ozceviz" // val cannot be reassigned. its static

    //Boolean
    var isAwsome = true
    isAwsome = false
    println("Is " + name + " awsome? The answer is: " + isAwsome)

    //Integer
    var a = 3
    var b = 6
    println(a + b)

    //Double -> for decimals numbers 64bit number
    //Float -> for decimals 32bit number
    val doubleNum = 123.43
    val floatNumber = 123.45f

    //Long -> 64bit
    val longNumber = 1234123124534123423L

    val aString = a.toString()
}