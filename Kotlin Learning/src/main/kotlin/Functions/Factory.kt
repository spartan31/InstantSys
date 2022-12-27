package Functions

class Pizza(val name : String , val toppings : String){
    companion object factory {

        fun create(pizzaTpe : String ) : Pizza{
            return when(pizzaTpe){
                "Tomato" -> Pizza("Tomato Pizza" , "cheese tomato onion flour")
                "Peppy Paneer" -> Pizza("Panner Pizaa" , "CHEESE PANEER OLIVE ")
                else -> Pizza("Regular" , " Tomato Onion Olives Panner Cheeze Everthing")
            }
        }
    }

    override fun toString(): String {
        return "Pizza Type ( Name : $name , toppings : $toppings )"
    }
}

fun main() {

    // without using companion Keyword we have to use long Pizza.factory.create
    val c =  Pizza.factory.create("Pappey Paneer")
    println(c)

    //  with using companion object
    val d = Pizza.create("Simple Pizza")

}