import kotlin.math.max

fun main(){
    print("Choose ex : ")
    val ex = readLine()
    when (ex){
        "1.1" -> array1()
        "1.2" -> array2()
        "2" -> switchof()
        "3" -> norm()
        "4" -> negative()
    }
}
fun array1(){
    print("Write the size of the array:")
    val n = readLine()?.toIntOrNull()
    if (n == null) {
        print("It's not correct size")
        return
    }

    var numbers = arrayOfNulls<Int>(n)
    for (i in 0..n-1){
        print("The number in ${i+1} place is :")
        var k = readLine()?.toIntOrNull()
        if (k != null) numbers[i] = k
    }

    print("Write our point number:")
    var point = readLine()?.toIntOrNull()

    if (point != null){
        for (i in 0..numbers.size-1){
            if (numbers[i]!! > point) println("array[$i] = ${numbers[i]}")
        }
    }
}
fun array2(){
    print("Write the number of rows: ")
    val rows = readLine()?.toIntOrNull()
    if (rows == null || rows <= 0) {
        println("It's not a correct number of rows")
        return
    }

    print("Write the number of columns: ")
    val cols = readLine()?.toIntOrNull()
    if (cols == null || cols <= 0) {
        println("It's not a correct number of columns")
        return
    }

    val numbers = Array(rows) { arrayOfNulls<Int>(cols) }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("The number in [$i][$j] is: ")
            val k = readLine()?.toIntOrNull()
            if (k != null) numbers[i][j] = k
        }
    }

    print("Write our point number: ")
    val point = readLine()?.toIntOrNull()

    if (point != null) {
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (numbers[i][j] != null && numbers[i][j]!! > point) {
                    println("array[$i][$j] = ${numbers[i][j]}")
                }
            }
        }
    }
}

fun switchof(){
    print("Write the size of the array:")
    val n = readLine()?.toInt()
    if (n == null) {
        print("It's not correct size")
        return
    }

    var numbers = arrayOfNulls<Int>(n)
    for (i in 0..n-1){
        print("The number in ${i+1} place is :")
        var k = readLine()?.toInt()
        if (k != null) numbers[i] = k
    }

    var maximum = 0
    var minimum = 0
    if (maximum != null && minimum != null){
        for (i in 1..n - 1){
            if (numbers[i]!! > numbers[maximum!!]!!) maximum = i
            if (numbers[i]!! < numbers[minimum!!]!!) minimum = i
        }
    }

    val k = numbers[minimum!!]
    numbers[minimum] = numbers[maximum!!]
    numbers[maximum] = k

    var z = 0
    print("[ ")
    while (z < n ){
        print("${numbers[z]} ")
        z += 1
    }
    print("]")
}
fun norm(){
    print("Write the number of rows: ")
    val rows = readLine()?.toIntOrNull()
    if (rows == null || rows <= 0) {
        println("It's not a correct number of rows")
        return
    }

    print("Write the number of columns: ")
    val cols = readLine()?.toIntOrNull()
    if (cols == null || cols <= 0) {
        println("It's not a correct number of columns")
        return
    }

    val numbers = Array(rows) { arrayOfNulls<Int>(cols) }

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("The number in [$i][$j] is: ")
            val k = readLine()?.toIntOrNull()
            if (k != null) numbers[i][j] = k
        }
    }

    var norm:Int = -2147483648
    for (j in 0..cols - 1){
        var summ:Int = 0
        for (i in 0..rows -1){
            summ += numbers[i][j]!!
        }
        norm = max(summ,norm)
    }

    print("Норма : $norm")
}

fun negative() {
    println("Введите количество строк в ступенчатом массиве:")
    val rows = readLine()!!.toInt()

    val finishArray = arrayOfNulls<Int>(rows)

    val stepArray = Array(rows) {
        println("Введите количество элементов для строки ${it + 1}:")
        val cols = readLine()!!.toInt()
        Array(cols) {
            println("Введите элемент:")
            readLine()!!.toInt()
        }
    }

    for (i in 0 until rows) {
        for (j in stepArray[i].indices) {
            stepArray[i][j] = 0
            if (stepArray[i][j] < 0) {
                finishArray[i] = stepArray[i][j]
                break
            }
        }
    }

    print("[ ")
    for (i in finishArray.indices) {
        print("${finishArray[i]} ")
    }
    print("]")
}
