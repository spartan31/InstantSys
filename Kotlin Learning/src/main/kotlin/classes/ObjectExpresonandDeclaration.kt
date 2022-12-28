package classes

fun main() {
    println("Main Called")
    println(WithPrint.num)
    println(WithoutPrint.test())

    // object expression also use to create Anonymous classes. We can even inherit interfaces and classes in this.
    val obj = object {
        fun anonymousClassFun() {
            println("Hello this ")
        }
    }
    obj.anonymousClassFun()

    // anonymous objects of inheriting clone interface
    val obj2 = object : Clone {
        override fun inClone() {
            println("In cloneable Interface ")
        }
    }
    obj2.inClone()
}

interface Clone {
    fun inClone()
}

object WithPrint {
    init {
        println("WithPrint class loaded on Runtime")
    }

    const val num: Int = 17
}

object WithoutPrint {
    fun test() {
        println("I am in  object of Without Print Class")
    }
}

