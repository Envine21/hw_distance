fun main(){
    print("Choose ex : ")
    val c = readLine()
    when (c){
        "1" -> square()
        "2" -> bigger_dig()
    }
}

fun square(){
    print("a = ")
    val a = readLine()?.toFloat()
    print("b = ")
    val b = readLine()?.toFloat()
    if (a!=null){
        print ("Square = ${a * b!! / 2}")
    }
}
fun bigger_dig(){
    print("Write number : ")
    val num = readLine()?.toInt()
    val a = num?.rem(10)
    val b = num?.div(10)
    if (a != null) {
        if ( a > b!!) print(a)
        else print(b)
    }
}