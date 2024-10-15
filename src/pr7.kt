import kotlin.math.*

fun main() {
    println("Work with the function:y=ln(x-2)/sqrt(5x+1)")
    print("Write a:")
    val a = readLine()?.toDoubleOrNull()

    print("Write b:")
    val b = readLine()?.toDoubleOrNull()

    print("Write h:")
    val h = readLine()?.toDoubleOrNull()

    if ( b == null || a == null || h == null){
        println("Write correct values for a, b, and h.")
        return
    }

    var x = a

    while(x <= b){
        try{
            val y = f1(x)
            println(" x = $x --- y = $y ")
        }catch(e: IllegalArgumentException){

                println("Для x = %.2f: ${e.message}".format(x))
        }
        x += h
    }

}

fun f1(x: Double):Double{
    if (x == -0.2 || x == 2.0) {
        throw IllegalArgumentException("Функция не определена.")
    }
    return ln(x-2)/sqrt(5*x+1)
}