fun main(){
    print("Choose action: ")
    var code = readLine()
    when (code){
        "1" -> sumOf2int()
        "2" -> tooOf2int()
        "3" -> sumOf3int()
        "4" -> mulOf2fl()
        "5" -> divOf2fl()
        "6" -> tooOf3fl()
    }
}

fun sumOf2int(){
    print("a = ")
    val a = readLine()?.toInt()
    print("b = ")
    val b = readLine()?.toInt()
    if (a != null) {
        print("${a} + ${b} = ${a + b!!}")
    }

}
fun tooOf2int(){
    print("a = ")
    val a = readLine()?.toInt()
    print("b = ")
    val b = readLine()?.toInt()
    print("${a} + ${b} = ${b} + ${a}")
}
fun sumOf3int(){
    print("a = ")
    val a = readLine()?.toInt()
    print("b = ")
    val b = readLine()?.toInt()
    print("c = ")
    val c = readLine()?.toInt()
    if (a != null) {
        if (b != null) {
            print("${a} + ${b} + ${c} = ${a + b + c!!}")
        }
    }
}
fun mulOf2fl(){
    print("a = ")
    val a = readLine()?.toFloat()
    print("b = ")
    val b = readLine()?.toFloat()
    if (a != null) {
        print("${a} * ${b} = ${a * b!!}")
    }
}
fun divOf2fl(){
    print("a = ")
    val a = readLine()?.toFloat()
    print("b = ")
    val b = readLine()?.toFloat()
    if (a != null) {
        print("${a} / ${b} = ${a / b!!}")
    }
}
fun tooOf3fl(){
    print("a = ")
    val a = readLine()?.toFloat()
    print("b = ")
    val b = readLine()?.toFloat()
    print("c = ")
    val c = readLine()?.toFloat()
    if (a != null) {
        if (b != null) {
            print("(${a} * ${b}) * ${c} = ${a} * (${b} * ${c})")
        }
    }
}