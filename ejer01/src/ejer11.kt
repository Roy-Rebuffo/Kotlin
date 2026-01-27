fun alea(li:Int, ls:Int):Int{
    return (Math.random() * (ls-li + 1)).toInt()+li
}
fun rellenar(matriz: IntArray){
    for(i in 0 .. matriz.size-1){
        matriz[i] = alea(200,500)
    }
}
fun imprimir(matriz: IntArray){
    for(i in matriz.indices){
        println("$i ${matriz[i]}")
        //println(item)
    }
}
fun main() {
    val sueldos : IntArray = IntArray(5)
    rellenar(sueldos)
    imprimir(sueldos)
}