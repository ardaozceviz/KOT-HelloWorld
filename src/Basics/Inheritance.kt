package Basics

open class Person {
    open fun validate (){
    }
}

open class myCustomer : Person{
    final override fun validate(){
    }

    constructor(): super(){ // constructor of the base class
    }
}

class specialCustomer: myCustomer(){
    override fun validate() { // final makes any open function to cannot be overridden in inherited classes
        super.validate()
    }
}

fun main(args: Array<String>) {
    var person = Person()
    person.validate()
}



