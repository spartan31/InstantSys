package classes

fun main() {
    val c1 = Dentist(10.0)
    val p1 = Player("Anu")
//    if(p1 is Reporter){
//     print("True ")   Here we are checking at compile time
//    }

// here it will automatically cast our array to array of Work which is parent of both Player and Dentist
    var arr: Array<Work> = arrayOf(Dentist(10.0), Player("Suraj"))
    for (obj in arr) {
        if (obj is Dentist) {
            obj.working()
            obj.fees()
        } else {
            obj.working()
            (obj as Player).sayMyName()
        }
    }
}

interface Work {
    fun working()
}

abstract class Doctor : Work {
    abstract fun fees(): Double
}

class Dentist(var noOfPaatient: Double) : Doctor() {
    override fun fees(): Double {
        return 100.0 * noOfPaatient * noOfPaatient
    }
    override fun working() {
        println("Dentist is Working ")
    }
}

class Player(var name: String) : Work {
    override fun working() {
        println(" $name is Playing ")
    }
    val sayMyName: () -> Unit = { print("My name is $name") }
}