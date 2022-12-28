package Misc

// By extension, generic types are invariant in Kotlin. This can be managed by the out and in
// keywords. Invariance is the property by which a standard generic function/class already defined for
// a particular data type, cannot accept or return another datatype. Any is the supertype of all other datatypes.

// Variance is of two types-
//Declaration-site variance(using in and out)
//Use-site variance: Type projection


fun main() {
    val c: CheckVariance<Int> = CheckVariance(80)
    println(c.getValue())

    // out keyword -> The out keyword in generic type means we can assign this reference to any of its supertype.
// Super type means class Parent of Current class
    //    val d : CheckVariance<Number> = c     throws error because here we are refrencing smaller with greater
    //    to make it run smooth we apply out keyword.

    val d: CheckVariance<Number> = c
    println(d.getValue())


    // in keyword -> The in keyword in generic type means we can assign reference to its subtypes.
    // The in keyword can be used only on the parameter type that is consumed.
    val check = CheckVarianceIn<Number>("Spartan")
    println(check.getValueIn())
    val check2: CheckVarianceIn<Int> = check      // Without in it will throw error.
    val c3: CheckVarianceIn<Float> = check
}

class CheckVariance<out T>(val t: T) {
    fun getValue() = t                      // Can't use T in parameter of function like getValue( t2 :T).
}

class CheckVarianceIn<in T>(val t: String) {   // Can't use T in reference of class parameter and function return
    fun getValueIn(): String = t               // t can be used here getValue(t1 : T)

}