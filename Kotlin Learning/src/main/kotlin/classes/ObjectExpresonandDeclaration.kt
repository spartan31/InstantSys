package classes

fun main() {
    println("Main Called")
    print(Aa.num)
    // object expression
    var cc = object {
        fun pp() = { println("Hello this ") }
    }

    // anonymous objects of clone

    var an = object : Clone{
        override fun inClone() {
            println("In clonnable Interface ")
        }
    }
}
interface  Clone{
    fun inClone()
}
object  Aa{
    init {
        println("Aa loded")
    }
    val num :Int = 17
}
object  Bb{
    val g : Int = 20
    fun tes(){
        println("I am in  object B")
    }
}

