class WorkWithArr(private var x:Int,private var y:Int){
    var n : Int = x
    val m : Int = y
    var doubleArray: Array<DoubleArray> = Array(n) { DoubleArray(m) }

    val totalElements: Int
        get() = n * m

    var addScalar: Double = 0.0
        set(value) {
            for (i in 0..<n) {
                for (j in 0..<m) {
                    doubleArray[i][j] += value
                }
            }
            field = value
        }

    init {
        doubleArray = Array(n) { DoubleArray(m) }

    }

    fun initArr(){
        for (i in 0..<n){
            for (j in 0..<m){
                print("Введите [$i,$j] элемент :")
                doubleArray[i][j] = readLine()?.toDoubleOrNull() ?: 0.00
            }
        }
    }

    fun printArr(){
        for (i in 0..<n){
            for (j in 0..<m){
                println("На [$i,$j] месте : ${doubleArray[i][j]} ")
            }
        }
    }

    fun sortArr(){
        for (i in 0..<n){
            doubleArray[i].sortDescending()
        }
    }

}

fun main() {
    // Пример использования
    print("Введите i :")
    val n = readLine()?.toInt()
    print("Введите j :")
    val m = readLine()?.toInt()
    if (n != null && m != null) {
        val arr = WorkWithArr(n, m)
        arr.initArr()
        arr.sortArr()
        arr.printArr()

    }
}