package classes
// here  when we pa
class InlineClass {
}
@JvmInline
value  class Height(val h : Int)
@JvmInline
value  class Width(val w : Int)
class Rectangle(var height : Height  , var width : Width){
      fun getParam(){
          println("height is : $height and Width is $width")
      }

//    fun area() : Int{
//        return height * width
//    }
}
fun main() {
//    var obj1 = Rectangle(10 ,11)
//    obj1.getParam()
//    var obj2 = Rectangle(11 , 10) here parameter of widht and Height changed
//     So we introduced Inline classes provide a wrapper Inline class to Primitive data types.
    var h = Height(5)
    var w = Width(6)
    var obj3 = Rectangle(h,w)
//    var obj4 = Rectangle(w,h) here this will give error and prevent error

}