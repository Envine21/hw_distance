fun main() {
    print("Choose action: ")
    val code = readLine()
    when (code) {
        "1" -> digits()
        "2" -> tables()
        else -> println("Invalid action")
    }
}

fun digits() {
    print("Напишите первое число: ")
    val a = readLine()?.toIntOrNull()
    if (a == null || a < 10) {
        println("Неверный ввод. Пожалуйста, введите натуральное число, состоящее как минимум из двух цифр.")
        return
    }
    val dig1 = f(a)

    print("Напишите второе число: ")
    val b = readLine()?.toIntOrNull()
    if (b == null || b < 10) {
        println("Неверный ввод. Пожалуйста, введите натуральное число, состоящее как минимум из двух цифр.")
        return
    }
    val dig2 = f(b)

    print("Напишите третье число: ")
    val c = readLine()?.toIntOrNull()
    if (c == null || c < 10) {
        println("Неверный ввод. Пожалуйста, введите натуральное число, состоящее как минимум из двух цифр.")
        return
    }
    val dig3 = f(c)

    println("Result: ${dig1 + dig2 - dig3}")
}

fun f(x: Int): Int {
    val secondLastDigit = (x / 10) % 10
    return secondLastDigit
}

fun tables(){
    println("Получим таблицу значений y = f(x)")

    print("Введите a : ")
    var a = readLine()?.toFloatOrNull()

    print("Введите b : ")
    val b = readLine()?.toFloatOrNull()

    print("Введите h : ")
    val h = readLine()?.toFloatOrNull()

    if (a != null && b != null && h != null ){
        while (a < b && (a + h) <= b){
            println ("x = ${a} f = ${fx(a)}")
            a += h
        }
    }
}
fun fx(x:Float):Float{
    if (x < 0) return "4".toFloat()
    else if (x >= 0 && x < 1) return x * x + 3 * x + 4
    else return "2".toFloat()
}
