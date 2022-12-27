package Functions

fun main() {
    val p = Hello(4)
    val q = Hello(8)
    val r = Hello(4)
    if(p === r ){
        println("Matched !!")
    }else{
        println("No ")
    }
    val x = p + q
    val lef = arrayOf(1, 1, 1, 1,)
    val righ = arrayOf(2, 2, 2, 2)
    val one = arrayOf(10, 11)
    var mat = arrayOf(lef, righ, one)

    println(mat[0][1])
}
class Hello(var x : Int){
    override fun equals(other: Any?): Boolean {
        return this.x.equals((other as Hello).x)
    }
}
operator fun Hello.plus( y : Hello) : Hello{
     val p = this.x+ y.x + 2
      return Hello(p)
}