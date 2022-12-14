package functions

fun main() {
    val lambda = { x: Int, y: Int -> x + y }

    /**
     * Multi Line Lambda Function
     */
    var multiline: () -> (String) = {
        "This is Multiline lambda program"
    }

    /**
     * Single Line Lambda Function
     */
    val lambda2: (Int) -> Int = { x -> x * x }
    val sayHi: (String) -> Unit = { print("Varun Hii") }

/// this is for Only Single argument
    var simplestform: (String) -> Unit = { print(it) }
    println(lambda(10, 12))
    println(multiline())

    println(simplestform("Here we know use of it Keyword"))
}