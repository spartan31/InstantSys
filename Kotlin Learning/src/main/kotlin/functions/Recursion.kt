package functions

//main method
fun main() {
    // DelegateProperty Recursion
    val num = 10
    println("Factorial of $num is: " + factorialFinder(num))

//    In Tail recursion, we perform the calculation first along-with executing the recursive call, and pass the results
//    of the current step to the next recursive call
//    It help us to save stack space and optimize our program

    println("Factorial of $num Using Tail Recursion is: " + factorialUsingTailRecursion(num, 1))
}

/**
 *factorial of number using recursion
 */
fun factorialFinder(num: Int): Long {
    return if (num == 1) num.toLong()        // terminate condition or base case
    else num * factorialFinder(num - 1)
}

/**
 * factorial using Tail Recursion
 */
tailrec fun factorialUsingTailRecursion(num: Int, answerForwardedToNextCall: Int): Long {
    return if (num == 1)   // terminate condition
        answerForwardedToNextCall.toLong()
    else
        factorialUsingTailRecursion(num - 1, answerForwardedToNextCall * num)   //tail recursion
}