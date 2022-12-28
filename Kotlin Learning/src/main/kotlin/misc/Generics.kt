package misc

class Generics<T> {
    fun makeNoise(pet: T) {
        println(" $pet is making noise")
    }
}

open class Mammal {
}

open class Animal : Mammal() {
    fun walk() {
    }
}

class Dog : Animal() {
    fun bark() {
        println("Dog is Barking ")
    }
}

fun main() {
//    var grn : Generics<Dog> = Generics()
//    var d2: Dog = Dog()
//    grn.bark(d2)
//    grn.bark()
    val a1 = Animal()
    val a2: Animal = Animal()
    listOf<Animal>(a1, a2)

    val m1 = Mammal()
    val m2 = Mammal()
    listOf<Mammal>(m1, m2)


    var d1 = Dog()
    var d2 = Dog()
    var dl = listOf<Dog>(d1, d2)

    var g = Generics<Mammal>()
    g.makeNoise(m2)
    g.makeNoise(d1)
    val g2 = Generics<Animal>()
//    g2.makeNoise(m1)   this is not possible because by default it is not allowed to access it's parent classes
    g2.makeNoise(a2)
}