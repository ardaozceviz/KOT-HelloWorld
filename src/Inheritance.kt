// In order to have an inheritable class, it has to be declared as "open"
open class Vehicle(val brand: String, val model: String) {
    open fun accelerate() {
        println("vroom vroom")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun breake() {
        println("STOP")
    }

}

class Araba(brand: String, model: String, var color: String) : Vehicle(brand, model) {
    override fun accelerate() {
        println("We are going ludicrous mode!")
        super.accelerate() // this allows us to keep the first funtion and add our new function on it
    }
}
class Kamyon(brand: String, model: String, var towingCapacity: Int) : Vehicle(brand,model) {
    fun tow (){
        println("headed out to the mountains")
    }
}

fun main(args: Array<String>) {
    val tesla = Araba("Tesla", "ModelS", "Blue")
    val kamyon = Kamyon("Ford", "F-150", 10000)
    tesla.breake()
    tesla.accelerate()
    kamyon.tow()
}