fun main(args: Array<String>) {
    val apple = arrayListOf("iphone", "ipad", "mac")
    val appleProducts = hashMapOf("3G" to "iphone", "air" to "macBook", "iPad pro" to "ipad")

    for (product in apple) {
        println("Product: $product")
    }

    for ((model, product) in appleProducts) {
        println("$model is the product of $product")
    }

    var x = 10

    while (x > 0) {
        println(x)
        x--
    }
}