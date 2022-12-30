package cancelations

import kotlinx.coroutines.*

/**
 * If coroutine is taking longer time, or we didn't require a result done by coroutine at that time we want to cancel it.
 * To cancel coroutine it should be cooperative
 * To make a coroutine cooperative then we should have to use suspend functions  or functions belongs to
 * kotlinx.coroutine package in it. Example : Delay , yield , Timeout etc.
 */
fun main() = runBlocking {
    val obj = launch(Dispatchers.Default) {
        for (i in 1..500) {
            if (!isActive){ // isActive function add advantage to coroutines over Thread adding extra boolean parameter to check is it active or not
                return@launch // or we can use break also
            }
            print("$i ")
//          Thread.sleep(50) when we use this our cancel not work
            delay(50) // when us this our main thread is only waiting for 200ms(line 21) only and the obj.cancel stops coroutine
//          yield() this function is to make coroutine cancelable without using delay. It is faster than delay function.
        }
    }
    delay(200)
//    obj.cancel() // it doest affect our code because there is no suspend function in our coroutine block
    obj.join() // this will wait launch block to completely execute and then main end.
//  obj.cancelAndJoin() instead of using cancel and join separately we use single function which implements both of them
    println("Main program Ended")
}