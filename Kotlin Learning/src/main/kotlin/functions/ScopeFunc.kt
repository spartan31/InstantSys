package Functions

class Person {
    var name = "Krishan"
    var age = 21
}

class ScopeFunc {
}

fun main() {
    var ob = Person()
    println(ob.age)
    println(ob.name)

//    With scope function it's return type is lambda and context is object this

    val result = with(ob) {
        println(this.name)
        println(this.age)
        age + 5
    }
    println(result)

//    Apply keyword .
//    1> This will return object of class

    val pp = Person().apply {
        this.name = "New Name"
        this.age = 23
    }


//    Also keyword used to perform some task after specific task

    val list = mutableListOf<Int>(1, 32, 5, 6, 5, 8)

    println(list)
    list.also {
        it.add(10)
        it.remove(32)
        println(it)
    }


}
