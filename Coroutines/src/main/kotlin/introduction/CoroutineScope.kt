package introduction

import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Coroutine scope referred to what kind of coroutine we have created
 */
fun main()  {
    runBlocking {
        println("Scope name is $this")
        launch {
            println("Parent launch scope name : $this")

            // adding child coroutine scope
            launch {
                println("Child coroutine scope name : $this")
            }
        }

        async {
            println("In aysnc scope name : $this")
        }
    }
}