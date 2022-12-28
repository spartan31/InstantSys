package functions

class PizzaFactory(val name: String, val toppings: String) {
    companion object Factory{
        fun create(pizzaType: String): PizzaFactory {
            return when (pizzaType) {
                "Tomato" -> PizzaFactory("Tomato PizzaFactory", "cheese tomato onion flour")
                "Peppy Paneer" -> PizzaFactory("Panner Pizaa", "CHEESE PANEER OLIVE ")
                else -> PizzaFactory("Regular", " Tomato Onion Olives Panner Cheeze Everthing")
            }
        }
    }

    override fun toString(): String {
        return "PizzaFactory Type ( Name : $name , toppings : $toppings )"
    }
}

fun main() {
    // without using companion Keyword we have to use long PizzaFactory.Factory.create
    val pizzaFactory1 = PizzaFactory.Factory.create("Pappey Paneer")
    println(pizzaFactory1)

    //  with using companion object
    val pizzaFactory2 = PizzaFactory.create("Tomato")
    println(pizzaFactory2)
}