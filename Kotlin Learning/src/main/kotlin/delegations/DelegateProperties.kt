package delegations
import kotlin.properties.Delegates

fun main() {
    var obj = Normal()
    println("Current value is ${obj.obserDele}")
    obj.obserDele = 999

    println("Now vetoable delegates --------------------------------------------------")

    println("Current value is ${obj.vetoDele}")
    obj.vetoDele = 9
    println("Current value is ${obj.vetoDele}")
    obj.vetoDele = 987
}

class Normal{
    var obserDele: Int by Delegates.observable(initialValue = 50) { property, oldValue, newValue ->
        println("Old value is $oldValue")
        println("New value is $newValue")
    }

//     Vetoable Delegates mostly similar to observable only difference is that it is also able to set value on certain condition
    var vetoDele: Int by Delegates.vetoable(initialValue = 20) { property, oldValue, newValue ->
        println("Old Value is ${oldValue}")
        println("New Value is ${newValue}")
        newValue >= 10
    }

}