import Model.CBanco
import Model.CCuentaAhorro
import Model.CCuentaCorriente
import Model.CCuentaCorrienteConIntereses

fun main() {
    val banco = CBanco()
    var opcion: Int

    do {
        println("""
            1. Saldo
            2. Buscar
            3. Ingreso
            4. Reintegro
            5. Añadir
            6. Eliminar
            7. Mantenimiento
            8. Salir
        """.trimIndent())

        opcion = readln().toInt()

        when (opcion) {
            1 -> {
                banco.obtenerClientes().forEach { println(it) }
            }

            2 -> {
                print("Nombre de la cuenta o tipo de cuenta(ahorro, corriente, interes): ")
                val t = readln()
                banco.buscar(t).forEach { println(it) }
            }

            3 -> {
                print("Cuenta: ")
                val c = readln()
                print("Cantidad: ")
                val cant = readln().toDouble()

                banco.obtenerClientes()
                    .find { it.obtenerCuenta() == c }
                    ?.ingreso(cant)
            }

            4 -> {
                print("Cuenta: ")
                val c = readln()
                print("Cantidad: ")
                val cant = readln().toDouble()

                banco.obtenerClientes()
                    .find { it.obtenerCuenta() == c }
                    ?.reintegro(cant)
            }

            5 -> {
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
            }

            6 -> {
                print("Cuenta a eliminar: ")
                banco.eliminarCliente(readln())
            }

            7 -> banco.mantenimientoMensual()
        }

    } while (opcion != 8)
}