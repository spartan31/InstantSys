package Functions
fun Tany() : String{
    return "Hi"
}
fun main() {
    val lambda = {x:Int , y : Int -> x+y}

    var multiline : ()-> (String) = {
        "This is Multiline lambda program"
    }

    val lambda2 : (Int)->Int = {x -> x *  x }


    val sayHi : (String)-> Unit = { print("Varun hii") }

/// this is for Only Single argument
    var simplestform : (String)-> Unit = { print(it) }
    println(lambda(10,12))
    print(multiline())
}