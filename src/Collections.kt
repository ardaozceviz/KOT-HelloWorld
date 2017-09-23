fun main(args: Array<String>) {

    val walnuts = listOf("arda", "oana", "atakan")
    println(walnuts)
    println(walnuts.sorted())
    println(walnuts[1])
    println(walnuts.first())
    println(walnuts.last())
    println(walnuts.contains("arda"))
    println(walnuts.contains("ooana"))

    val apple = arrayListOf("iphone", "ipad", "mac")
    println(apple.size)
    apple.add(1,"imac")
    println(apple)
    println(apple.indexOf("imac"))

    apple.remove("iphone")
    println(apple)

    val appleProductsMap = mapOf("3G" to "iphone", "air" to "macBook", "iPad pro" to "ipad")
    println(appleProductsMap["3G"])
    println(appleProductsMap.get("air"))
    println(appleProductsMap.getOrDefault("pro", "this product does not exist"))

    val appleProducts = hashMapOf("3G" to "iphone", "air" to "macBook", "iPad pro" to "ipad")
    appleProducts["3G"] = "iphone+"
    appleProducts.put("mp3", "ipod")
    println(appleProducts)
    appleProducts.remove("3G")
    println(appleProducts)
    appleProducts.clear()
    appleProducts.isEmpty()
}