fun main(){
    print("Напишите строку: ")
    val input = readLine()
    var output = ""

    var resultarr = input!!.split(" ")
    for (i in resultarr){
        if (i[0] in "ёуеэоаыяиюЁУЕЭОАЫЯИЮ") continue
        else output += "$i "
    }
    print("Строка без гласных: $output")
}