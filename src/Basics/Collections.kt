package Basics

fun main(args: Array<String>) {
    val numbers = 1..100

    val cities = listOf("London", "Istanbul", "Bucharest")

    val mutableCities = mutableListOf("Istanbul")
    mutableCities.add("Bucharest")

    val hashMap = hashMapOf(Pair("Istanbul", "Turkey"), Pair("Bucharest", "Istanbul"))
    val booleans = booleanArrayOf(true, true, false)
    val characters = charArrayOf('A', 'B', 'C')

}
