package classes


class NestedInner {
    var c : Int = 120
    fun Pclass() {
        println("In Parent Class")
    }
    init {
        Pclass()
    }
//    print(d)  d is not availabel for this
        class Nested(){
            var d = 20
            init {
                 inNest()
            }
            fun inNest(){
            print("In Nested Class")
//          print(c)  c is not available here
             }
        }

        inner class Inn{
            var c = -1
            var dr = 56
            init {
                Pclass()
            println(c) // we are acces parent class arguments
                infun()
            }

            fun infun(){
                println("In Inner Class")
            }
        }
}

fun main() {
    var a = NestedInner()
    println(a.c)
    NestedInner.Nested().d

    // nested class
    // we can't directly create object by directly class name of  nested class lIKE  var c = Nested()
    var ne = NestedInner.Nested()
    println(ne.d)
//    println(ne.c) it doest not because we doesn't have properties of Parent class
    ne.inNest()

    // inner class
  var inn = NestedInner().Inn()
//    inn.Inn().infun()
    println(inn.c)

//    print(inn.c)


}
