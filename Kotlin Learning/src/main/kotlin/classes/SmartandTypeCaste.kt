package classes

fun main() {
    val c1 = Dentist(10.0)
    val p1 = Player("Anu")
//    if(p1 is Reporter){
//     print("True ")   Here we are checking at compile time
//    }

// here it will automatically cast our array to array of People which is parent of both Player and Dentist
    var arr: Array<People> = arrayOf(Dentist(10.0), Player("Suraj"))
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

interface People {
    /**
     * abstract method with show type of work done by people
     */
    fun working()
}

abstract class Doctor : People {
    abstract fun fees(): Double
}

class Dentist(var noOfPaatient: Double) : Doctor() {
    /**
     * Overriding fee function of Doctor which give total fee earned by doctor
     */
    override fun fees(): Double {
        return 100.0 * noOfPaatient * noOfPaatient
    }

    /**
     * As we have implemented People class in Doctor so we are overriding work function for Doctor
     */
    override fun working() {
        println("Dentist is Working ")
    }
}

class Player(var name: String) : People {
    /**
     * Here Overriding work function of Player
     */
    override fun working() {
        println(" $name is Playing ")
    }

    val sayMyName: () -> Unit = { print("My name is $name") }
}