package delegations

// Without using Lazy keyword our CLASS loads automatically without it's uses but when we use Lazy Keyword class doesn't
// load automatically , load's only when things required

class HeavyClass {
    val heavy = 1000;

    init {
        println("Heavy Class Loaded in the Memory")
    }
}

class Students {
    val withLazy by lazy {
        HeavyClass()
    }
}

fun main() {
    // during time of initialisation it doesn't load in memory name is not printing
    val obj = Students()
    println("Object made with  lazy Keyword not load yet !!")
    // here name is printing during initialisation
    val obj2 = HeavyClass()
    println("Now we are going to use it then it will load in memory !!")
    println(obj.withLazy.heavy)
}