package builders

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *  What is Coroutine Builders ?
 *  These are the normal functions which are used to create coroutines
 *
 *  Global Coroutines : Present in the Global scope of application means get terminated only when application closes.
 *  So GlobalScope. Launch create coroutine for global scope not for local scope.
 *  Its uses are highly discourage
 *
 *  Launch Builder
 *  It will run on thread of its parent or we say it will inherit the coroutine scope of its immediate parent
 *  It is Extension Function of Coroutine scope and return Job object
 */
fun main() = runBlocking {    // It will Create a blocking coroutine that executes in current thread (main)

    println("Step 1:  we are in main thread name :  ${Thread.currentThread().name}")  // main thread

//    Job object are used to control coroutine
    val job = launch {   // launch a coroutine since it is not global, so it will run in same thread (main thread)
        println("Step 2 Coroutine Started in THREAD = ${Thread.currentThread().name}")     // Thread: main
        delay(1000)   // Coroutine is suspended but Thread: main is free (not blocked)
        println("Step 3 Coroutine Ended in THREAD = ${Thread.currentThread().name}") // Thread: main
    }

    job.join() // this will wait for the job object to complete its task and  then next step proceeds
//    delay(10) it is not a right way to wait for coroutine to end
    println("Last Step main program ends: ${Thread.currentThread().name}")    // main thread
}