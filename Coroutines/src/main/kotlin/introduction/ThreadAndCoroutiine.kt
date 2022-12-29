package introduction

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

// Main Program wait for threads to finish but not wait for Coroutines to complete its execution

fun main() {

    // here our main thread statement 2 prints because statement is in new thread which takes very minor time to load it

    thread { // This is also known as Background thread
        println("Statement 1 : New thread name is : ${Thread.currentThread().name}")
    }

    println("Statement 2 : Current thread Name is : ${Thread.currentThread().name}")

    // We are creating a  coroutine here with Global scope (We will learn further in Details about this)
    runBlocking {
        println(" Statement 3 : We are Launch coroutine and the thread name is : ${Thread.currentThread().name}")
        delay(100)
        println("Statement 4 :  After delay the thread name is : ${Thread.currentThread().name}")
    }

    // Thread.sleep(1000) We not use Thread because it Pauses the  whole program
    // If we don't provide this delay then our main thread continuously executed and ended with executing Coroutine
    GlobalScope.launch { // coroutine created on background thread of main program
        println("Statement 5 : Thread in runblock name : ${Thread.currentThread().name}")
    //  delay(1000)
    }
    runBlocking { delay(1000) }
    println("Last Statement :  We are back to introduction.main thread after executing coroutine thread name is : ${Thread.currentThread().name}")
}