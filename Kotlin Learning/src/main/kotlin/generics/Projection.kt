package generics

fun starProjection(list: MutableList<*>) {

}

fun anyProjection(list: MutableList<Any>) {

}

fun main() {
    val list1 = mutableListOf(1, 2, 3, 4)
    val list2 = mutableListOf(1, "Arav", 'c', false)
    val list3: MutableList<Any> = mutableListOf(1, 3, 25, 6L, "Hello")
    starProjection(list1) // pass any type of list in this
    starProjection(list2)
//  anyProjection(list1) // we have to define the type any by itself
    anyProjection(list3) // this is possible because we have initialized the type during declaration

}