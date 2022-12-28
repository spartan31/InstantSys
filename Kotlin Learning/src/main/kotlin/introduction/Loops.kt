package introduction

fun main() {
    var j = 1..16  // it is between range 1 to 16
    var k = 'a'..'b' // range between characters
    var l = 1 until 10
    var p = 16 downTo 5  // decrement by step 1

    var list = listOf<Int>(1, 32, 3, 35, 3, 5, 3, 5, 3, 65, 65, 6, 9, 796, 7)

//    here we have while & do while loops as similar to Java

//    For loop
    for ((value, idx) in list.withIndex())
        println(" Value is $value at index $idx ")


    //    labels @ it is just like a GO-TO statements in C+
    outerloop@ for (i in 1..5) {
        for (j in 1..5) {
            if (j == 3) {
                break@outerloop
            }
            println(j)
        }
    }
}