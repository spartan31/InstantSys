package reflection

/**
 * In simple terms we can say Reflection is getting runtime reference of Class , functions , property constructor
 * Also used to create instances of class , functions ,properties
 */
class Reflection{
}

fun reflectionFunction(){
    println("Reflection function is called")
}

var reflectionProperty = 15
fun main() {
    val refReflection = Reflection::class // taking reference of class
    println("Taking reference of using class using reference : $refReflection")
    val refBound = Reflection()
    println("Taking reference of using class using bound : $refBound")

    val refFunction=  ::reflectionFunction
    println(refFunction) // prints name of the referenced function
    refFunction() // use of reference to use as normal function

    var refProperty = ::reflectionProperty
    println(refProperty) // prints type of property
    println(refProperty.name) // prints name of property
    refProperty.set(120) // change property
    println(refProperty.get()) // to get value of property
}