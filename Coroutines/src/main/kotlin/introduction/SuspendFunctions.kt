package introduction

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// A suspending function are function with suspend modifiers.
// They are only allowed to be called from a coroutine or other suspended functions.

fun main() = runBlocking {
    callSuspendingFunction()
}

suspend fun callSuspendingFunction() = coroutineScope {  // this: CoroutineScope
    launch {
//         delay(1000L)
        println("In nested coroutine scope thread name ${Thread.currentThread().name}")
    }
    // it will directly run in main thread so execute first. After this coroutine part will execute
    delay(1) // Small delay change the execution flow of program
    println("In functions main scope thread name ${Thread.currentThread().name}")
}