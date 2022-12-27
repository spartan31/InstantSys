package classes
fun main() {
    CompanionObj.name()
    CompanionObj.count = 16
    CompanionObj.name()
    MyClass.glass = "BEER BOTTLE"
    MyClass.funct()


    //  EACH CLASS HAS ONLY ONE COMPANION OBJECT

    val obj  = CompanionObj
    val obj2 = CompanionObj
    print("This is for Object class  ")
    obj.count = 70806
    obj2.count = 8888888
    println(obj2.count )
    println("Agli line ${obj.count}")
    print(obj == obj2)
    println()
    var c = A("a")
    var d = A("a")
    print("This is for Normal class  ")
    print(c == d)

    c.nameis = "Vru"
    d.nameis = " Kri"
    println("C ${c.nameis}  for D ${d.nameis}")
}

class A(name : String){
      var nameis = ""
}
object CompanionObj{

    var count : Int = -1 // this is behave like  static variable as in Java

    var name : () -> Unit = {         // this is behave like static method as in Java
        println("Current counr is $count")
    }

    init {
        //we can do anthing here
    }
}
// we can Inherit and Override Methods of object type (Singleton ) classes

class MyClass{
    val h : Int = 16
// THIS IS COMPANION OBJECT INSIDE THIS CLASS WE CAN INHERIT ALL THE PROPERTIES DIRECTLY LIKE SINGLETON OR OBJECT CLAS
     companion object {
        var glass : String = "Broken"

        var funct : () -> Unit = {
            println(" Heloo from C obj ")
        }
    }

    object Vsarun{
        var name = "Varun "
    }

    object  Kri{
        var name = "Krishna yadva"
    }
}