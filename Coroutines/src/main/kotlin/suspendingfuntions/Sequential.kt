package suspendingfuntions

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

// By default functions run sequentially in Coroutines
fun main() = runBlocking{
    val timeTaken = measureTimeMillis {
        val taskOne = taskA()
        val taskTwo = taskB()
        println("Both task is completed and fetch $taskOne$taskTwo ")
    }
    // to check how much tasks running parallel or One after One we add delay
    println("Total time taken by both task is $timeTaken which is approx sum of individual task time means task are running sequentially")
}

suspend fun taskA() : String {
    delay(100)
    return "My Full Name : Krishan"
}

suspend fun taskB() : String{
    delay(100)
    return " Yadav"
}