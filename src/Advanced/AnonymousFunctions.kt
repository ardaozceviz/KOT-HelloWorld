package Advanced

fun op(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {
    op(3, { it * it })
    op(3, { x -> x * x })

    // With anonymous functions I can have multiple return points
    // whereas with the lambda expression I can't do that
    op(3, fun(x): Int { return x * x })

    op(3, fun(x): Int {
        return if (x > 10) {
            0
        } else {
            x * x
        }
    })
}