package Model

class CBanco {
    private val clientes = mutableListOf<CCuenta>()

    fun obtenerClientes() = clientes

    fun insertarCliente(c: CCuenta) {
        clientes.add(c)
    }

    fun eliminarCliente(numCuenta: String) {
        clientes.removeIf { it.obtenerCuenta() == numCuenta }
    }

    fun longitud() = clientes.size

    fun buscar(texto: String): List<CCuenta> {
        return clientes.filter {
            it.obtenerNombre().contains(texto, true) ||
                    it.obtenerCuenta().contains(texto, true)
        }
    }

    fun mantenimientoMensual() {
        clientes.forEach {
            it.comisiones()
            it.intereses()
        }
        println("Realizado el mantenimiento para ${clientes.size} clientes")
    }
}