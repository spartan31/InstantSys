package classes

class Checking(name: String) {
    var nameis = ""
}

object CompanionObj {
    var count: Int = -1                        // This will behave like static variable as in Java
    var name: () -> Unit = {                  // This will behave like static method as in Java
        println("Current count is $count")
    }

    init {
        // We can add anything here just for showing that we can initialise init in object classes also
    }
}

class TopClass {
    val headObj: Int = 16

    // THIS IS COMPANION OBJECT INSIDE THIS CLASS WE CAN INHERIT ALL THE PROPERTIES DIRECTLY LIKE SINGLETON OR OBJECT CLASSES
    companion object {
        var compObj: String = "I am Companion Object"
        var compFunction: () -> Unit = {
            println(" Hello from function of Companion")
        }
    }

    object Car {
        var name = "Honda City "
    }

    object Bike {
        var name = "Honda Activa"
    }
}

fun main() {
    CompanionObj.name()
    CompanionObj.count = 16
    CompanionObj.name()

    TopClass.compObj = "Change string in companion object directly" // Accessing Companion object Property Directly
    TopClass.compFunction()
    TopClass.Car.name   // Accessing normal object classes in TopClass
    val objinner = TopClass.Car
    val objInnerCompn = TopClass.compObj
//     EACH CLASS HAS ONLY ONE COMPANION OBJECT

    val obj = CompanionObj
    val obj2 = CompanionObj
    print("This is for Object class  ")
    obj.count = 70806
    obj2.count = 8888888
    println(obj2.count)
    println("Next line ${obj.count}")
    print(obj == obj2)
    println()

    val c = Checking("a")
    val d = Checking("a")
    println("-----------------This is for Normal class  ----------------  ")
    println(c == d)
    c.nameis = "Varun"
    d.nameis = " Krishan "
    println("C ${c.nameis}  for D ${d.nameis}")
}
// we can Inherit and Override Methods of object type (Singleton ) classes

