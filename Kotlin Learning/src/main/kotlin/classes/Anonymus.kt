package classes

abstract class Shapes(var name : String) {
    constructor(name : String , vararg dimensions : Int) : this(name)
      init {
          funi()
      }fun funi(){
          println("Enjoying In super Class")
      }

    abstract fun area() : Int
    abstract fun perim() : Int
}
fun main() {
    var a : Int  = 10
    var b :Int= 11
    var c : Int= 13
    var d : Int = 63
    var cc = object : Shapes("Varun", a,b,c,d){
        init {
            println("Congratulations We have created a Anonymous Parallelogram ")
            println("Area of your Parallelogram is ${area()} ")
            println("Perimeter of your Parallelogram is ${perim()} ")
        }
        override fun area(): Int = a*b*c*d
        override fun perim(): Int = a+b+c+d
    }
}