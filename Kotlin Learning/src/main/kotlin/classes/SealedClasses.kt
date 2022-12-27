package classes

sealed class SealedClasses {
   class  A(name: String , plane : Char) : SealedClasses()
   class B() : SealedClasses()
   class C(age: Int , role : String) : SealedClasses()
}