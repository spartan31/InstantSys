package accesModifiers

fun main() {
    var interObj = Head()
    interObj.pub // we are able to access public & internal
    interObj.inter
//  interObj.prot  Protected & Private members are not accessible here
    val pubObj = Public()
//    val privObj = Private() not able to access private class
//    println(privObj.char)  not able to access private members of  class

    val protObj = Inheriting()// created object of class inheriting Protected class
}

internal open class Head {
    var pub = 10;
    private var priv = 20
    internal var inter = 30
    protected var prot = 40
}
//  We didn't inherit class Marked with internal
//class SubHead : Head() {
//    fun test() {
//        print(pub)
//        print(priv) // priv is not accessible because it is Private here
//        print(inter)
//        print(prot)
//    }
//}