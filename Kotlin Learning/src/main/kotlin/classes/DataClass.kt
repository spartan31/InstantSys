package classes

fun main() {
    var p = Person(age = 56 , name = "Ana")
    var q = Person("Ana" , 56)
    println( p.equals(q))

    var r = p.copy("Lata")
    println(p.name)
}

//class Inhe(name: String , a :Int) : Person(name , a){
//
//  data class can't be Inherited
//}

data class Person(var name : String , var age : Int ){
    init {
        name = name.uppercase()

        if(age > 50){
            throw ArithmeticException (" Illegal err")
        }
    }
    override fun toString(): String {
        return "Person's Name : ${this.name}  Person's Age : ${this.age}"
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }
}