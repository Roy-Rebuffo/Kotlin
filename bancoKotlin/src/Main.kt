import Model.CBanco
import Model.CCuentaAhorro
import Model.CCuentaCorriente
import Model.CCuentaCorrienteConIntereses

fun main() {
    val banco = CBanco()
    var opcion: Int
    println("\n=================================================")
    println("""
        ||    El flujo del programa ya trae cuentas    ||
        ||    Empezar por el punto nº 5 y añadir       ||
        ||    una cuenta para poder usar las demás     ||
        ||    opciones.                                ||
    """.trimIndent())
    println("=================================================")
    println()
    do {
        println("""
            1. Saldo
            2. Buscar
            3. Ingreso
            4. Reintegro
            5. Añadir (EMPEZAR EL FLUJO DEL PROGRAMA POR AQUÍ)
            6. Eliminar
            7. Mantenimiento
            8. Salir
        """.trimIndent())

        opcion = readln().toInt()

        when (opcion) {
            1 -> {
                println()
                banco.obtenerClientes().forEach { println(it) }
                println()
            }

            2 -> {
                println()
                print("Nombre de la cuenta o tipo de cuenta (ahorro, corriente, interes): ")
                val t = readln()
                banco.buscar(t).forEach { println(it) }
                println()
            }

            3 -> {
                println()
                print("Tipo de cuenta para realizar el INGRESO (Ahorro, Corriente, Interes): ")
                val c = readln()
                print("Cantidad: ")
                val cant = readln().toDouble()

                banco.obtenerClientes()
                    .find { it.obtenerCuenta() == c }
                    ?.ingreso(cant)
                println()
            }

            4 -> {
                println()
                print("Tipo de cuenta para realizar el RETIRO (Ahorro, Corriente, Interes): ")
                val c = readln()
                print("Cantidad: ")
                val cant = readln().toDouble()

                banco.obtenerClientes()
                    .find { it.obtenerCuenta() == c }
                    ?.reintegro(cant)
                println()
            }

            5 -> {
                println()
                println("1.Ahorro 2.Corriente 3.Corriente Con Intereses")
                when (readln().toInt()) {
                    1 -> banco.insertarCliente(
                        CCuentaAhorro("Roy", "Ahorro", 1000.0, 0.02, 5.0)
                    )
                    2 -> banco.insertarCliente(
                        CCuentaCorriente("Pepe", "Corriente", 2000.0, 0.03, 1.0, 3)
                    )
                    3 -> banco.insertarCliente(
                        CCuentaCorrienteConIntereses("Juan", "Interes", 4000.0, 0.03, 1.0, 3)
                    )
                }
                println()
            }

            6 -> {
                println()
                print("Cuenta a eliminar (Ahorro, Corriente, Interes): ")
                banco.eliminarCliente(readln())
                println()
            }

            7 -> {
                println()
                banco.mantenimientoMensual()
                println()
            }
        }

    } while (opcion != 8)
}