package introduction

import java.util.*

fun main() {
    var map = TreeMap<String, Int>()

    map["A"] = 1
    map["B"] = 2
    println(map["c"]) //  here we use get function also check if given key is available or not

    for ((ch, age) in map) {
        println("Character is ${ch} it's value is ${age}")
    }
}