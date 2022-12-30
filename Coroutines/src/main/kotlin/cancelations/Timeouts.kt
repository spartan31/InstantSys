package cancelations

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

/**
 * Timeouts are Builder functions just like launch , async etc.
 * Two types 1. WithTimeout or WithTimeoutNull
 * If our code didn't complete in mentioned time than Timeout exception thrown.
 *
 * WithTimeout : Throw time out exception
 * WithTimeoutNull : Doesn't Throw any Exception this will give some value
 */

fun main() {
    runBlocking {

//        withTimeout(2000){ // this will throw error after 2000ms
//            try {
//                for (i in 1..100){
//                    print("$i .")
//                    delay(100)
//                }
//            }catch (ex : TimeoutCancellationException){
//                println(" Time Over !! ")
//            }finally {
//                println("Finally B lock executed")
//            }
//        }

        val c: Int? = withTimeoutOrNull(200) {// this will return any value if completed or null if not completed
            for (i in 1..100) {
                    print("$i .")
                    delay(100)
                }
            10
        }
        if(c != null){
            println("Coroutines Completely Executed")
        }else{
            println("Coroutines not Executed Completely")
        }
    }
}