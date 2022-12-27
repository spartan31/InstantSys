package Inheritance
open class Parent {
    constructor( name : Int ,  age : Int){
        print("My name is $name and age is $age")
    }
    
}

class Child(name : Int , age : Int , clas : String) : Parent(name , age){
    var c : Int = 1000


    init{
        print(c)
        print("Heloo")
    }


}

class Rectangle(val width: Int, val height: Int) {
    var area: Int
        get() {
            TODO()
        }
        set(value) {

        }



}
