package builders

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/**
 * Similar  to launch async also inherit the thread of its immediate parent's coroutine scope
 * Difference is that it doesn't return the job object.
 * It returns the Deferred object of Generic type which is Sub Class of job object
 * Async also run in global level scope
 */
fun main() = runBlocking {    //  main thread

    println("Step 1:  we are in main thread name :  ${Thread.currentThread().name}")
    val num1 = 16
    val num2 = 19
    var c: Int
//    It will use to return anything after performing some operations
    val returnedValue = async {
        println("Adding two numbers in THREAD = ${Thread.currentThread().name}")     // Thread: main
        c = num1 + num2
        delay(10)
        println("Addition performed Coroutine Ended in THREAD = ${Thread.currentThread().name}")
        c // return added value in deferred object
    }

    val asyncResult = returnedValue.await() // this will give us returned value
    println(asyncResult)
//    returnedValue.join() this will wait for the job object to complete its task and  then next step proceeds
//    delay(10) it is not a right way to wait for coroutine to end
    println("Last Step main program ends: ${Thread.currentThread().name}")    // main thread
}