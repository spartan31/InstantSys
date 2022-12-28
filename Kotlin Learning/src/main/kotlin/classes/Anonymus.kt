package classes

abstract class Shapes(var name: String) {
    constructor(name: String, vararg dimensions: Int) : this(name)

    init {
        func1()
    }

    private fun func1() {
        println("We are in super Class")
    }

    abstract fun area(): Int
    abstract fun peri(): Int
}

fun main() {
    val a: Int = 10
    val b: Int = 11
    val c: Int = 13
    val d: Int = 63
    var obj1 = object : Shapes("Varun", a, b, c, d) {
        init {
            println("Congratulations We have created a Anonymous Parallelogram ")
            println("Area of your Parallelogram is ${area()} ")
            println("Perimeter of your Parallelogram is ${peri()} ")
        }

        override fun area(): Int = a * b * c * d
        override fun peri(): Int = a + b + c + d
    }
}