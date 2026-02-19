package Model

open class CCuentaCorriente(
    nombre: String,
    cuenta: String,
    saldo: Double,
    tipoDeInteres: Double,
    private var importePorTrans: Double,
    private var transExentas: Int
) : CCuenta(nombre, cuenta, saldo, tipoDeInteres) {

    private var transacciones = 0

    fun decrementarTransacciones() { transacciones-- }

    fun asignarImportePorTrans(i: Double) { importePorTrans = i }
    fun obtenerImportePorTrans() = importePorTrans

    fun asignarTransExentas(t: Int) { transExentas = t }
    fun obtenerTransExentas() = transExentas

    override fun ingreso(cantidad: Double) {
        super.ingreso(cantidad)
        transacciones++
    }

    override fun reintegro(cantidad: Double) {
        super.reintegro(cantidad)
        transacciones++
    }

    override fun comisiones() {
        val cobrables = (transacciones - transExentas)
        saldo -= cobrables * importePorTrans
        transacciones = 0
    }

    override fun intereses() {
        val base = if (saldo <= 3000) saldo else 3000.0
        val resto = (saldo - 3000)

        val interesBase = base * 0.005 / 12
        val interesExtra = resto * obtenerTipoDeInteres() / 12

        saldo += interesBase + interesExtra
    }
}