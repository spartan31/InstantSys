package functions

// It is passing function in functions or returning function from function.
// We mostly pass or return  Lambda functions in this

fun main() {
    var s = ::sum
    highOrder(10, 1, s)
}

fun highOrder(a: Int, b: Int, nested: (d: Double, e: Double) -> Double) {
    val result = nested(10.0, 20.0) + a + b
    println(result)
}

fun sum(a: Double, b: Double): Double {
    return a + b
}