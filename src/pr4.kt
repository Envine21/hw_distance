import kotlin.math.abs

fun main(){
    print("Choose ex : ")
    val ex = readLine()
    when (ex){
        "1" -> point()
        "2" -> month()
        "3" -> table()
    }
}
fun point(){
    print("y of point = ")
    val y = readLine()?.toIntOrNull()
    print("x of point = ")
    val x = readLine()?.toIntOrNull()
    if (x != null && y!= null) {
        if (x * x + y * y < 15 && y > abs(x) ) print("Да")
        else if ( ( x * x + y * y == 15 && y > abs(x) ) || (x * x + y * y < 15 && y == abs(x) ) ) print("На границе")
        else print("Нет")
    }
}
fun month(){
    print("Write num of days : ")
    var days = readLine()?.toInt()
    var leap : Int = 2
    if (days!= null) {
        while (days > 355) {
            if (leap != 4) {
                days -= 355
                leap += 1
            }
            else {
                days -= 356
                leap = 0
            }
        }
    }
    if (leap != 4){

    }
}
fun table(){
    print("Write price of 1 item : ")
    val price = readLine()?.toIntOrNull()
    var item = 0
    if (price != null){
        while (item < 100) {
            item += 10
            println("${price * item} costs ${item} item")
        }
    }
}