package suspendingfuntions

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val taskA = async { worker("A") }
        val taskB = async { worker("B") }
        // Here we didn't use taskA and taskB but our program prints things in worker function. Which means it will
        // run the function at time of declaration means they are waisting system resources.

        val taskC = async(start = CoroutineStart.LAZY) { worker("C") }
        val taskD = async(start = CoroutineStart.LAZY) { worker("D") }
        // to make it loads only when it needed we are passing extra parameter
        // Lazy is similar to Lazy we learned previously in Kotlin.
        println("${taskC.await()} \n${taskD.await()}")
    }
}

suspend fun worker(taskName: String): String {
    println("$taskName is in Progress")
    delay(10)
    return "$taskName Completed"
}