package classes

class Comparing(name: String) {
    var nameis = ""
}

object DirectObject {
    var count: Int = -1                        // This will behave like static variable as in Java
    var name: () -> Unit = {                  // This will behave like static method as in Java
        println("Current count is $count")
    }

    init {
        // We can add anything here just for showing that we can initialise init in object classes also
    }
}

class TopClass {
    val varInTopClass: Int = 16

    // THIS IS COMPANION OBJECT INSIDE THIS CLASS WE CAN INHERIT ALL THE PROPERTIES DIRECTLY LIKE SINGLETON OR OBJECT CLASSES
    companion object {
        var varInCompanionClass: String = "I am Companion Object"

        var compFunction: () -> Unit = {
            println(" Hello from function of Companion")
        }
    }

    object Car {
        var carName = "Honda City "
    }

    object Bike {
        var bikeName = "Honda Shine"
    }
}

fun main() {
    DirectObject.name()
    DirectObject.count = 16
    DirectObject.name()

    TopClass.varInCompanionClass =
        "Change string in companion object directly" // Accessing Companion object Property Directly
    TopClass.compFunction()
    TopClass.Car.carName   // Accessing normal object classes in TopClass
    val objinner = TopClass.Car
    val objInnerCompn = TopClass.varInCompanionClass

//  EACH CLASS HAS ONLY ONE COMPANION OBJECT

    val obj = DirectObject
    val obj2 = DirectObject
    print("This is for Object class  ")
    obj.count = 70806
    obj2.count = 8888888
    println(obj2.count)
    println("Next line ${obj.count}")
    print(obj == obj2)
    println()

    val c = Comparing("a")
    val d = Comparing("a")
    println(c == d)
    c.nameis = "Varun"
    d.nameis = " Krishan "
    println("C ${c.nameis}  for D ${d.nameis}")
}
// we can Inherit and Override Methods of object type (Singleton ) classes

