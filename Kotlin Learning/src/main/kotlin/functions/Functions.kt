package functions

fun main() {
    var a = 10
    // Normal Functions
    println(check(a))

    //  Default Parameter function
    println(defaultParameter(10))

    // Inline Functions
    val inl = addInline(10, 5)


}

// here function  can take default value if we don't pass any value to them
fun check(a: Int): Int {
    println(a)
    var a = 1
    println(a)
    return a
}

fun addInline(a: Int, b: Int): Int = a + b

fun defaultParameter(a: Int, rate: Double = .04): Float {
    return (a * rate).toFloat()
}