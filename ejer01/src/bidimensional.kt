//Una matriz bidimensional de 5,5
//Rellenar con numeros aleatorios de 0 a 10
//obtener la media por fila y por col
private fun alea(li: Int, ls: Int): Int {
    return (Math.random() * (ls - li + 1)).toInt() + li
}

fun rellenar(matriz: Array<IntArray>){
    for(i in 0 .. matriz.size-1){
        for(j in 0 .. matriz.size-1){
            matriz[i][j] = alea(0,10)
        }
    }
}
fun imprimir(matriz: Array<IntArray>){
    for(i in 0 .. matriz.size-1){
        for(j in 0 .. matriz.size-1){
            print(String.format("%4d", matriz[i][j]))
        }
        println()
    }
}
fun media(matriz: Array<IntArray>){
    var suma: Int
    var suma_columnas = IntArray(matriz[0].size){0}

    for(i in 0 .. matriz.size-1){
        var suma = 0
        for(j in 0 .. matriz.size-1){
            print(String.format("%6d", matriz[i][j]))
            suma += matriz[i][j]
            suma_columnas[j] += matriz[i][j]
        }
        println(String.format("%7.2f", suma.toDouble()/matriz[i].size))
    }
    for(i:Int in 0.. suma_columnas.size-1){
        print(String.format("%6.2f", suma_columnas[i].toDouble()/matriz.size))
    }
}

fun main() {
    val matriz = Array(5) { IntArray(5) }
    rellenar(matriz)
    
    media(matriz)
}