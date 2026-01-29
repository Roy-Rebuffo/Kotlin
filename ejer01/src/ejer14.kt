private class Alumno constructor(var nombre:String, var nota: Int){
    fun imprimir(){
        println("El nombre es: $nombre y la nota es: $nota")
    }

    fun nota(){
        if(nota>=4){
            println("La nota es Regular")
        }
    }
    
}

fun main() {
    var a1 = Alumno("Rosita", 10)
    a1.imprimir()
    a1.nota()
}