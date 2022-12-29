package introduction

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *   Delay function is suspend function It is used to pause the current coroutine and after this our coroutine will
 *   continue to execute in any thread not specific that it will execute in its previous thread
 *
 *   Global Scope vs RunBlocking
 *  Global scope doesn't block the thread in which it is executing whereas RunBlocking stops the thread in which it is executing
 */

fun main() { // main thread Scope
    println("Main program started. Thread Name = ${Thread.currentThread().name}")

    GlobalScope.launch { // Thread T1 added
        println("This work is processing in thread ${Thread.currentThread().name}") // This code will continuously run on T1
        delay(100) // this will suspend the coroutine but our thread T1 continuously running it doesn't get suspended
        println("New work started in the same scope but there is no guaranty that this coroutine will be in same thread it was previously on. Thread Name: ${Thread.currentThread().name}")
    }

//    delay(1)  throws error because delay is suspending function and we need to put in any coroutine or Suspend function

    runBlocking {
        delay(100) // now we got time to execute of coroutine block
    }


}