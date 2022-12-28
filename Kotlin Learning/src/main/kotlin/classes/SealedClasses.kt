package classes

// sealed classes and Interface are just to provide extra security.  We can create multiple instances in Sealed Classes
// it manage safety by restricting the types to be matched at compile-time rather than at runtime.
// It is abstract so cannot be instantiated
sealed class SealedClasses {
    class A(name: String, plane: Char) : SealedClasses()
    object B : SealedClasses()
    class C(age: Int, role: String) : SealedClasses()
    data class D(var name: String) : SealedClasses()
    sealed interface Inter
}
