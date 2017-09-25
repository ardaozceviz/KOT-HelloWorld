/*
class Car constructor(brand: String, model: String){
    val brand = brand
    val model = model
}
*/

class Car(val brand: String, val model: String, var color: String) {
    fun accelerate() {
        println("vromm vroom")
    }

    fun details(){
        println("This is a $color $brand $model")

    }
}

class Truck(val brand: String, val model: String, val towingCapacity: Int) {
    fun tow() {
        println("taking the horses to the rodeo")
    }

    fun details(){
        println("This is $brand $model has a towing capacity of $towingCapacity lbs")
    }
}

fun main(args: Array<String>) {

    val car = Car("Mercedes", "AMG","orange")
    println(car.brand)
    println(car.model)
    car.accelerate()
    car.details()

    val truck = Truck("Ford", "F-150",10000)
    truck.tow()
    truck.details()
}