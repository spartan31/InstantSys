package nullsafety
// One of the best feature of Kotlin language which save us from Null Pointer Exception Error.

fun main() {
    val s: String? = "Suraj"
    val n: String? = null

//   1. Safe Call operator ?.
//  println(" length of not null string is ${s.length}")  this is giving error because we are not checking Nullability of this
    println(" length of null string is ${n?.length}")

//  2.Safe call with let operator
    s?.let {
        println("$s is not Null ")
    }

//  3. Elvis operator ?: it is like if else
    var p = n?.length ?: -1
    println(p)

//  4. Not Nul operator !!
//   We use it when we are 100% sure that our parameter is not null , with use this in place of safe call operator
//     var q = n!!.length   this will give error because n is null
    var q = s!!.length
    println(q)

}