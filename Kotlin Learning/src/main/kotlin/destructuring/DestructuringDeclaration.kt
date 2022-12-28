package destructuring

// this is only for data class
data class DestructClass(var c: Int, var d: Int) {
}

class NonDestruct(var first: Int, var second: Int) {}

fun main() {
    val obj = DestructClass(10, 5)
    println(DestructClass(10, 5).component1())
    var (first, second) = obj
    var (_, next) = obj

    val obj2 = NonDestruct(20, 25)
//    var  (a,b) = obj2 Not possible because obj2 is not an object of data class
}