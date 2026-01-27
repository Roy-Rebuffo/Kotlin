fun main() {
    print("Ingrese un nº: ")
    val n1 = readln().toInt()
    var res: String = if(n1 % 2 == 0) {
        "Par"
    } else {
        "Impar"
    }

    print("El resultado es: $res")
}