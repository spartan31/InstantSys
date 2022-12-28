package classes
// 1. Used to store Data
// 2. No need to code getters and setter all are by default
// 3. At least 1 parameter is compulsory in Primary Constructor
// 4. Parameter need to marked val or var
// 5. We cannot mark them abstract, open

fun main() {
    val p1 = Person(pAge = 40, pName = "Ana")
    val p2 = Person("Ana", 20)
    println(p1 == p2)
    println(p1.pName)

    val p3 = p1.copy("Lata")
    println(p1)
    println("Name of new object of Person 3  is $p3 ")
}

// class InheritData(name: String , a :Int) : Person(name , a){
//  It's not possible Because data class can't be Inherited }


data class Person(var pName: String, var pAge: Int) {
    init {
        pName = pName.uppercase()
        if (pAge > 50) {
            throw ArithmeticException(" Illegal age written")
        }
    }

    /**
     * Overrinding toString , hashcode , equals functions pf Data Classes
     */
    override fun toString(): String {
        return "Person's Name : ${this.pName}  Person's Age : ${this.pAge}"
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}