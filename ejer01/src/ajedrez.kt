fun isLetra(caracter: String): Boolean {
    val cadena = "abcdefgh"
    if(cadena.indexOf(caracter)>=0) return true
    return false
}

fun letra_numero(n: Int): String {
    val cadena = "abcdefgh"
    return cadena[n].toString()
}

fun main() {
    var x: String
    var y: Int

    do {
        print("Dime la columna(a-h)")
        x = readln()
    }while (!isLetra(x))

    do {
        print("Dime la fila (1...8)")
        y = readln().toInt()
    } while (y <1 || y > 8)

    var x_numero = "abcdefgh".indexOf(x) //Da la pos respecto a 1-8
    var x1: Int
    var x2: Int
    //y=x+a1; y=-x+a2
    //a1=y-x; a2=y+x
    //x=y-a1
    //x=a2-y
    var a1 = y-x_numero
    var a2 = y+x_numero

    for(i in 1 .. 8){
        x1 = i - a1
        x2 = a2 - i
        if (x1 in 1 ..8 && (x1 !=x_numero || y !=i)){
            print("(${letra_numero(x1)},$i)")
        }
        if (x2 in 1 ..8 && (x2 !=x_numero || y !=i)){
            print("(${letra_numero(x2)},$i)")
        }

    }
}