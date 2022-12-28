package destructuring

//In a member of a class, this refers to the current object of that class.
//In an extension function or a function literal with receiver this denotes the receiver parameter that is
// passed on the left-hand side of a dot.

// here we are using label qualifiers to refer this at specific place
class TopClass { // by default, we have label @TopClass
    inner class InnerClass { // default label @InnerClass
        fun Int.innerClassMemberFunction() { // implicit label at this member function of inner Class

            val topClassObj = this@TopClass
            val innerClassObj = this@InnerClass // pointing to object of inner class

            val innerMemberFunctionReceiver = this // point toward receiver of inner class member function


            val lambdaFunction = lambda@ fun String.() {
                val d = this // points toward receiver of function in which we are
            }

            val withoutReciever = { s: String ->
                // points to member function of Inner Class because doesn't have any receiver
                val d1 = this
            }
        }
    }
}
fun main() {

}

