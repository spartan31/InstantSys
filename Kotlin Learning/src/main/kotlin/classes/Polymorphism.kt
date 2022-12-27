package classes

import kotlin.math.PI

fun main() {
    var sq : Shape = Square(10.0)
    var sq2 : Square = Square(20.0)
    var sq3 : Shape = Circle( 20.1)

    println(sq.area())
    println(sq2.area())
    println(sq2.area())
}
open class Shape{
    open fun area() : Double{
        return 0.0
    }
}

class  Circle(var rad : Double) : Shape() {
    override fun area(): Double {
        println("We are in Circle")
        return Math.PI * rad * rad
    }
}

class Square(var side : Double) : Shape(){
    override fun area(): Double {
        println("We are in Square")
        return side*side

    }
}