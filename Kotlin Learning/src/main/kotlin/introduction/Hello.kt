//import java.util.TreeMap
//
//fun main(args: Array<String>) {
//
//    // var is changable and val is never change it is just like final keyword
//    val suraj = Aliens()
//    suraj.name = " Alien name "
//   println("Suraj is ${suraj.name}")
//
////    suraj = Aliens() not possible because val is not changed
//    // connection java class with kotlin class
////    var suraj2 = AlienJava()
////    "Java Alien Name".also { suraj2.name = it }
////   println("Suraj is ${suraj2.name}")
//
//    // if else statements in java we can use this  as expression as well
//    var a = 10
//    var b = 12
//
//    var result: Int;
//    result = if (a > b)
//        a
//    else
//        b
//   println(result)
//
//
////    Compare Strings in
//    var  s1 : String = "Hello"
//    var s2 : String = " "
//    if(s1 == s2)  // here == and .equals works same
//        println("Same")
//    else
//       println("Different")
//
//
////    Null value and ?
//    var n: String?= null
//    println(n?.length)
//
////    Switch case but here we use when keywords and we don't have to use break after every case
//// we can use this as expression as well
//    var v: Int = 5
//    var str: String? = when(v){
//        1 -> "One"
//        2 -> "two"
//        3 -> "three"
//        5 -> "ficve"
//        else -> null
//    }
//   println(str)
//
//// Loops
////    here we have while & do while loops as similar to Java
//
//     var j = 1..16
//    var k = 'a'..'b'
//    var l = 1 until 10
//    var p = 16 downTo 5
//     var pq = listOf<Int>(1 , 32, 3, 35, 3,5 , 3,5 , 3 , 65, 65,6,  9,796 ,7 )
//    for ((a,i) in pq.withIndex())
//       println(" $($) is printed and value ${a} and index is ${i} ")
////  Map is like map in other languages like JAVA
//
//    var map = TreeMap<String, Int>()
//
//    map["a"]= 1
//    map["b"] = 2
//   println(map.get("A"))
//
//    for ((ch , age) in map){
//      println("Character is ${ch} it's value is ${age}")
//    }
//
//
//    //// Funtions
////    println(add(4,102))
////
////    // inline function
////    println(addInline(16, 14))
////  println(max(16, 14))
////
//// //   default value function
////     println("norma ${si(2)} different form ${si(2,.1)}" )
//
//
//// Convert Sting to Java
//// we can also use Integer.pareseInt method of Java for this
//   var strr: String = "4a"
//   var num : Int = 0;
////  Exception Handling Try Catch blog
//// this is also  work as a expression
//    try {
//    num = strr.toInt()
//}catch (e : Exception){
//
//}finally {
//    println("Give proper Input")
//}
//
//    /// Extention functions
//    var my = Extensionfun()
//    my.skill = "Java"
////    my.show()
//    var your = Extensionfun()
//    your.skill = "c++"
////    your.show()
//
//    var both : Extensionfun = my.plus(your)
//    both.show()
//
////    labels @ it is just like a GO-TO statements in C+
//
//
//    outerloop@ for (i in 1..5){
//        for(j in 1..5){
//            if (j == 3){
//                break@outerloop
//            }
//            println(j)
//        }
//    }
//
//}
//
/////// normal function
////fun add(a : Int , b : Int) :Int{
////    return a+b
////}
////
////// inline function
////fun addInline(a : Int , b: Int ) : Int = a+b
////
////fun max(a:Int , b : Int) : Int = if (a>b) a else b
////
////// Default Pprameter functions
////@JvmOverloads
////fun  si(a : Int , rate :Double = .04) : Float{
////    return (a*rate).toFloat()
//
//
//}
//
//fun Extensionfun.plus( o : Extensionfun) : Extensionfun{
//    var neo = Extensionfun()
//    neo.skill = this.skill+o.skill
//    return neo
//}
