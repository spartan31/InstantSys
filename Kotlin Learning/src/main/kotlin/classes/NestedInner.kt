package classes

class NestedInner {
    var topVar: Int = 120
    fun parentClass() {
        println("In Parent Class")
    }

    init {
        parentClass()
//        println(nestVar)  Nested Class members not accessible here
//        println(innVar)   Inner Class members also not accessible here
    }

    class Nested() {
        var nestVar = 20

        init {
            nestedClassFun()
        }

        fun nestedClassFun() {
            print("In Nested Class")
//          print(topVar)  topVar is not accessible here means parent class members are not accessible here
        }
    }

    inner class Inner {
        var innVar = -1

        init {
            parentClass()
            println(innVar) // we are acces parent class arguments
            innerClassFun()
        }

        fun innerClassFun() {
            println("In Inner Class")
        }
    }
}

fun main() {
    val obj1 = NestedInner()
    println(obj1.topVar)
    NestedInner.Nested().nestVar

    // nested class
    // we can't directly create object by directly class name of  nested class lIKE  var c = Nested()
    val obj2 = NestedInner.Nested()
    println(obj2.nestVar)
    obj2.nestedClassFun()
//    println(ne.topVar)  doest not possible because we haven't properties of Parent class

    // inner class
    val obj3 = NestedInner().Inner()
    println(obj3.innVar)
    obj3.innerClassFun()

}
