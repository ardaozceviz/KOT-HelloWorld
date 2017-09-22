fun main(args: Array<String>) {
    val str = "May the force be with you."
    println(str)

    val str1 = "He said \"la la la\""
    val str2 = "Arda \nOzceviz\t24"

    println(str1)
    println(str2)

    val rawCrawl = """|A long time ago,
        |in a glaxy
        |far, far away...
        |BUM BUM BUMMMMMMM""".trimMargin() //Trim will mark where the pipes are
    println(rawCrawl)

    for (char in str) {
        println(char)
    }

    val contentEquals = str.contentEquals("Ma the force be with you.")
    println(contentEquals)

    val contains = str.contains("Force", false)
    println(contains)

    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()
    println(uppercase)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4,13)
    println(subsequence)

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 24

    println("$luke has a $lightSaberColor lightsaber and drives $vehicle and is $age age years old.")
    println("Lukes full name $luke has ${luke.length} characters")
}