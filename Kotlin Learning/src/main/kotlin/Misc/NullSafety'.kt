package Misc

fun main() {
    var s: String? = "Suraj"
    var n: String? = null

//   1. Safe Call operator ?.
//  println(" length of not null string is ${s.length}")  this is giving error because we are not checking Nullibility of this
    println(" length of null string is ${n?.length}")

//  2.Safe call with let operator
    s?.let {
        println("$s is not Null ")
    }

//  3. Elvis operator ?: it is like if else
    var p = n?.length ?: -1
    println(p)

//  4. Not Nul operator !!
//   We use it when we are 100% sure that our paramteer is not null , with use this in place of safe call operator
//     var q = n!!.length   this will gives error becuse n is null
       var q = s!!.length
    println(q)

}