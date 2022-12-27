package Functions

fun main() {
   var name =  "My name is krishan yadav"
    print(name.reversal())
}

fun String.reversal() : String{
    if(this.length == 0){
        return "Not Possile"
    }else{
        var ans  = ""
        var temp = this.split(" ")
        for (i in temp.size-1 downTo 0 step 1){
           ans = ans + temp[i] + " "
        }
      return ans.toString()
    }
}