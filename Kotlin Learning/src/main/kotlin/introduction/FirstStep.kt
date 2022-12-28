import introduction.JavaClass

// Introduction to basic syntax of Kotlin

fun main(args: Array<String>) {
// var is changable and val is never change it is just like final keyword
    val unchangable: Int = 10
//     unchangable = 20  not possible because it's val

    var changeable: Int = 12
    changeable = 21  // Possible because changeable is of var type

//     connection java class with kotlin class
    var javaConnection = JavaClass()
    println(javaConnection.name)


//    Null value and ?
    var n: String? = null
    println(n?.length)


// Some strings conversions
// we can also use Integer.parseInt method of Java for this
    var strr: String = "4a"
    var num: Int = 0;


//  Exception Handling Try Catch blog
// this is also  work as expression
    try {
        num = strr.toInt()
    } catch (e: Exception) {

    } finally {
        println("Give proper Input")
    }

}

