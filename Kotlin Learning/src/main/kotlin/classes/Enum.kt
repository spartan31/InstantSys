package classes

enum class Enum{
    One ,
    Two ,
    Three ,
    Anything
}

fun main() {
    var c : Enum = Enum.Anything

    var d: Enum = Enum.One

    println(c.ordinal)
    println(d.name)

    var de : Jwel = Jwel.Gold
    de.price = 5
    println(de.price)
    println(de.cashback())
}

/// paramaterised Enums

interface  Tes{
    fun cashback() : Float
}

enum class Jwel(var price : Int = 1000) : Tes{
    Gold(25000){
        override fun cashback(): Float = 0.02f
               },
    Silver(15000){
        override fun cashback(): Float = 0.2f
    },
    Diamond(1000000){
        override fun cashback(): Float = 0.002f
    }

}