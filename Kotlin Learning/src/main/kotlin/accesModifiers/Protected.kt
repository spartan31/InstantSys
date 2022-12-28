package accesModifiers

open class Protected {
    protected val valInProtected = 10

    init {
        println("Protected class object loaded")
    }
}

class Inheriting : Protected() {
    init {
        println("We can inherit protected class also and its member is $valInProtected")
    }
}