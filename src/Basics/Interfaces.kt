package Basics

interface CustomerRepository{
    val isEmpty : Boolean
        get() = true
    fun store(obj: Customer){
        // implement code to store
    }

    fun getById(id: Int): Customer
}

class SQLCustomerRepository: CustomerRepository{
    override fun getById(id: Int): Customer {
        return Customer(1)
    }

    override fun store(obj: Customer) {
        super.store(obj)
    }

    override val isEmpty: Boolean
        get() = false
}

interface interface1{
    fun funA(){
        println("This is from interface1")
    }
}

interface interface2{
    fun funA(){
        println("This is from interface2")
    }
}

class Class1and2: interface1,interface2{
    override fun funA() {
        super<interface2>.funA() // since base class implements functions that called same from different interfaces we have to specify that we are referring to which interface. in this case to "interface2"
    }

}
fun main(args: Array<String>) {

    val c = Class1and2()
    c.funA()
}