package Functions

class HigherOrderFn {
}

fun main() {
    var s = ::sum
    highorder(10, 1, s)

}

fun highorder(a : Int , b : Int , gn : ( d : Double , e : Double) -> Double){
    val result = gn(10.0 , 20.0) +a +b
    println(result)
}

fun sum(a : Double , b : Double):Double{
    return a+b
}