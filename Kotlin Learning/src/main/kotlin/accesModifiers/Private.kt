package accesModifiers

private class Private(){
    private var numInPrivate :Int = 10
    init {
        println( "Private class members also loaded value of private member is  $numInPrivate")  // accessing private char in same scope
        println("Private Class Object is Loaded ")
    }
}
