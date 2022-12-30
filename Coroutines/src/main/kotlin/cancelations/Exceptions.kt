package cancelations

import kotlinx.coroutines.*

/**
 * Cancellable suspending functions throws CancellableExceptions when we cancel coroutine Example :- Delay ,Yield , isActive etc.
 */

fun main()= runBlocking(){
    val obj = launch {

        try {
            for (i in 1.. 500){
                print("$i. ")
                delay(10)
            }
        }catch (ex :CancellationException){
            println()
            println("Exception Handled Safely")
        }finally {
            println("Finally block Executed")
        }
    }
    delay(200)
    obj.cancelAndJoin()
//    println()
    println("Main Ended")
}