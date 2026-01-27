fun numDigit(n: Int): Int {
    var v1: Int = n
    var cont: Int = 0
    while (v1>0){
        v1 /= 10
        cont++
    }
    return cont
}

fun main() {
    print("Introduzca un valor por teclado: ")
    val n : Int = readln().toInt()
    print("${numDigit(n)}")
}