package functions

fun main() {
    val p = HeadClass(4)
    val q = HeadClass(8)
    val r = HeadClass(4)
// here we are checking if p and  r referencing to same object or not
    if (p === r) {
        println("Matched !!")
    } else {
        println("Not Matched ")
    }
// adding p and q directly using + operator
    val obj = p+q
    println(obj.x)
    val x = p + q
    val left = arrayOf(1, 1, 1, 1)
    val right = arrayOf(2, 2, 2, 2)
    val extraRow = arrayOf(10, 11)
    var mat = arrayOf(left, right, extraRow)

    println(mat[0][1])
}

class HeadClass(var x: Int) {
    override fun equals(other: Any?): Boolean {
        return this.x.equals((other as HeadClass).x)
    }
}
// extending plus operator for hello class objects
operator fun HeadClass.plus(y: HeadClass): HeadClass {
    val p = this.x + y.x + 2
    return HeadClass(p)
}