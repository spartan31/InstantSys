package classes
// This class is used as a wrapper class for primitive data types. It doesn't take memory space as like object just hold
//  the data. It helps us when we pass two same parameters and shuffle them without showing compilation error.

@JvmInline
value class Height(val h: Int)

@JvmInline
value class Width(val w: Int)
class Rectangle(var height: Height, var width: Width) {
    fun rectangleDetails() {
        println("Height is : $height and Width is $width")
    }

}

fun main(){
//    var obj1 = Rectangle(10 ,11)
//    obj1.rectangleDetails()
//    var obj2 = Rectangle(11 , 10) here parameter of width and Height changed it will swap the Width and height without throwing error
//     So we introduced Inline classes provide a wrapper Inline class to Primitive data types.
    var h = Height(5)
    var w = Width(6)
    var obj3 = Rectangle(h, w)
//  var obj4 = Rectangle(w,h) here this will give compile time error save us.
    obj3.rectangleDetails()
}