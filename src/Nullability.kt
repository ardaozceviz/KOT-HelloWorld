fun main(args: Array<String>) {
    var name = "ArdaO"
    //name = null

    var nullableName: String? = "Do I really exist?"
    nullableName = null

    var length = 0
    // Null check
    if (nullableName != null) {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    val l = if (nullableName != null) nullableName.length else -1
    println(l)

    // Second method Safe Call Operator ?
    println(nullableName?.length) // Print the value if it is not null, if so print null

    // Third method Elvis Operator
    var len = nullableName?.length ?: -1
    var noName = nullableName ?: "No one knows me..."
    println(noName)

    //!!
    println(nullableName!!.length)


}