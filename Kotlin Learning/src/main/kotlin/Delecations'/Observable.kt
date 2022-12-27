package `Delecations'`

import kotlin.properties.Delegates

fun main() {
    var p = Normal()
//    p.mr = 10
//    p.mr = 1000

    // Vetoble Delegates
    println("Current value is ${p.cr}")
    p.cr = 9
    println("Current value is ${p.cr}")
    p.cr = 987
    println("Current value is ${p.cr}")
}

class Heavy {
    init {
        println("Heavy cLASS is loaded")
    }
}
class Normal {
    var mr: Int by Delegates.observable(initialValue = 50) { property, oldValue, newValue ->
        println("Old value is $oldValue")
        println("New value is $newValue")
    }
/// Vetoble Delegates here

    var cr : Int by Delegates.vetoable(initialValue = 20){property, oldValue, newValue ->

        println("Old Value is ${oldValue}")
        println("New Value is ${newValue}")
        newValue >= 10
    }


}