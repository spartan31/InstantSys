package SAM

fun main() {
// without SAM conversion

    // Creating an instance of a class
    val isEven = object : IntPredicate {
        override fun accept(i: Int): Boolean {
            return i % 2 == 0
        }
    }

//    with sam conversion
    val even = IntPredicate{ it % 2 == 0}
     even.call()

    println("Is 7 even? - ${isEven.accept(7)}")
}

fun interface IntPredicate {
    fun accept(i: Int): Boolean


    fun call() {
         print("Printing non abstract method")
     }
}