package accesModifiers

fun main() {
  var a = all()
    a.p
    a.r

}
open class all {
    var p = 10 ;
    private var q = 20
    internal var r = 30
    protected var s = 40
}

class inh : all(){
    fun test(){
        print(p)
//        print(q)
        print(r)
        print(s)
    }
}