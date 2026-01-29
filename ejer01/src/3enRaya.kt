fun imprimirTablero(matriz: Array<Array<String>>) {
    // Las filas bajan (de 2 a 0), así la fila 0 queda abajo
    for(i in matriz.size - 1 downTo 0){
        // Las columnas suben (de 0 a 2), para imprimir de izquierda a derecha
        for(j in 0 until matriz.size){
            print(String.format("%4s", matriz[i][j]))
        }
        println()
    }
}
fun rellenarTablero(m: Array<IntArray>) {
    var nfc:Int = m[0].size
    var filas:Int = m.size
    var c = 0
    for (i in 0 until nfc){
        m[filas - 2][i] = (i*nfc) + (i + 1)
        m[filas - 1][i] = (i*nfc) + (nfc - 1)
        for (j in 0 until nfc){
            m[c][j] =  (i*nfc) + (j + 1)
            m[c + nfc][j] =  (j*nfc) + (i + 1)
        }
        c++
    }
}
fun tirarJugador(m: Array<Array<String>>, t: Boolean) {
    do {
        print("Fila")
        var f: Int = readln().toInt()
        print("Columna")
        var c: Int = readln().toInt()
        if(c in 0..m.size-1 && f in 0 .. m.size-1){
            //Evita sobreescribir. ya que comprueba si hay o no ficha puesta
            if(m[f][c]=="*"){
                //Si es verdad ponemos o 1 o 2 dependiendo del turno
                m[f][c] = if(t) "1" else "2"
                break
            }else{
                print("No está libre")
            }
        }else{
            print("Fuera de límites")
        }
    }while (true)
}
private fun comprobar(t: Boolean, m: Array<Array<String>>, ov: Array<IntArray>): Boolean {
    var c: Int
    var n: Int
    var fila: Int
    var columna: Int
    var jugador:String = if(t) "1" else "2"
    for(i in 0 until ov.size){
        c=0
        for(j in 0 until ov[i].size){
            //Recorre cada una de las opciones validas (ej. 1,2,3 || 4,5,6), comprueba que en esas posiciones hay 1 o 2
            //Si hay 3 seguidas del mismo nº hay ganador
            n = ov[i][j]
            fila=((n-1)/ov[i].size).toInt()
            columna= (n-1)%ov[i].size
            if (m[fila][columna]==jugador) c++
        }
        if(c==ov[i].size) return true
    }
    return false
}
fun main() {
    var nf:Int = 3
    var turno: Boolean=true
    var opcionesValidas= Array((nf*2)+2){IntArray(nf)}
    rellenarTablero(opcionesValidas)
    val tablero = Array(nf) { Array(nf) { "*" } }
    var c1:Int = 0
    var c2:Int = 0
    var ganador:Boolean
    while (true){
        imprimirTablero(tablero)
        tirarJugador(tablero,turno)
        if(turno){
            c1++
            if(c1 >= nf){
                ganador = comprobar(turno,tablero,opcionesValidas)
                if(ganador){
                    print("Jugador Ganador!" + if(turno) 1 else 2)
                    break
                }
            }
        }else{
            c2++
            if(c2 >= nf){
                ganador = comprobar(turno,tablero,opcionesValidas)
                if(ganador){
                    print("Jugador Ganador!" + if(turno) 1 else 2)
                    break
                }
            }
        }
        if(c1 + c2 == (nf * 2)){
            print("EMPATE!")
            break
            }
        turno=!turno
    }
}