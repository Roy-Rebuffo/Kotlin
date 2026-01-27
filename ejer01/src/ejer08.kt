fun tipo(n:Int): String{
    var v1: Int = n

    var res : String = if(v1 > 0){
        "Pos"
    } else if (v1 < 0){
        "Neg"
    }else {
        "Cero"
    }
    return res
}

fun main() {
    print("Introduzca un valor por teclado: ")
    val n : Int = readln().toInt()

    print(tipo(n))
}