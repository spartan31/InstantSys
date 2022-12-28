package introduction

// here we are going through if else and switch cases syntax
fun main() {
//     if else statements in java we can use this  as expression as well
    var a = 10
    var b = 12

    var result: Int = if (a > b)
        a
    else
        b
    println(result)

    //    Comparing Strings
    var s1: String = "Hello"
    var s2: String = "Hello"

    if (s1 == s2)  // here == and .equals works same
        println("Same")
    else
        println("Different")


// Switch case but here we use when keywords, and we don't have to use break after every case
// we can use this as expression as well

    var v: Int = 5
    var str: String? = when (v) {
        1 -> "One"
        2 -> "two"
        3 -> "three"
        5 -> "ficve"
        else -> null
    }
    println(str)

}