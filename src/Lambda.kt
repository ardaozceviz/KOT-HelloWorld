import javax.annotation.processing.Completion

fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message) }
    printMessage("arda ozceviz")

    val sumA = { x: Int, y: Int -> println(x + y) }
    sumA(3, 5)

    val sumB: (Int, Int) -> Int = { x, y -> x + y }
    sumB(4, 5)

    fun downloadData(url: String, completion: () -> Unit) {
        // sent,d a download request
        // we got back data
        // there were no errors
        completion()
    }
    // call download data function
    downloadData("fakeUrl.com", {
        println("The code in this block," +
                "will only run after the completion()")
    })

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // send download request
        // we got car data
        val car = Car("Tesla", "ModelX", "red")
        completion(car)
    }

    downloadCarData("fakeUrl.com") { car ->
        println(car.color)
        println(car.model)
    }

    // we can use it if there is only one parameter inside the completion()
    downloadCarData("fakeUrl.com") {
        println(it.color)
        println(it.model)
    }

    fun downloadTruckData(url: String, downloadTrcukComplete: (Truck?, Boolean) -> Unit) {
        // make the web request
        // we get the result back
        val webRequestSuccess = false
        if (webRequestSuccess) {
            // we received truck data
            val truck = Truck("Ford", "F-150", 10000)
            downloadTrcukComplete(truck, true)
        } else {
            downloadTrcukComplete(null, false)
        }
    }

    downloadTruckData("fakeUrl.com") { truck, success ->
        if (success) {
            // do something with our truck
            truck?.tow()
        } else {
            // handle the web request failure
            println("something went wrong")
        }
    }
}