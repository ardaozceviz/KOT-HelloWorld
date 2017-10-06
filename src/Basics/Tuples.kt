package Basics

fun capitalAndPopulation(city: String): Pair<String, Long>{
    return Pair("Madrid", 23000000)
}

fun countryInformation(country: String): Triple<String, String, Long>{
    return Triple("Istanbul", "Europe", 20000000)
}

fun main(args: Array<String>) {
    val capitalPopulation = capitalAndPopulation("Madrid")
    val countryInformation = countryInformation("Istanbul")

    println(capitalPopulation.first)
    println(countryInformation)
}