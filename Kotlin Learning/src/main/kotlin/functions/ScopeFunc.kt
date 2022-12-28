package functions

class Person {
    var name = "Krishan"
    var age = 21
}

fun main() {
    var ob = Person()
    println(ob.age)
    println(ob.name)

//    With scope function   1-> return type is lambda  2-> context for object is this
    val result = with(ob) {
        println(this.name)
        println(this.age)
        "$name  Yadav"
    }
    println(result)

//    Apply keyword . 1> It will return object of class

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
