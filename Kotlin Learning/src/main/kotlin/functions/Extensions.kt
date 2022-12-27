package functions
// Extension functions are used to provide extra functions to class without accessing the Class
//  Parent Class functions always takes the precedence
fun main() {
    var name =  "My name is krishan yadav"
    print(name.reversal())
}

fun String.reversal() : String{
    return if(this.isEmpty()){
        "Not Possible"
    }else{
        var ans  = ""
        var temp = this.split(" ")
        for (i in temp.size-1 downTo 0 step 1){
            ans = ans + temp[i] + " "
        }
        ans.toString()
    }
}