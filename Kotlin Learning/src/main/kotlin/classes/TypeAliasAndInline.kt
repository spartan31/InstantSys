package classes
// Type Alias is used to give our Custom name to any Class or functions

typealias newStringName = String
// now we can use newStringName instead of String everywhere also we can use String
// Here Point to note is we can se Inline Classes are similar to aliases, but we will how to find advantage of alias over Inline Classes

fun main() {
    val stringOfAlias: newStringName = "String by Alias"
    val stringOfInline = InlineString("String by Inline")
    val string: String = "Original String"

// Now we Check is there the difference between type of these 3 strings
    /**
     *This function receives Original String, and we check does it receive Inline Class and Alias String
     */
    fun originalStringReceiver(s: String) {}

    originalStringReceiver(string)
    originalStringReceiver(stringOfAlias)
//     originalStringReceiver(stringOfInline)   So Default String doesnot Receive Inline type

    /**
     *This function receives Alias String, and we check does it receive Inline Class and Default String
     */
    fun aliasReceiver(n: newStringName) {}
    aliasReceiver(string)
    aliasReceiver(stringOfAlias)
//    aliasReceiver(stringOfInline)  Alias type String Doesn't take Inline Strings

    /**
     *This function receives Inline string, and we check does it receive Default and Alias String
     */
    fun inlineReceiver(p: InlineString) {}
//    inlineReceiver(string)
    inlineReceiver(stringOfInline) // Inline only takes Inline as a parameters
//    inlineReceiver(stringOfAlias)

}

// Inline class
@JvmInline
value class InlineString(val str: String)