class Generics<T>{
     fun makenoise(a : T ){

     }
}

open class Mamal{
}

open class  Animal : Mamal() {
    fun walk(){
    }
}

class  Dog : Animal(){
    fun bark(){
        println("Dog is Barking ")
    }
}

fun main() {
//    var grn : Generics<Dog> = Generics()
//    var d2: Dog = Dog()
//    grn.workin(d2)
//    grn.workin()


    var a1 = Animal()
    var a2: Animal = Animal()
    var al = listOf<Animal>(a1, a2)

    var m1 = Mamal()
    var m2 = Mamal()
    var ml = listOf<Mamal>(m1 , m2)


    var d1 = Dog()
    var d2 = Dog()
    var dl = listOf<Dog>(d2, d2)

    var g = Generics()
    g.makenoise(al)
    g.makenoise(dl)
//    g.makenoise(ml)   this is not possible because by default it is  not alowed to acces it's parent classes
}