package sam

// Single abstract Method Functions
fun main() {
//      without SAM conversion
//    Creating an instance of a class
    val isEven = object : SamFunction {
        override fun abstractMethod(i: Int): Boolean {
            return i % 2 == 0
        }
    }

//    with sam conversion
    val even = SamFunction { it % 2 == 0 }
    even.defaultMethod()

    println("Is 7 even? - ${isEven.abstractMethod(7)}")
}

fun interface SamFunction {
    fun abstractMethod(i: Int): Boolean
    fun defaultMethod() {
        println("Printing non abstract method")
    }
}