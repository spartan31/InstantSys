package `Delecations'`
class HeavyClass{
    val p = 1000 ;
    init {
        println("Heavy Class Loaded in the Memory")
    }
}
// Without using Lazy keyword our cLASS loads automatically without it's uses but when we use Lazy Keyword class doesnt
// loads automatically , loads only when things required
class Studen{
    val cc by lazy{
        HeavyClass()
    }
}
fun main() {
    val c = Studen()
    println(c.cc.p)
    println(c.cc.p)
    println(c.cc.p)
    c.cc
    c.cc
}