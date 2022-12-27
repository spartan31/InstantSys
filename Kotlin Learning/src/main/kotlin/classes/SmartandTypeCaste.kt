package classes

fun main() {
    val c1 = Circ(10.0)
    val p1 = Player("Anu")
    // we can checj   type at RunTime
//    if(p1 is Circ "){
//     print("True ")
//    }

    var arr : Array<Draggable> = arrayOf(Circ(10.0) , Player("Suraj"))
    for (obj in arr){
//        println("Array is Running")
        if (obj is Circ){
            obj.drag()
            obj.area()
        }else{
            obj.drag()
            (obj as Player).sayMyName()
        }
    }

}
interface Draggable{
    fun drag()
}

abstract class Shap : Draggable{
    abstract fun area() : Double
}

class Circ(var rad : Double) : Shap(){

    override fun area(): Double {
        return Math.PI * rad * rad
    }

    override fun drag() {
        println("Circle is Dragging ")
    }
}

class Player(var name : String) : Draggable{
    override fun drag() {
        println(" $name is Dragging ")
    }
     val sayMyName : () -> Unit =  { print("my name is $name") }
}