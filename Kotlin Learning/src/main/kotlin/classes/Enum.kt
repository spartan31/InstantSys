package classes

enum class Enum {
    ONE,
    TWO,
    THREE,
    FOUR
}

// We cannot create instance of enum class  using constructors.
fun main() {
    var e1: Enum = Enum.FOUR
    var e2: Enum = Enum.ONE

    println(e1.ordinal)
    println(e2.name)

    var de: Jewel = Jewel.GOLD
    de.price = 5
    println(de.price)
    println(de.cashback())
}

// Parameterized Enums

interface Test1 {
    fun cashback(): Float
}

enum class Jewel(var price: Int = 1000) : Test1 {
    GOLD(25000) {
        override fun cashback(): Float = 0.02f
    },
    SILVER(15000) {
        override fun cashback(): Float = 0.2f
    },
    DIAMOND(1000000) {
        override fun cashback(): Float = 0.002f
    }
}