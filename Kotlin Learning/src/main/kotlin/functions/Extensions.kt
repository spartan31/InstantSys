package functions

// Extension functions are used to provide extra functions to class without accessing the Class
//  Parent Class functions always takes the precedence

fun main() {
    var name = "My name is krishan yadav"
    println(name.reversal())
    Child(Father("Mr Rakesh"), 10).handShaken()
//    Father("Rohit").printConnectionString()  Because extension functions are only available in the class which they are extended (Child Class)
}

// Function to reverse String Using extension Functions
fun String.reversal(): String {
    return if (this.isEmpty()) {
        "Not Possible"
    } else {
        var ans = ""
        var temp = this.split(" ")
        for (i in temp.size - 1 downTo 0 step 1) {
            ans = ans + temp[i] + " "
        }
        ans.toString()
    }
}


class Father(val fatherName: String) {
    fun fatherNameIs() {
        print(fatherName)
    }
}

class Child(private val father: Father, val childAge: Int) {
    private fun childAge() {
        print(childAge)
    }

    fun Father.fatherChildRelation() {
        fatherNameIs()   // calls Father.printHostname()
        print(" -> and his child age is ")
        childAge()   // calls Child.childAge()
    }

    fun handShaken() {
        father.fatherChildRelation()   // calls the extension function
    }
}
