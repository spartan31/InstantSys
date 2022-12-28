package functions

class Pizza(val name: String, val toppings: String) {
    companion object Factory {
        fun create(pizzaType: String): Pizza {
            return when (pizzaType) {
                "Tomato" -> Pizza("Tomato Pizza", "cheese tomato onion flour")
                "Peppy Paneer" -> Pizza("Panner Pizaa", "CHEESE PANEER OLIVE ")
                else -> Pizza("Regular", " Tomato Onion Olives Panner Cheeze Everthing")
            }
        }
    }

    override fun toString(): String {
        return "Pizza Type ( Name : $name , toppings : $toppings )"
    }
}

fun main() {
    // without using companion Keyword we have to use long Pizza.Factory.create
    val pizza1 = Pizza.Factory.create("Pappey Paneer")
    println(pizza1)

    //  with using companion object
    val pizza2 = Pizza.create("Tomato")
    println(pizza2)
}