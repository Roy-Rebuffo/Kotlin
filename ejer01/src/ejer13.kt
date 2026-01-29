class Persona (var nombre: String, var edad: Int) {

    init {
        if (edad < 0)
            edad = 0
    }

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}

fun main(parametro: Array<String>) {
    var persona1 = Persona("Juan", -12)
    persona1 = Persona("Pepe",12)
    persona1.imprimir()
    persona1.esMayorEdad()
}