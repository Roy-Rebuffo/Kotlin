package Model

abstract class CCuenta(
    private var nombre: String,
    private var cuenta: String,
    protected var saldo: Double,
    private var tipoDeInteres: Double
) {

    // Getters y setters básicos
    fun asignarNombre(n: String) { nombre = n }
    fun obtenerNombre() = nombre

    fun asignarCuenta(c: String) { cuenta = c }
    fun obtenerCuenta() = cuenta

    fun asignarTipoDeInteres(t: Double) { tipoDeInteres = t }
    fun obtenerTipoDeInteres() = tipoDeInteres

    open fun ingreso(cantidad: Double) {
        saldo += cantidad
    }

    open fun reintegro(cantidad: Double) {
        saldo -= cantidad
    }

    fun estado() = saldo

    // Métodos abstractos
    abstract fun comisiones()
    abstract fun intereses()

    override fun toString(): String {
        return "Nombre: $nombre | Cuenta: $cuenta | Saldo: $saldo"
    }
}