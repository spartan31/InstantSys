package inheritance

abstract class AbstractClass {
    abstract var abstractVar: Int      // Abstract Property

    abstract fun abstractFunction()   // Abstract function

    fun nonAbstractFunction() {          // Non-Abstract Method
        println("Non abstract function in Abstract Class")
    }
}

class AbstractExtender() : AbstractClass() {
    override fun abstractFunction() {
        println("Implemented Abstract function in Class Extending Abstract Class")
    }

    override var abstractVar: Int = 10
}

// 1. Properties and functions of an abstract class are by default non-abstract. If we want to override these members in the
//    child class then we need to use open keyword.
// 2. If we declare anything abstract, we didn't need to use open keyword for them
// 3. An abstract member function doesn’t have a body, and it must be implemented in the derived class.
// 4. Can't create object for abstract class.

fun main() {
//  val obj = AbstractClass() we can't make abstract class object directly
    val obj = AbstractExtender()
    obj.abstractFunction()


}