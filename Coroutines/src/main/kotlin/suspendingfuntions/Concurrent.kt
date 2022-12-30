package suspendingfuntions
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// Concurrent Means Parallel
fun main() {
    // Both the launch blocks run Parallel here
    runBlocking {
        launch {
            for (i in 1..10) {
                print("A = $i ")
                delay(10)
            }
        }
        launch {
            for (i in 1..10){
                print("B = $i ")
                delay(10)
            }
        }
    }
}