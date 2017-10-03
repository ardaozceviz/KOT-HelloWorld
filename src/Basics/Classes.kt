package Basics

class Customer (val id: Int, var name:String = "") {
    init {
        name = name.toUpperCase()
    }

    // if we need secondary constructor
    constructor(email: String): this(0,""){

    }

    // Here we are making a writable property that we can write any time
    var socialSecurityNumber: String = ""
        // here our custom setter
        set(value) {// "value" is equal to "socialSecurityNumber", this value can be named anything
            if (!value.startsWith("SN")){
                throw IllegalArgumentException("Social security should start with SN")
            }
            // field is that special field in kotlin that holds the actual property
            // field name is important, we cannot name something else
            field = value
        }
}

data class Book(var author: String = "", var price: Int = 0){
    fun printPriceAuthor(){
        println("$author, $price")
    }

}

fun main(args: Array<String>) {
    val customer = Customer(1,"arda")
    val customer2 = Customer(1)

    customer.socialSecurityNumber = "SN123"
    println(customer.id)
    println(customer.name)
    println(customer.socialSecurityNumber)

    val myBook = Book()
    myBook.author = "arda"
    println(myBook.author)
    myBook.printPriceAuthor()
}