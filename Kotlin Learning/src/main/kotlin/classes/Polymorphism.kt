package classes

fun main() {
    val square: Shape = Square(10.0)
    val square1: Square = Square(20.0)
    var square3: Shape = Circle(20.1)

    println(square.area())
    println(square1.area())
    println(square1.area())
}

open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(private var rad: Double) : Shape() {
    /**
     * Overriding area function which give area of our shape
     */
    override fun area(): Double {
        println("We are in Circle")
        return Math.PI * rad * rad
    }
}

class Square(private var side: Double) : Shape() {
    override fun area(): Double {
        println("We are in Square")
        return side * side
    }
}