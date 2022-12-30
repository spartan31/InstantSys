package builders

import kotlinx.coroutines.*

/**
 *  Run blocking blocks the current thread and run its own coroutine and not suspend until its completion.
 *  We can say they are just like thread. That's we don't use them as a coroutines mostly. We use them in testing
 *  purpose mostly.
 */
fun main() {

    println("This is main thread. Thread name is ${Thread.currentThread().name}")
    runBlocking {
        println("We are know in run blocking coroutine. Thread name  is ${Thread.currentThread().name}")
        delay(100)
        // this will not terminate until complete its execution
    }
    println("Main function ENDED")
}