package accessmodifiers

fun main() {
    var interObj = Controller()
    interObj.pub // we are able to access public & internal
    interObj.inter

//  interObj.prot  Protected & Private members are not accessible here

    val pubObj = Public()

//  val privateObj = Private() not able to access private class
//  println(privateObj.char)  not able to access private members of  class

    val protectedObj = Inheriting()// created object of class inheriting Protected class
}

internal open class Controller {
    var pub = 10;
    private var priv = 20
    internal var inter = 30
    protected var prot = 40
}
//  We didn't inherit class Marked with internal
//class SubHead : Controller() {
//    fun test() {
//        print(pub)
//        print(priv) // priv is not accessible because it is Private here
//        print(inter)
//        print(prot)
//    }
//}