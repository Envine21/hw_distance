fun main(){
    print("Напишите строку: ")
    val input = readLine()

    print("Choose ex : ")
    val ex = readLine()

    when (ex){
        "1" -> countDigits(input!!)
        "2" -> short(input!!)
    }
    val digitCount =  countDigits(input!!)

}

fun countDigits(s:String){
    var count = 0
    for (i in 0..<s.length){
        if (s[i].isDigit()) count += 1
    }
    println("Количество цифр в строке: $count")
}

fun short(s:String){
    val resultArray = s.split(" ")
    var shortest = resultArray[0]
    for (i in 0..<resultArray.size){
        if (resultArray[i] != "." || resultArray[i] != "," || resultArray[i] != "!" || resultArray[i] != "?") continue
        if (resultArray[i].length < shortest.length) shortest = resultArray[i]
    }
    print("Самое короткое слово: ${shortest}")
}