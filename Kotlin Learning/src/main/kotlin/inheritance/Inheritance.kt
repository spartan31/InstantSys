package inheritance

// Inheritance is Passing parent class property to child class
open class Parent {
    constructor(name: String, age: Int) {
        print("Parent name is $name and age is $age")
    }
}

class Child(name: String, age: Int, school: String) : Parent(name, age) {
    var childVal: Int = 1000

    init {
        print(childVal)
        print("Hello from Child Side of $school school")
    }
}

class Rectangle(val width: Int, val height: Int) {
    var area: Int = 0
        get() {
            return this.width * this.height
        }
        set(value) {
            field = value
        }
}

fun main() {
    val rect = Rectangle(10, 1)
    println(rect.area)

    val parent = Parent("Mr Rakesh", 48)
}
